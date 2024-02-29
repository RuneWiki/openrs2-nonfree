package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arc")
public class Class77_Sub39_Sub1 extends Class77_Sub39 {

	@OriginalMember(owner = "client!arc", name = "g", descriptor = "[I")
	static final int[] anIntArray283 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!arc", name = "r", descriptor = "Lclient!aaq;")
	Class16 aClass16_3;

	@OriginalMember(owner = "client!arc", name = "z", descriptor = "I")
	int anInt3021;

	@OriginalMember(owner = "client!arc", name = "<init>", descriptor = "(I)V", line = 11)
	public Class77_Sub39_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!arc", name = "kc", descriptor = "(Lclient!aaq;)V", line = 15)
	public void method22165(@OriginalArg(0) Class16 arg0) {
		this.aClass16_3 = arg0;
	}

	@OriginalMember(owner = "client!arc", name = "kw", descriptor = "(Lclient!aaq;)V", line = 15)
	public void method22166(@OriginalArg(0) Class16 arg0) {
		this.aClass16_3 = arg0;
	}

	@OriginalMember(owner = "client!arc", name = "jm", descriptor = "(Lclient!aaq;I)V", line = 15)
	public void method22167(@OriginalArg(0) Class16 arg0) {
		this.aClass16_3 = arg0;
	}

	@OriginalMember(owner = "client!arc", name = "km", descriptor = "(I)V", line = 19)
	public void method22168(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 + this.aClass16_3.method266());
	}

	@OriginalMember(owner = "client!arc", name = "jq", descriptor = "(II)V", line = 19)
	public void method22169(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 + this.aClass16_3.method266());
	}

	@OriginalMember(owner = "client!arc", name = "kv", descriptor = "()I", line = 23)
	public int method22170() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF;
	}

	@OriginalMember(owner = "client!arc", name = "ju", descriptor = "(I)I", line = 23)
	public int method22171() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF;
	}

	@OriginalMember(owner = "client!arc", name = "kr", descriptor = "()I", line = 23)
	public int method22172() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF;
	}

	@OriginalMember(owner = "client!arc", name = "kf", descriptor = "()I", line = 23)
	public int method22173() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF;
	}

	@OriginalMember(owner = "client!arc", name = "kn", descriptor = "()Z", line = 27)
	public boolean method22174() {
		@Pc(14) int local14 = this.aByteArray53[this.anInt3089 * 31645619] - this.aClass16_3.method267() & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!arc", name = "je", descriptor = "(I)Z", line = 27)
	public boolean method22175() {
		@Pc(14) int local14 = this.aByteArray53[this.anInt3089 * 31645619] - this.aClass16_3.method267() & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!arc", name = "kh", descriptor = "()Z", line = 27)
	public boolean method22176() {
		@Pc(14) int local14 = this.aByteArray53[this.anInt3089 * 31645619] - this.aClass16_3.method267() & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!arc", name = "kx", descriptor = "()Z", line = 27)
	public boolean method22177() {
		@Pc(14) int local14 = this.aByteArray53[this.anInt3089 * 31645619] - this.aClass16_3.method267() & 0xFF;
		return local14 >= 128;
	}

	@OriginalMember(owner = "client!arc", name = "ko", descriptor = "()I", line = 33)
	public int method22178() {
		@Pc(21) int local21 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF);
	}

	@OriginalMember(owner = "client!arc", name = "ka", descriptor = "()I", line = 33)
	public int method22179() {
		@Pc(21) int local21 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF);
	}

	@OriginalMember(owner = "client!arc", name = "kp", descriptor = "()I", line = 33)
	public int method22180() {
		@Pc(21) int local21 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF);
	}

	@OriginalMember(owner = "client!arc", name = "jf", descriptor = "(I)I", line = 33)
	public int method22181() {
		@Pc(21) int local21 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266() & 0xFF);
	}

	@OriginalMember(owner = "client!arc", name = "jj", descriptor = "([BIIB)V", line = 39)
	public void method22182(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[arg1 + local1] = (byte) (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266());
		}
	}

	@OriginalMember(owner = "client!arc", name = "kl", descriptor = "([BII)V", line = 39)
	public void method22183(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[arg1 + local1] = (byte) (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266());
		}
	}

	@OriginalMember(owner = "client!arc", name = "kt", descriptor = "([BII)V", line = 39)
	public void method22184(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[arg1 + local1] = (byte) (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266());
		}
	}

	@OriginalMember(owner = "client!arc", name = "kj", descriptor = "([BII)V", line = 39)
	public void method22185(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			arg0[arg1 + local1] = (byte) (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - this.aClass16_3.method266());
		}
	}

	@OriginalMember(owner = "client!arc", name = "kz", descriptor = "()V", line = 43)
	public void method22186() {
		this.anInt3021 = this.anInt3089 * 1221867880;
	}

	@OriginalMember(owner = "client!arc", name = "jt", descriptor = "(I)V", line = 43)
	public void method22187() {
		this.anInt3021 = this.anInt3089 * 1221867880;
	}

	@OriginalMember(owner = "client!arc", name = "ky", descriptor = "()V", line = 43)
	public void method22188() {
		this.anInt3021 = this.anInt3089 * 1221867880;
	}

	@OriginalMember(owner = "client!arc", name = "ji", descriptor = "(II)I", line = 47)
	public int method22189(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt3021 * 69684831 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3021 * 69684831 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt3021 += arg0 * 437554591;
		while (arg0 > local15) {
			local17 += (this.aByteArray53[local6++] & anIntArray283[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local17 += this.aByteArray53[local6] & anIntArray283[local15];
		} else {
			local17 += this.aByteArray53[local6] >> local15 - arg0 & anIntArray283[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!arc", name = "kd", descriptor = "(I)I", line = 47)
	public int method22190(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt3021 * 69684831 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3021 * 69684831 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt3021 += arg0 * 437554591;
		while (arg0 > local15) {
			local17 += (this.aByteArray53[local6++] & anIntArray283[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local17 += this.aByteArray53[local6] & anIntArray283[local15];
		} else {
			local17 += this.aByteArray53[local6] >> local15 - arg0 & anIntArray283[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!arc", name = "kk", descriptor = "(I)I", line = 47)
	public int method22191(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt3021 * 69684831 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3021 * 69684831 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt3021 += arg0 * 437554591;
		while (arg0 > local15) {
			local17 += (this.aByteArray53[local6++] & anIntArray283[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local17 += this.aByteArray53[local6] & anIntArray283[local15];
		} else {
			local17 += this.aByteArray53[local6] >> local15 - arg0 & anIntArray283[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!arc", name = "kg", descriptor = "(I)V", line = 62)
	public void method22192() {
		this.anInt3089 = (this.anInt3021 * 69684831 + 7) / 8 * -1387468933;
	}

	@OriginalMember(owner = "client!arc", name = "ku", descriptor = "()V", line = 62)
	public void method22193() {
		this.anInt3089 = (this.anInt3021 * 69684831 + 7) / 8 * -1387468933;
	}

	@OriginalMember(owner = "client!arc", name = "ke", descriptor = "()V", line = 62)
	public void method22194() {
		this.anInt3089 = (this.anInt3021 * 69684831 + 7) / 8 * -1387468933;
	}

	@OriginalMember(owner = "client!arc", name = "kq", descriptor = "(II)I", line = 66)
	public int method22195(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3021 * 69684831;
	}

	@OriginalMember(owner = "client!arc", name = "kb", descriptor = "(I)I", line = 66)
	public int method22196(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3021 * 69684831;
	}
}
