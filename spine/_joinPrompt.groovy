def joinPrompt(c, ui, node, msg) {
    def mark = ui.showInputDialog(node.delegate, msg, '')
    joinText(c, node, (mark ? mark : ''))
}