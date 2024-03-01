package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajh")
public class Class132_Sub1_Sub3_Sub1 extends Class132_Sub1_Sub3 implements Interface61 {

	@OriginalMember(owner = "client!ajh", name = "v", descriptor = "Lclient!uq;")
	Class600 aClass600_2;

	@OriginalMember(owner = "client!ajh", name = "o", descriptor = "Z")
	boolean aBoolean283 = true;

	@OriginalMember(owner = "client!ajh", name = "c", descriptor = "Lclient!sp;")
	public Class558 aClass558_1;

	@OriginalMember(owner = "client!ajh", name = "r", descriptor = "Z")
	boolean aBoolean282;

	@OriginalMember(owner = "client!ajh", name = "f", descriptor = "(Lclient!yh;S)V", line = 13)
	public static void method12302(@OriginalArg(0) Interface73 arg0) {
		if (IcmpService_Sub1.anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		IcmpService_Sub1.anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIIIIIILclient!oe;)V", line = 25)
	public Class132_Sub1_Sub3_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) Class458 arg16) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11, arg16);
		this.aClass558_1 = new Class558(arg1, arg2, arg3, arg12, arg13, arg5, this, arg9, arg14, arg15);
		this.aBoolean282 = arg3.anInt5592 * 1067969079 != 0 && !arg9;
		this.method24276(1);
	}

	@OriginalMember(owner = "client!ajh", name = "bu", descriptor = "(B)Z", line = 32)
	@Override
	boolean method24262() {
		return false;
	}

	@OriginalMember(owner = "client!ajh", name = "cf", descriptor = "()Z", line = 32)
	@Override
	boolean method24299() {
		return false;
	}

	@OriginalMember(owner = "client!ajh", name = "co", descriptor = "()Z", line = 32)
	@Override
	boolean method24278() {
		return false;
	}

	@OriginalMember(owner = "client!ajh", name = "cr", descriptor = "()Z", line = 36)
	@Override
	boolean method24279() {
		return this.aBoolean283;
	}

	@OriginalMember(owner = "client!ajh", name = "cq", descriptor = "()Z", line = 36)
	@Override
	boolean method24281() {
		return this.aBoolean283;
	}

	@OriginalMember(owner = "client!ajh", name = "cm", descriptor = "()Z", line = 36)
	@Override
	boolean method24280() {
		return this.aBoolean283;
	}

	@OriginalMember(owner = "client!ajh", name = "bw", descriptor = "(S)Z", line = 36)
	@Override
	boolean method24263() {
		return this.aBoolean283;
	}

	@OriginalMember(owner = "client!ajh", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;", line = 40)
	@Override
	public Class600 method24298(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_2;
	}

	@OriginalMember(owner = "client!ajh", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;", line = 40)
	@Override
	public Class600 method24283(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_2;
	}

	@OriginalMember(owner = "client!ajh", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;", line = 40)
	@Override
	public Class600 method24284(@OriginalArg(0) Class104 arg0) {
		return this.aClass600_2;
	}

	@OriginalMember(owner = "client!ajh", name = "by", descriptor = "(B)I", line = 44)
	@Override
	public int method24289() {
		return this.aClass558_1.method31096();
	}

	@OriginalMember(owner = "client!ajh", name = "ch", descriptor = "()I", line = 44)
	@Override
	public int method24282() {
		return this.aClass558_1.method31096();
	}

	@OriginalMember(owner = "client!ajh", name = "bo", descriptor = "(I)I", line = 48)
	@Override
	public int method24275() {
		return this.aClass558_1.method31070();
	}

	@OriginalMember(owner = "client!ajh", name = "cb", descriptor = "()I", line = 48)
	@Override
	public int method24285() {
		return this.aClass558_1.method31070();
	}

	@OriginalMember(owner = "client!ajh", name = "cs", descriptor = "()I", line = 48)
	@Override
	public int method24286() {
		return this.aClass558_1.method31070();
	}

	@OriginalMember(owner = "client!ajh", name = "cy", descriptor = "()I", line = 48)
	@Override
	public int method24287() {
		return this.aClass558_1.method31070();
	}

	@OriginalMember(owner = "client!ajh", name = "bz", descriptor = "(Lclient!vp;B)V", line = 52)
	public void method12301(@OriginalArg(0) Class620 arg0) {
		this.aClass558_1.method31099(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;", line = 56)
	@Override
	Class573 method24271(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_1.method31072(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class470 local15 = arg0.method20508();
		local15.method29364(this.method24226());
		local15.method29387((float) this.aShort86, 0.0F, (float) this.aShort85);
		@Pc(31) Class458 local31 = this.method24229();
		@Pc(36) Class573 local36 = Class125_Sub1.method9214(this.aBoolean282);
		@Pc(43) int local43 = (int) local31.aClass472_61.aFloat317 >> 9;
		@Pc(50) int local50 = (int) local31.aClass472_61.aFloat319 >> 9;
		this.aClass558_1.method31073(arg0, local8, local15, local43, local43, local50, local50, true);
		@Pc(67) Class610 local67 = this.aClass558_1.method31071();
		if (local67.aClass463_2 == null) {
			local8.method6947(local15, this.aClass241Array21[0], 0);
		} else {
			local8.method6947(local15, null, 0);
			arg0.method20492(local15, this.aClass241Array21[0], local67.aClass463_2);
		}
		if (this.aClass558_1.aClass674_7 != null) {
			@Pc(102) Class229 local102 = this.aClass558_1.aClass674_7.method33127();
			arg0.method20497(local102);
		}
		this.aBoolean283 = local8.method6865() || this.aClass558_1.aClass674_7 != null;
		if (this.aClass600_2 == null) {
			this.aClass600_2 = Class62.method1154((int) local31.aClass472_61.aFloat317, (int) local31.aClass472_61.aFloat318, (int) local31.aClass472_61.aFloat319, local8);
		} else {
			Class554.method31050(this.aClass600_2, (int) local31.aClass472_61.aFloat317, (int) local31.aClass472_61.aFloat318, (int) local31.aClass472_61.aFloat319, local8);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ajh", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;", line = 56)
	@Override
	Class573 method24266(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_1.method31072(arg0, 2048, false, true);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class470 local15 = arg0.method20508();
		local15.method29364(this.method24226());
		local15.method29387((float) this.aShort86, 0.0F, (float) this.aShort85);
		@Pc(31) Class458 local31 = this.method24229();
		@Pc(36) Class573 local36 = Class125_Sub1.method9214(this.aBoolean282);
		@Pc(43) int local43 = (int) local31.aClass472_61.aFloat317 >> 9;
		@Pc(50) int local50 = (int) local31.aClass472_61.aFloat319 >> 9;
		this.aClass558_1.method31073(arg0, local8, local15, local43, local43, local50, local50, true);
		@Pc(67) Class610 local67 = this.aClass558_1.method31071();
		if (local67.aClass463_2 == null) {
			local8.method6947(local15, this.aClass241Array21[0], 0);
		} else {
			local8.method6947(local15, null, 0);
			arg0.method20492(local15, this.aClass241Array21[0], local67.aClass463_2);
		}
		if (this.aClass558_1.aClass674_7 != null) {
			@Pc(102) Class229 local102 = this.aClass558_1.aClass674_7.method33127();
			arg0.method20497(local102);
		}
		this.aBoolean283 = local8.method6865() || this.aClass558_1.aClass674_7 != null;
		if (this.aClass600_2 == null) {
			this.aClass600_2 = Class62.method1154((int) local31.aClass472_61.aFloat317, (int) local31.aClass472_61.aFloat318, (int) local31.aClass472_61.aFloat319, local8);
		} else {
			Class554.method31050(this.aClass600_2, (int) local31.aClass472_61.aFloat317, (int) local31.aClass472_61.aFloat318, (int) local31.aClass472_61.aFloat319, local8);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ajh", name = "fw", descriptor = "(Lclient!dh;I)V", line = 83)
	@Override
	void method24267(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_1.method31072(arg0, 262144, false, true);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class470 local13 = this.method24226();
		@Pc(16) Class458 local16 = this.method24229();
		@Pc(23) int local23 = (int) local16.aClass472_61.aFloat317 >> 9;
		@Pc(30) int local30 = (int) local16.aClass472_61.aFloat319 >> 9;
		this.aClass558_1.method31073(arg0, local8, local13, local23, local23, local30, local30, false);
	}

	@OriginalMember(owner = "client!ajh", name = "fy", descriptor = "(Lclient!dh;)V", line = 83)
	@Override
	void method24294(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_1.method31072(arg0, 262144, false, true);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class470 local13 = this.method24226();
		@Pc(16) Class458 local16 = this.method24229();
		@Pc(23) int local23 = (int) local16.aClass472_61.aFloat317 >> 9;
		@Pc(30) int local30 = (int) local16.aClass472_61.aFloat319 >> 9;
		this.aClass558_1.method31073(arg0, local8, local13, local23, local23, local30, local30, false);
	}

	@OriginalMember(owner = "client!ajh", name = "fe", descriptor = "(Lclient!dh;)V", line = 83)
	@Override
	void method24303(@OriginalArg(0) Class104 arg0) {
		@Pc(8) Class109 local8 = this.aClass558_1.method31072(arg0, 262144, false, true);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class470 local13 = this.method24226();
		@Pc(16) Class458 local16 = this.method24229();
		@Pc(23) int local23 = (int) local16.aClass472_61.aFloat317 >> 9;
		@Pc(30) int local30 = (int) local16.aClass472_61.aFloat319 >> 9;
		this.aClass558_1.method31073(arg0, local8, local13, local23, local23, local30, local30, false);
	}

	@OriginalMember(owner = "client!ajh", name = "fa", descriptor = "(Lclient!dh;IIB)Z", line = 94)
	@Override
	boolean method24259(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class610 local4 = this.aClass558_1.method31071();
		if (local4.aClass463_2 == null) {
			@Pc(26) Class109 local26 = this.aClass558_1.method31072(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6859(arg1, arg2, this.method24226(), false, 0);
		} else {
			return arg0.method20490(arg1, arg2, this.method24226(), local4.aClass463_2);
		}
	}

	@OriginalMember(owner = "client!ajh", name = "fk", descriptor = "(Lclient!dh;II)Z", line = 94)
	@Override
	boolean method24290(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class610 local4 = this.aClass558_1.method31071();
		if (local4.aClass463_2 == null) {
			@Pc(26) Class109 local26 = this.aClass558_1.method31072(arg0, 131072, false, false);
			return local26 == null ? false : local26.method6859(arg1, arg2, this.method24226(), false, 0);
		} else {
			return arg0.method20490(arg1, arg2, this.method24226(), local4.aClass463_2);
		}
	}

	@OriginalMember(owner = "client!ajh", name = "e", descriptor = "(I)I", line = 102)
	@Override
	public int method13423() {
		return this.aClass558_1.anInt5324 * 1228794785;
	}

	@OriginalMember(owner = "client!ajh", name = "z", descriptor = "()I", line = 102)
	@Override
	public int method13410() {
		return this.aClass558_1.anInt5324 * 1228794785;
	}

	@OriginalMember(owner = "client!ajh", name = "p", descriptor = "()I", line = 102)
	@Override
	public int method13411() {
		return this.aClass558_1.anInt5324 * 1228794785;
	}

	@OriginalMember(owner = "client!ajh", name = "d", descriptor = "()I", line = 106)
	@Override
	public int method13403() {
		return this.aClass558_1.anInt5325 * -989891395;
	}

	@OriginalMember(owner = "client!ajh", name = "n", descriptor = "(I)I", line = 106)
	@Override
	public int method13420() {
		return this.aClass558_1.anInt5325 * -989891395;
	}

	@OriginalMember(owner = "client!ajh", name = "m", descriptor = "(I)I", line = 110)
	@Override
	public int method13404() {
		return this.aClass558_1.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajh", name = "c", descriptor = "()I", line = 110)
	@Override
	public int method13413() {
		return this.aClass558_1.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajh", name = "v", descriptor = "()I", line = 110)
	@Override
	public int method13412() {
		return this.aClass558_1.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajh", name = "o", descriptor = "()I", line = 110)
	@Override
	public int method13414() {
		return this.aClass558_1.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajh", name = "r", descriptor = "()I", line = 110)
	@Override
	public int method13416() {
		return this.aClass558_1.anInt5326 * -922764575;
	}

	@OriginalMember(owner = "client!ajh", name = "k", descriptor = "(I)V", line = 113)
	@Override
	public void method13405() {
	}

	@OriginalMember(owner = "client!ajh", name = "i", descriptor = "()V", line = 113)
	@Override
	public void method13425() {
	}

	@OriginalMember(owner = "client!ajh", name = "j", descriptor = "()V", line = 113)
	@Override
	public void method13426() {
	}

	@OriginalMember(owner = "client!ajh", name = "w", descriptor = "(B)Z", line = 116)
	@Override
	public boolean method13407() {
		return true;
	}

	@OriginalMember(owner = "client!ajh", name = "t", descriptor = "()Z", line = 116)
	@Override
	public boolean method13427() {
		return true;
	}

	@OriginalMember(owner = "client!ajh", name = "f", descriptor = "(I)Z", line = 120)
	@Override
	public boolean method13406() {
		return this.aClass558_1.method31074();
	}

	@OriginalMember(owner = "client!ajh", name = "s", descriptor = "()Z", line = 120)
	@Override
	public boolean method13415() {
		return this.aClass558_1.method31074();
	}

	@OriginalMember(owner = "client!ajh", name = "l", descriptor = "(Lclient!dh;B)V", line = 124)
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31075(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "y", descriptor = "(Lclient!dh;)V", line = 124)
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31075(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "x", descriptor = "(Lclient!dh;)V", line = 124)
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31075(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "b", descriptor = "(Lclient!dh;)V", line = 124)
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31075(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "q", descriptor = "(Lclient!dh;)V", line = 124)
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31075(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "a", descriptor = "(Lclient!dh;)V", line = 128)
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31076(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "g", descriptor = "(Lclient!dh;)V", line = 128)
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31076(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "h", descriptor = "(Lclient!dh;)V", line = 128)
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31076(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "u", descriptor = "(Lclient!dh;B)V", line = 128)
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0) {
		this.aClass558_1.method31076(arg0);
	}

	@OriginalMember(owner = "client!ajh", name = "a", descriptor = "(I)V", line = 266)
	static void method12304() {
		client.aClass175_1.method24355();
		if (Class676.anInt5883 * -1667786339 < 2) {
			Class50.aClass28_2.method593();
			Class676.anInt5885 = 0;
			Class676.anInt5883 += -643386187;
			Class588.aClass588_3 = Class588.aClass588_1;
		} else {
			Class588.aClass588_3 = null;
			Class676.aClass709_1 = Class709.aClass709_6;
			Class481.method29756(4);
		}
	}

	@OriginalMember(owner = "client!ajh", name = "ass", descriptor = "(Lclient!yf;B)V", line = 13214)
	static final void method12303(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local12 != Class51.aClass93_Sub36_1.aClass166_Sub29_1.method16058()) {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, local12);
			Class106_Sub1.method5148();
			client.aBoolean601 = false;
		}
	}
}
