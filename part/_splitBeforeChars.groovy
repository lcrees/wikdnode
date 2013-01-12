import org.apache.commons.lang.StringUtils as SU

def mark = ui.showInputDialog(node.delegate, 'Enter characters to split node text before...', '')

c.selecteds.every { ts ->
	ts.plainText.split('(?=' + (mark ? mark : '') + ')').collect {
		SU.trim(it)
	}.eachWithIndex {
		txt, idx ->
		if (idx == 0)
			ts.text = txt
		ts.createChild(txt)
	}
}