import top.cardone.core.util.action.Action0

class SystemExitAction implements Action0 {
    @Override
    void action() {
        System.exit(0)
    }
}