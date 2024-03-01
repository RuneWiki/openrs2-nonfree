package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "g", descriptor = "I")
	private int anInt3964;

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "g", descriptor = "([BIII)V", line = 13)
	@Override
	public void g(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3964 * -21306351 == 0) {
			throw new RuntimeException();
		}
		super.g(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "l", descriptor = "([BIII)V", line = 13)
	@Override
	public void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3964 * -21306351 == 0) {
			throw new RuntimeException();
		}
		super.g(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "h", descriptor = "([BIII)V", line = 13)
	@Override
	public void h(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3964 * -21306351 == 0) {
			throw new RuntimeException();
		}
		super.g(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "x", descriptor = "([BIII)V", line = 13)
	@Override
	public void x(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3964 * -21306351 == 0) {
			throw new RuntimeException();
		}
		super.g(arg0, arg1, arg2, arg3);
	}
}
