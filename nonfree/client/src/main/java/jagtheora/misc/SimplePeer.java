package jagtheora.misc;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/misc/SimplePeer")
public abstract class SimplePeer {

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "peer", descriptor = "J")
	private long peer;

	static {
		init();
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "<init>", descriptor = "()V", line = 15)
	protected SimplePeer() {
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "p", descriptor = "()Z", line = 21)
	public final boolean method25191() {
		return this.peer == 0L;
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "g", descriptor = "()Z", line = 21)
	public final boolean method25195() {
		return this.peer == 0L;
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "l", descriptor = "()Z", line = 21)
	public final boolean method25196() {
		return this.peer == 0L;
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "setPeer", descriptor = "(J)V", line = 26)
	private final void method25192(@OriginalArg(0) long arg0) {
		this.peer = arg0;
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "a", descriptor = "()V", line = 30)
	public final void method25193() {
		if (!this.method25191()) {
			this.clear();
		}
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "finalize", descriptor = "()V", line = 38)
	@Override
	protected void finalize() throws Throwable {
		if (!this.method25191()) {
			this.method25193();
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "hh", descriptor = "()V", line = 38)
	protected void method25194() throws Throwable {
		if (!this.method25191()) {
			this.method25193();
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "init", descriptor = "()V")
	private static native void init();

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "clear", descriptor = "()V")
	protected abstract void clear();

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "h", descriptor = "()V")
	protected abstract void h();

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "x", descriptor = "()V")
	protected abstract void x();
}
