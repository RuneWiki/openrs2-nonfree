package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public class Class430 implements Interface47 {

	@OriginalMember(owner = "client!rg", name = "fx", descriptor = "Lclient!ny;")
	public static Class359 aClass359_74;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "Lclient!ym;")
	final Class603 aClass603_1;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Ljava/lang/String;")
	final String aString220;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	final int anInt4863;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Ljava/lang/String;")
	final String aString221;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!ym;Ljava/lang/String;ILjava/lang/Throwable;)V", line = 105)
	Class430(@OriginalArg(0) Class603 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		this.aClass603_1 = arg0;
		this.aString220 = arg1;
		this.anInt4863 = arg2 * -1976993763;
		this.aString221 = arg3 == null ? null : arg3.getMessage();
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "()V", line = 113)
	@Override
	public void method28243() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_60, client.aClass82_2.aClass577_2);
		@Pc(16) int local16 = (local5.aClass3_Sub41_Sub1_1.anInt2803 += -918980331) * 62066237;
		local5.aClass3_Sub41_Sub1_1.method20250(this.aClass603_1.method33765());
		local5.aClass3_Sub41_Sub1_1.method20260(this.aString220);
		local5.aClass3_Sub41_Sub1_1.method20251(this.anInt4863 * 1582107189);
		local5.aClass3_Sub41_Sub1_1.method20260(Class377.aString213);
		if (this.aString221 == null) {
			local5.aClass3_Sub41_Sub1_1.method20250(0);
		} else {
			local5.aClass3_Sub41_Sub1_1.method20250(1);
			@Pc(55) String local55 = this.aString221;
			if (local55.length() > 100) {
				local55 = local55.substring(0, 100);
			}
			local5.aClass3_Sub41_Sub1_1.method20260(local55);
		}
		local5.aClass3_Sub41_Sub1_1.method20266(local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local16);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "(B)V", line = 113)
	@Override
	public void method28244() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_60, client.aClass82_2.aClass577_2);
		@Pc(16) int local16 = (local5.aClass3_Sub41_Sub1_1.anInt2803 += -918980331) * 62066237;
		local5.aClass3_Sub41_Sub1_1.method20250(this.aClass603_1.method33765());
		local5.aClass3_Sub41_Sub1_1.method20260(this.aString220);
		local5.aClass3_Sub41_Sub1_1.method20251(this.anInt4863 * 1582107189);
		local5.aClass3_Sub41_Sub1_1.method20260(Class377.aString213);
		if (this.aString221 == null) {
			local5.aClass3_Sub41_Sub1_1.method20250(0);
		} else {
			local5.aClass3_Sub41_Sub1_1.method20250(1);
			@Pc(55) String local55 = this.aString221;
			if (local55.length() > 100) {
				local55 = local55.substring(0, 100);
			}
			local5.aClass3_Sub41_Sub1_1.method20260(local55);
		}
		local5.aClass3_Sub41_Sub1_1.method20266(local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local16);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "()V", line = 113)
	@Override
	public void method28242() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_60, client.aClass82_2.aClass577_2);
		@Pc(16) int local16 = (local5.aClass3_Sub41_Sub1_1.anInt2803 += -918980331) * 62066237;
		local5.aClass3_Sub41_Sub1_1.method20250(this.aClass603_1.method33765());
		local5.aClass3_Sub41_Sub1_1.method20260(this.aString220);
		local5.aClass3_Sub41_Sub1_1.method20251(this.anInt4863 * 1582107189);
		local5.aClass3_Sub41_Sub1_1.method20260(Class377.aString213);
		if (this.aString221 == null) {
			local5.aClass3_Sub41_Sub1_1.method20250(0);
		} else {
			local5.aClass3_Sub41_Sub1_1.method20250(1);
			@Pc(55) String local55 = this.aString221;
			if (local55.length() > 100) {
				local55 = local55.substring(0, 100);
			}
			local5.aClass3_Sub41_Sub1_1.method20260(local55);
		}
		local5.aClass3_Sub41_Sub1_1.method20266(local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local16);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "()V", line = 113)
	@Override
	public void method28241() {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_60, client.aClass82_2.aClass577_2);
		@Pc(16) int local16 = (local5.aClass3_Sub41_Sub1_1.anInt2803 += -918980331) * 62066237;
		local5.aClass3_Sub41_Sub1_1.method20250(this.aClass603_1.method33765());
		local5.aClass3_Sub41_Sub1_1.method20260(this.aString220);
		local5.aClass3_Sub41_Sub1_1.method20251(this.anInt4863 * 1582107189);
		local5.aClass3_Sub41_Sub1_1.method20260(Class377.aString213);
		if (this.aString221 == null) {
			local5.aClass3_Sub41_Sub1_1.method20250(0);
		} else {
			local5.aClass3_Sub41_Sub1_1.method20250(1);
			@Pc(55) String local55 = this.aString221;
			if (local55.length() > 100) {
				local55 = local55.substring(0, 100);
			}
			local5.aClass3_Sub41_Sub1_1.method20260(local55);
		}
		local5.aClass3_Sub41_Sub1_1.method20266(local5.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local16);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!rg", name = "qm", descriptor = "(Lclient!vs;I)V", line = 7058)
	static final void method27942(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class5.method745(local16, arg0);
	}

	@OriginalMember(owner = "client!rg", name = "act", descriptor = "(Lclient!vs;I)V", line = 9189)
	static final void method27939(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class44_Sub3.aClass596_1.method33435(local12).aBoolean843 ? 1 : 0;
	}

	@OriginalMember(owner = "client!rg", name = "agb", descriptor = "(Lclient!vs;I)V", line = 10214)
	static final void method27941(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 == 0) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class58_Sub1.aBoolean320 ? 1 : 0;
		} else if (local12 == 1) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class58_Sub1.aBoolean321 ? 1 : 0;
		} else if (local12 == 2) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class58_Sub1.aBoolean322 ? 1 : 0;
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rg", name = "alo", descriptor = "(Lclient!vs;I)V", line = 11121)
	static final void method27940(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= -1924925971;
		arg0.anInt5319 -= 624249098;
		Class540.method32580((String) arg0.anObjectArray42[arg0.anInt5315 * 996806575], (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1], arg0.anIntArray496[arg0.anInt5319 * 960738381], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1, (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 2]);
	}
}
