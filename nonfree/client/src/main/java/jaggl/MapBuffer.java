package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "v", descriptor = "I")
	private int anInt4266;

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "v", descriptor = "([BIII)V", line = 13)
	@Override
	public void v(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4266 * -1031508231 == 0) {
			throw new RuntimeException();
		}
		super.v(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "l", descriptor = "([BIII)V", line = 13)
	@Override
	public void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4266 * -1031508231 == 0) {
			throw new RuntimeException();
		}
		super.v(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "y", descriptor = "([BIII)V", line = 13)
	@Override
	public void y(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4266 * -1031508231 == 0) {
			throw new RuntimeException();
		}
		super.v(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "w", descriptor = "([BIII)V", line = 13)
	@Override
	public void w(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4266 * -1031508231 == 0) {
			throw new RuntimeException();
		}
		super.v(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "t", descriptor = "([BIII)V", line = 13)
	@Override
	public void t(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4266 * -1031508231 == 0) {
			throw new RuntimeException();
		}
		super.v(arg0, arg1, arg2, arg3);
	}
}
