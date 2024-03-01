package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!and")
public class Class3_Sub41_Sub1 extends Class3_Sub41 {

	@OriginalMember(owner = "client!and", name = "j", descriptor = "[I")
	static final int[] anIntArray267 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!and", name = "n", descriptor = "I")
	int anInt2719;

	@OriginalMember(owner = "client!and", name = "z", descriptor = "Lclient!xj;")
	Class577 aClass577_1;

	@OriginalMember(owner = "client!and", name = "<init>", descriptor = "(I)V", line = 11)
	public Class3_Sub41_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!and", name = "ir", descriptor = "(Lclient!xj;I)V", line = 15)
	public void method19823(@OriginalArg(0) Class577 arg0) {
		this.aClass577_1 = arg0;
	}

	@OriginalMember(owner = "client!and", name = "iy", descriptor = "(Lclient!xj;)V", line = 15)
	public void method19829(@OriginalArg(0) Class577 arg0) {
		this.aClass577_1 = arg0;
	}

	@OriginalMember(owner = "client!and", name = "ig", descriptor = "(II)V", line = 19)
	public void method19821(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + this.aClass577_1.method33159());
	}

	@OriginalMember(owner = "client!and", name = "is", descriptor = "()Z", line = 23)
	public boolean method19822() {
		@Pc(14) int local14 = this.aByteArray51[this.anInt2803 * 62066237] - this.aClass577_1.method33160() & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!and", name = "it", descriptor = "()Z", line = 23)
	public boolean method19831() {
		@Pc(14) int local14 = this.aByteArray51[this.anInt2803 * 62066237] - this.aClass577_1.method33160() & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!and", name = "ip", descriptor = "(I)Z", line = 23)
	public boolean method19839() {
		@Pc(14) int local14 = this.aByteArray51[this.anInt2803 * 62066237] - this.aClass577_1.method33160() & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!and", name = "ii", descriptor = "()I", line = 29)
	public int method19820() {
		@Pc(21) int local21 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - this.aClass577_1.method33159() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - this.aClass577_1.method33159() & 0xFF);
	}

	@OriginalMember(owner = "client!and", name = "ix", descriptor = "(B)I", line = 29)
	public int method19832() {
		@Pc(21) int local21 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - this.aClass577_1.method33159() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - this.aClass577_1.method33159() & 0xFF);
	}

	@OriginalMember(owner = "client!and", name = "iw", descriptor = "()I", line = 29)
	public int method19835() {
		@Pc(21) int local21 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - this.aClass577_1.method33159() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - this.aClass577_1.method33159() & 0xFF);
	}

	@OriginalMember(owner = "client!and", name = "in", descriptor = "([BIII)V", line = 35)
	public void method19830(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[arg1 + local1] = (byte) (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - this.aClass577_1.method33159());
		}
	}

	@OriginalMember(owner = "client!and", name = "ia", descriptor = "(I)V", line = 39)
	public void method19824() {
		this.anInt2719 = this.anInt2803 * -1242412536;
	}

	@OriginalMember(owner = "client!and", name = "iv", descriptor = "()V", line = 39)
	public void method19833() {
		this.anInt2719 = this.anInt2803 * -1242412536;
	}

	@OriginalMember(owner = "client!and", name = "iz", descriptor = "()V", line = 39)
	public void method19834() {
		this.anInt2719 = this.anInt2803 * -1242412536;
	}

	@OriginalMember(owner = "client!and", name = "ih", descriptor = "(II)I", line = 43)
	public int method19825(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt2719 * -430347779 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt2719 * -430347779 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt2719 += arg0 * -961234091;
		while (arg0 > local15) {
			local17 += (this.aByteArray51[local6++] & anIntArray267[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (local15 == arg0) {
			local17 += this.aByteArray51[local6] & anIntArray267[local15];
		} else {
			local17 += this.aByteArray51[local6] >> local15 - arg0 & anIntArray267[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!and", name = "io", descriptor = "(I)I", line = 43)
	public int method19828(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt2719 * -430347779 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt2719 * -430347779 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt2719 += arg0 * -961234091;
		while (arg0 > local15) {
			local17 += (this.aByteArray51[local6++] & anIntArray267[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (local15 == arg0) {
			local17 += this.aByteArray51[local6] & anIntArray267[local15];
		} else {
			local17 += this.aByteArray51[local6] >> local15 - arg0 & anIntArray267[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!and", name = "if", descriptor = "(I)V", line = 58)
	public void method19826() {
		this.anInt2803 = (this.anInt2719 * -430347779 + 7) / 8 * -918980331;
	}

	@OriginalMember(owner = "client!and", name = "ie", descriptor = "()V", line = 58)
	public void method19836() {
		this.anInt2803 = (this.anInt2719 * -430347779 + 7) / 8 * -918980331;
	}

	@OriginalMember(owner = "client!and", name = "ic", descriptor = "()V", line = 58)
	public void method19837() {
		this.anInt2803 = (this.anInt2719 * -430347779 + 7) / 8 * -918980331;
	}

	@OriginalMember(owner = "client!and", name = "jn", descriptor = "(I)I", line = 62)
	public int method19819(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2719 * -430347779;
	}

	@OriginalMember(owner = "client!and", name = "ij", descriptor = "(II)I", line = 62)
	public int method19827(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2719 * -430347779;
	}

	@OriginalMember(owner = "client!and", name = "je", descriptor = "(I)I", line = 62)
	public int method19838(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2719 * -430347779;
	}
}
