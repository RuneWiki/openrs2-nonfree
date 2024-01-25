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

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "init", descriptor = "()V")
	protected static native void init();

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (!this.a()) {
			this.b();
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "a", descriptor = "()Z")
	public final boolean a() {
		return this.peer == 0L;
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "setPeer", descriptor = "(J)V")
	private void setPeer(@OriginalArg(0) long arg0) {
		this.peer = arg0;
	}

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "clear", descriptor = "()V")
	protected abstract void clear();

	@OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "b", descriptor = "()V")
	public final void b() {
		if (!this.a()) {
			this.clear();
		}
	}
}
