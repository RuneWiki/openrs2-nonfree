package a;

import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mudclient!a/d")
public final class Class10 {

	@OriginalMember(owner = "mudclient!a/d", name = "c", descriptor = "Ljava/util/zip/CRC32;")
	private static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "mudclient!a/d", name = "d", descriptor = "[I")
	private static final int[] anIntArray94 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "mudclient!a/d", name = "a", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "mudclient!a/d", name = "b", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "mudclient!a/d", name = "<init>", descriptor = "()V")
	private Class10() {
	}

	@OriginalMember(owner = "mudclient!a/d", name = "<init>", descriptor = "([B)V")
	public Class10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray16 = arg0;
		this.anInt271 = 0;
	}

	@OriginalMember(owner = "mudclient!a/d", name = "a", descriptor = "()I")
	public int method299() {
		return this.aByteArray16[this.anInt271++] & 0xFF;
	}

	@OriginalMember(owner = "mudclient!a/d", name = "b", descriptor = "()I")
	public int method300() {
		this.anInt271 += 2;
		return ((this.aByteArray16[this.anInt271 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt271 - 1] & 0xFF);
	}

	@OriginalMember(owner = "mudclient!a/d", name = "c", descriptor = "()I")
	public int method301() {
		this.anInt271 += 4;
		return ((this.aByteArray16[this.anInt271 - 4] & 0xFF) << 24) + ((this.aByteArray16[this.anInt271 - 3] & 0xFF) << 16) + ((this.aByteArray16[this.anInt271 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt271 - 1] & 0xFF);
	}
}
