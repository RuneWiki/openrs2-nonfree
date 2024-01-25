package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/jfa")
public class jfa extends Peer {

	@OriginalMember(owner = "client!jaclib/peer/jfa", name = "<init>", descriptor = "(Lclient!jaclib/peer/vo;)V")
	public jfa(@OriginalArg(0) vo arg0) {
		this.reference = new NativeHeapPeerReference(this, arg0);
	}
}
