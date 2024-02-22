package a.a;

import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.audio.AudioPlayer;

@OriginalClass("mudclient!a/a/d")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "mudclient!a/a/d", name = "a", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "mudclient!a/a/d", name = "b", descriptor = "I")
	private int anInt51;

	@OriginalMember(owner = "mudclient!a/a/d", name = "c", descriptor = "I")
	private int anInt52;

	@OriginalMember(owner = "mudclient!a/a/d", name = "<init>", descriptor = "()V")
	public InputStream_Sub1() {
		AudioPlayer.player.start(this);
	}

	@OriginalMember(owner = "mudclient!a/a/d", name = "a", descriptor = "()V")
	public void method69() {
		AudioPlayer.player.stop(this);
	}

	@OriginalMember(owner = "mudclient!a/a/d", name = "a", descriptor = "([BII)V")
	public void method70(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray2 = arg0;
		this.anInt51 = arg1;
		this.anInt52 = arg1 + arg2;
	}

	@OriginalMember(owner = "mudclient!a/a/d", name = "read", descriptor = "([BII)I")
	@Override
	public int read(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < arg2; local3++) {
			if (this.anInt51 < this.anInt52) {
				arg0[arg1 + local3] = this.aByteArray2[this.anInt51++];
			} else {
				arg0[arg1 + local3] = -1;
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "mudclient!a/a/d", name = "read", descriptor = "()I")
	@Override
	public int read() {
		@Pc(2) byte[] local2 = new byte[1];
		this.read(local2, 0, 1);
		return local2[0];
	}
}
