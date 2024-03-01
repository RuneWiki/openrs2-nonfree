package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public class Class374 {

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	static final int anInt4598 = 4;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	static final int anInt4599 = 1;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
	static final int anInt4600 = 5;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
	static final int anInt4601 = 3;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	static final int anInt4602 = 2;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "J")
	long aLong263;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "J")
	long aLong264 = 1909394539023591297L;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!aat;")
	Class22 aClass22_52 = new Class22();

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!alw;)V", line = 17)
	public Class374(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method28026(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(Lclient!alw;I)V", line = 22)
	void method28026(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aLong263 = arg0.method22423() * -5428801191899480245L;
		this.aLong264 = arg0.method22423() * -1909394539023591297L;
		for (@Pc(17) int local17 = arg0.method22413(); local17 != 0; local17 = arg0.method22413()) {
			@Pc(28) Class93_Sub31 local28;
			if (local17 == 1) {
				local28 = new Class93_Sub31_Sub5(this);
			} else if (local17 == 4) {
				local28 = new Class93_Sub31_Sub1(this);
			} else if (local17 == 3) {
				local28 = new Class93_Sub31_Sub3(this);
			} else if (local17 == 2) {
				local28 = new Class93_Sub31_Sub2(this);
			} else if (local17 == 5) {
				local28 = new Class93_Sub31_Sub4(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method22011(arg0);
			this.aClass22_52.method407(local28);
		}
	}

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "(Lclient!alw;)V", line = 22)
	void method28027(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aLong263 = arg0.method22423() * -5428801191899480245L;
		this.aLong264 = arg0.method22423() * -1909394539023591297L;
		for (@Pc(17) int local17 = arg0.method22413(); local17 != 0; local17 = arg0.method22413()) {
			@Pc(28) Class93_Sub31 local28;
			if (local17 == 1) {
				local28 = new Class93_Sub31_Sub5(this);
			} else if (local17 == 4) {
				local28 = new Class93_Sub31_Sub1(this);
			} else if (local17 == 3) {
				local28 = new Class93_Sub31_Sub3(this);
			} else if (local17 == 2) {
				local28 = new Class93_Sub31_Sub2(this);
			} else if (local17 == 5) {
				local28 = new Class93_Sub31_Sub4(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method22011(arg0);
			this.aClass22_52.method407(local28);
		}
	}

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "(Lclient!akr;B)V", line = 40)
	public void method28025(@OriginalArg(0) Class93_Sub28 arg0) {
		if (this.aLong263 * -8966225610675334557L != arg0.aLong232 * -3750704643647536275L || arg0.aLong89 * 2544502113182261825L != this.aLong264 * -2525066851661502593L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class93_Sub31 local30 = (Class93_Sub31) this.aClass22_52.method445(); local30 != null; local30 = (Class93_Sub31) this.aClass22_52.method415()) {
			local30.method22007(arg0);
		}
		arg0.aLong89 += -8713487650679722559L;
	}

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "(Lclient!akr;)V", line = 40)
	public void method28028(@OriginalArg(0) Class93_Sub28 arg0) {
		if (this.aLong263 * -8966225610675334557L != arg0.aLong232 * -3750704643647536275L || arg0.aLong89 * 2544502113182261825L != this.aLong264 * -2525066851661502593L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class93_Sub31 local30 = (Class93_Sub31) this.aClass22_52.method445(); local30 != null; local30 = (Class93_Sub31) this.aClass22_52.method415()) {
			local30.method22007(arg0);
		}
		arg0.aLong89 += -8713487650679722559L;
	}

	@OriginalMember(owner = "client!kc", name = "hf", descriptor = "(Lclient!yf;I)V", line = 6311)
	static final void method28029(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class12.method188(local11, local14, false, 1, arg0);
	}

	@OriginalMember(owner = "client!kc", name = "aev", descriptor = "(Lclient!yf;I)V", line = 10295)
	static final void method28030(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (local13 == 0) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) Math.pow((double) local13, (double) local23);
		}
	}

	@OriginalMember(owner = "client!kc", name = "aey", descriptor = "(Lclient!yf;I)V", line = 10303)
	static final void method28031(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (local13 == 0 || local23 == 0) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
			return;
		}
		switch(local23) {
			case 1:
				arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13;
				return;
			case 2:
				arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) Math.sqrt((double) local13);
				return;
			case 3:
				arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) Math.cbrt((double) local13);
				return;
			case 4:
				arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) Math.sqrt(Math.sqrt((double) local13));
				return;
			default:
				arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) Math.pow((double) local13, 1.0D / (double) local23);
		}
	}
}
