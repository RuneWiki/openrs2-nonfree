package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public class Class60_Sub7 extends Class60 {

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "I")
	public static final int anInt1845 = 2;

	@OriginalMember(owner = "client!aia", name = "x", descriptor = "I")
	public static final int anInt1846 = 0;

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "I")
	public static final int anInt1847 = 1;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lclient!aht;)V", line = 12)
	public Class60_Sub7(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(ILclient!aht;)V", line = 16)
	public Class60_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "()V", line = 20)
	public void method13278() {
		if (this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() == 0) {
			this.anInt2079 = 0;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aia", name = "v", descriptor = "(I)V", line = 20)
	public void method13282() {
		if (this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() == 0) {
			this.anInt2079 = 0;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "()V", line = 20)
	public void method13284() {
		if (this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() == 0) {
			this.anInt2079 = 0;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aia", name = "y", descriptor = "()I", line = 25)
	@Override
	int method14606() {
		return 2;
	}

	@OriginalMember(owner = "client!aia", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method14603() {
		return 2;
	}

	@OriginalMember(owner = "client!aia", name = "h", descriptor = "()I", line = 25)
	@Override
	int method14602() {
		return 2;
	}

	@OriginalMember(owner = "client!aia", name = "x", descriptor = "()I", line = 25)
	@Override
	int method14607() {
		return 2;
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "()I", line = 25)
	@Override
	int method14615() {
		return 2;
	}

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "()I", line = 25)
	@Override
	int method14604() {
		return 2;
	}

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "()I", line = 25)
	@Override
	int method14605() {
		return 2;
	}

	@OriginalMember(owner = "client!aia", name = "t", descriptor = "(B)Z", line = 29)
	public boolean method13279() {
		return this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() != 0;
	}

	@OriginalMember(owner = "client!aia", name = "af", descriptor = "()Z", line = 29)
	public boolean method13283() {
		return this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() != 0;
	}

	@OriginalMember(owner = "client!aia", name = "at", descriptor = "()Z", line = 29)
	public boolean method13285() {
		return this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() != 0;
	}

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "()Z", line = 29)
	public boolean method13286() {
		return this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() != 0;
	}

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "()Z", line = 29)
	public boolean method13287() {
		return this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() != 0;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB)I", line = 34)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!aia", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(I)I", line = 34)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "(IB)V", line = 39)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "(I)V", line = 39)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "(I)V", line = 39)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aia", name = "w", descriptor = "(I)I", line = 43)
	public int method13280() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aia", name = "ak", descriptor = "()I", line = 43)
	public int method13281() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aia", name = "aa", descriptor = "()I", line = 43)
	public int method13288() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "([BIIB)Ljava/lang/String;", line = 160)
	public static String method13289(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = arg0[arg1 + local6] & 0xFF;
			if (local17 != 0) {
				if (local17 >= 128 && local17 < 160) {
					@Pc(33) char local33 = Class535.aCharArray5[local17 - 128];
					if (local33 == 0) {
						local33 = '?';
					}
					local17 = local33;
				}
				local2[local4++] = (char) local17;
			}
		}
		return new String(local2, 0, local4);
	}
}
