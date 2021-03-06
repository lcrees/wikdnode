// @CacheScriptContent(true)
// @ExecutionModes({ON_SINGLE_NODE})

import java.util.regex.Pattern

import org.hardknots.wikd.wikdnode.WikdNode

def mark = ui.showInputDialog(
	node.delegate, 'Enter characters to delete from text end:', ''
)

if (mark) {
	WikdNode.stripPlain(Pattern.quote(mark) + '{1}$')
}
