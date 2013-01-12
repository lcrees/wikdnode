// @CacheScriptContent(true)
// @ExecutionModes({ON_SINGLE_NODE})
import org.apache.commons.lang.StringUtils as SU

def splitText(String mark) {
	c.selecteds.every { ts ->
		SU.split(ts.plainText, mark).collect { SU.trim(it) }.eachWithIndex {
			txt, idx ->
			if (idx == 0)
    			ts.text = txt
			ts.createChild(txt)
		}
	}
}

splitText(' ')