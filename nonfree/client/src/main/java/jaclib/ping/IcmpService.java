package jaclib.ping;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/ping/IcmpService")
public abstract class IcmpService implements Runnable {

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "<init>", descriptor = "()V", line = 9)
	protected IcmpService() {
	}

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "notify", descriptor = "(I)V")
	protected abstract void notify(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "notify", descriptor = "(III)V")
	protected abstract void notify(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "run", descriptor = "()V")
	public native void run();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "quit", descriptor = "()V")
	protected native void quit();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "available", descriptor = "()Z")
	public static native boolean available();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "j", descriptor = "()V")
	public native void j();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "n", descriptor = "()V")
	public native void n();

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "p", descriptor = "(I)V")
	protected abstract void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "a", descriptor = "(I)V")
	protected abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "g", descriptor = "(I)V")
	protected abstract void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/ping/IcmpService", name = "l", descriptor = "(III)V")
	protected abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
