package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ang")
public class Class149_Sub3 extends Class149 {

	@OriginalMember(owner = "client!ang", name = "l", descriptor = "I")
	static int anInt2360 = 0;

	@OriginalMember(owner = "client!ang", name = "y", descriptor = "I")
	static int anInt2361 = 0;

	@OriginalMember(owner = "client!ang", name = "w", descriptor = "I")
	static int anInt2363 = 0;

	@OriginalMember(owner = "client!ang", name = "t", descriptor = "I")
	static int anInt2362 = 0;

	@OriginalMember(owner = "client!ang", name = "q", descriptor = "F")
	static float aFloat158 = -1.0F;

	@OriginalMember(owner = "client!ang", name = "x", descriptor = "F")
	static float aFloat159 = -1.0F;

	@OriginalMember(owner = "client!ang", name = "d", descriptor = "F")
	static float aFloat160 = -1.0F;

	@OriginalMember(owner = "client!ang", name = "s", descriptor = "F")
	static float aFloat155 = -1.0F;

	@OriginalMember(owner = "client!ang", name = "r", descriptor = "F")
	static float aFloat156 = -1.0F;

	@OriginalMember(owner = "client!ang", name = "g", descriptor = "F")
	static float aFloat157 = -1.0F;

	@OriginalMember(owner = "client!ang", name = "c", descriptor = "Lclient!ot;")
	final Class452 aClass452_4 = new Class452();

	@OriginalMember(owner = "client!ang", name = "v", descriptor = "Lclient!ot;")
	final Class452 aClass452_3 = new Class452(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ang", name = "<init>", descriptor = "(Lclient!im;)V", line = 31)
	public Class149_Sub3(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ang", name = "u", descriptor = "(Lclient!ot;B)V", line = 35)
	public void method16715(@OriginalArg(0) Class452 arg0) {
		this.aClass452_3.aFloat284 = arg0.aFloat284;
		this.aClass452_3.aFloat286 = arg0.aFloat286;
		this.aClass452_3.aFloat285 = arg0.aFloat285;
		this.aClass452_3.aFloat283 = arg0.aFloat283;
		this.aClass452_4.method29286(this.aClass452_3);
	}

	@OriginalMember(owner = "client!ang", name = "aj", descriptor = "(Lclient!ot;)V", line = 35)
	public void method16716(@OriginalArg(0) Class452 arg0) {
		this.aClass452_3.aFloat284 = arg0.aFloat284;
		this.aClass452_3.aFloat286 = arg0.aFloat286;
		this.aClass452_3.aFloat285 = arg0.aFloat285;
		this.aClass452_3.aFloat283 = arg0.aFloat283;
		this.aClass452_4.method29286(this.aClass452_3);
	}

	@OriginalMember(owner = "client!ang", name = "ai", descriptor = "(I)V", line = 43)
	public void method16717(@OriginalArg(0) int arg0) {
		anInt2360 = arg0 * 469516263;
	}

	@OriginalMember(owner = "client!ang", name = "e", descriptor = "(II)V", line = 43)
	public void method16718(@OriginalArg(0) int arg0) {
		anInt2360 = arg0 * 469516263;
	}

	@OriginalMember(owner = "client!ang", name = "f", descriptor = "(II)V", line = 47)
	public void method16719(@OriginalArg(0) int arg0) {
		anInt2361 = arg0 * -1754075597;
	}

	@OriginalMember(owner = "client!ang", name = "ag", descriptor = "(I)V", line = 47)
	public void method16720(@OriginalArg(0) int arg0) {
		anInt2361 = arg0 * -1754075597;
	}

	@OriginalMember(owner = "client!ang", name = "al", descriptor = "(I)V", line = 47)
	public void method16721(@OriginalArg(0) int arg0) {
		anInt2361 = arg0 * -1754075597;
	}

	@OriginalMember(owner = "client!ang", name = "o", descriptor = "(II)V", line = 51)
	public void method16722(@OriginalArg(0) int arg0) {
		anInt2363 = arg0 * 648419935;
	}

	@OriginalMember(owner = "client!ang", name = "b", descriptor = "(II)V", line = 55)
	public void method16723(@OriginalArg(0) int arg0) {
		anInt2362 = arg0 * -2143463467;
	}

	@OriginalMember(owner = "client!ang", name = "ao", descriptor = "(I)V", line = 55)
	public void method16724(@OriginalArg(0) int arg0) {
		anInt2362 = arg0 * -2143463467;
	}

	@OriginalMember(owner = "client!ang", name = "v", descriptor = "(I)Lclient!oo;", line = 59)
	@Override
	public Class447 method23153() {
		@Pc(6) Class447 local6 = new Class447(0.0F, 0.0F, 1000.0F);
		local6.method29198(Class452.method29313(this.aClass452_4));
		local6.aFloat276 *= -1.0F;
		local6.method29146(this.aClass107_16.method8883());
		return local6;
	}

	@OriginalMember(owner = "client!ang", name = "z", descriptor = "()Lclient!oo;", line = 59)
	@Override
	public Class447 method23158() {
		@Pc(6) Class447 local6 = new Class447(0.0F, 0.0F, 1000.0F);
		local6.method29198(Class452.method29313(this.aClass452_4));
		local6.aFloat276 *= -1.0F;
		local6.method29146(this.aClass107_16.method8883());
		return local6;
	}

	@OriginalMember(owner = "client!ang", name = "r", descriptor = "()Lclient!oo;", line = 59)
	@Override
	public Class447 method23164() {
		@Pc(6) Class447 local6 = new Class447(0.0F, 0.0F, 1000.0F);
		local6.method29198(Class452.method29313(this.aClass452_4));
		local6.aFloat276 *= -1.0F;
		local6.method29146(this.aClass107_16.method8883());
		return local6;
	}

	@OriginalMember(owner = "client!ang", name = "g", descriptor = "()Lclient!oo;", line = 59)
	@Override
	public Class447 method23160() {
		@Pc(6) Class447 local6 = new Class447(0.0F, 0.0F, 1000.0F);
		local6.method29198(Class452.method29313(this.aClass452_4));
		local6.aFloat276 *= -1.0F;
		local6.method29146(this.aClass107_16.method8883());
		return local6;
	}

	@OriginalMember(owner = "client!ang", name = "i", descriptor = "()Lclient!oo;", line = 67)
	@Override
	public Class447 method23167() {
		@Pc(6) Class447 local6 = new Class447(0.0F, 0.0F, 1000.0F);
		local6.method29198(Class452.method29313(this.aClass452_3));
		local6.aFloat276 *= -1.0F;
		local6.method29146(this.aClass107_16.method8883());
		return local6;
	}

	@OriginalMember(owner = "client!ang", name = "j", descriptor = "()Lclient!oo;", line = 67)
	@Override
	public Class447 method23166() {
		@Pc(6) Class447 local6 = new Class447(0.0F, 0.0F, 1000.0F);
		local6.method29198(Class452.method29313(this.aClass452_3));
		local6.aFloat276 *= -1.0F;
		local6.method29146(this.aClass107_16.method8883());
		return local6;
	}

	@OriginalMember(owner = "client!ang", name = "l", descriptor = "(I)Lclient!oo;", line = 67)
	@Override
	public Class447 method23165() {
		@Pc(6) Class447 local6 = new Class447(0.0F, 0.0F, 1000.0F);
		local6.method29198(Class452.method29313(this.aClass452_3));
		local6.aFloat276 *= -1.0F;
		local6.method29146(this.aClass107_16.method8883());
		return local6;
	}

	@OriginalMember(owner = "client!ang", name = "n", descriptor = "(IIIB)V", line = 75)
	public void method16725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class455 local3 = new Class455();
		local3.method29396(0.0D, 0.0D, 0.0D, (double) arg0, (double) -arg1, (double) arg2, 0.0F, 1.0F, 0.0F);
		@Pc(22) Class451 local22 = new Class451();
		local3.method29456(local22.aFloatArray111);
		@Pc(30) Class452 local30 = local22.method29261();
		local30.method29307();
		this.aClass452_4.method29286(local30);
	}

	@OriginalMember(owner = "client!ang", name = "p", descriptor = "(FI)V", line = 85)
	@Override
	public void method23156(@OriginalArg(0) float arg0) {
		@Pc(3) Class452 local3 = this.method16735();
		if (anInt2360 * -334470185 != 0 || anInt2361 * -1911440133 != 0) {
			@Pc(14) Class452 local14 = Class452.method29269();
			local14.method29292(1.0F, 0.0F, 0.0F, (float) ((double) (anInt2360 * -334470185) * 3.141592653589793D * 2.0D) / 16384.0F);
			local3.method29330(local14);
			@Pc(38) Class447 local38 = Class447.method29120(0.0F, 1.0F, 0.0F);
			local38.method29198(local3);
			@Pc(43) Class452 local43 = Class452.method29269();
			local38.method29145();
			local43.method29290(local38, (float) (2.0D * 3.141592653589793D * (double) (anInt2361 * -1911440133)) / 16384.0F);
			local3.method29330(local43);
			this.method16715(local3);
			anInt2360 = 0;
			anInt2361 = 0;
		}
		if (this.aClass107_16.method8880() != Class331.aClass331_5 || anInt2363 * 1200406943 == 0 && anInt2362 * 59713917 == 0) {
			return;
		}
		local3.method29307();
		@Pc(93) Class115_Sub2 local93 = (Class115_Sub2) this.aClass107_16.method8871();
		@Pc(97) Class77_Sub36 local97 = local93.method21209();
		@Pc(101) Class447 local101 = local97.method14453();
		@Pc(109) Class447 local109 = Class447.method29120(0.0F, 0.0F, (float) (anInt2362 * 59713917));
		local109.method29198(local3);
		local109.aFloat276 *= -1.0F;
		local101.method29146(local109);
		@Pc(129) Class447 local129 = Class447.method29120((float) (anInt2363 * 1200406943), 0.0F, 0.0F);
		local129.method29198(local3);
		local129.aFloat276 *= -1.0F;
		local101.method29146(local129);
		this.method16727(local101);
		local93.method10238(new Class77_Sub36(local97.anInt1776 * 955276319, (int) local101.aFloat277, (int) local101.aFloat276, (int) local101.aFloat278));
		anInt2363 = 0;
		anInt2362 = 0;
	}

	@OriginalMember(owner = "client!ang", name = "q", descriptor = "(F)V", line = 85)
	@Override
	public void method23155(@OriginalArg(0) float arg0) {
		@Pc(3) Class452 local3 = this.method16735();
		if (anInt2360 * -334470185 != 0 || anInt2361 * -1911440133 != 0) {
			@Pc(14) Class452 local14 = Class452.method29269();
			local14.method29292(1.0F, 0.0F, 0.0F, (float) ((double) (anInt2360 * -334470185) * 3.141592653589793D * 2.0D) / 16384.0F);
			local3.method29330(local14);
			@Pc(38) Class447 local38 = Class447.method29120(0.0F, 1.0F, 0.0F);
			local38.method29198(local3);
			@Pc(43) Class452 local43 = Class452.method29269();
			local38.method29145();
			local43.method29290(local38, (float) (2.0D * 3.141592653589793D * (double) (anInt2361 * -1911440133)) / 16384.0F);
			local3.method29330(local43);
			this.method16715(local3);
			anInt2360 = 0;
			anInt2361 = 0;
		}
		if (this.aClass107_16.method8880() != Class331.aClass331_5 || anInt2363 * 1200406943 == 0 && anInt2362 * 59713917 == 0) {
			return;
		}
		local3.method29307();
		@Pc(93) Class115_Sub2 local93 = (Class115_Sub2) this.aClass107_16.method8871();
		@Pc(97) Class77_Sub36 local97 = local93.method21209();
		@Pc(101) Class447 local101 = local97.method14453();
		@Pc(109) Class447 local109 = Class447.method29120(0.0F, 0.0F, (float) (anInt2362 * 59713917));
		local109.method29198(local3);
		local109.aFloat276 *= -1.0F;
		local101.method29146(local109);
		@Pc(129) Class447 local129 = Class447.method29120((float) (anInt2363 * 1200406943), 0.0F, 0.0F);
		local129.method29198(local3);
		local129.aFloat276 *= -1.0F;
		local101.method29146(local129);
		this.method16727(local101);
		local93.method10238(new Class77_Sub36(local97.anInt1776 * 955276319, (int) local101.aFloat277, (int) local101.aFloat276, (int) local101.aFloat278));
		anInt2363 = 0;
		anInt2362 = 0;
	}

	@OriginalMember(owner = "client!ang", name = "x", descriptor = "(F)V", line = 85)
	@Override
	public void method23161(@OriginalArg(0) float arg0) {
		@Pc(3) Class452 local3 = this.method16735();
		if (anInt2360 * -334470185 != 0 || anInt2361 * -1911440133 != 0) {
			@Pc(14) Class452 local14 = Class452.method29269();
			local14.method29292(1.0F, 0.0F, 0.0F, (float) ((double) (anInt2360 * -334470185) * 3.141592653589793D * 2.0D) / 16384.0F);
			local3.method29330(local14);
			@Pc(38) Class447 local38 = Class447.method29120(0.0F, 1.0F, 0.0F);
			local38.method29198(local3);
			@Pc(43) Class452 local43 = Class452.method29269();
			local38.method29145();
			local43.method29290(local38, (float) (2.0D * 3.141592653589793D * (double) (anInt2361 * -1911440133)) / 16384.0F);
			local3.method29330(local43);
			this.method16715(local3);
			anInt2360 = 0;
			anInt2361 = 0;
		}
		if (this.aClass107_16.method8880() != Class331.aClass331_5 || anInt2363 * 1200406943 == 0 && anInt2362 * 59713917 == 0) {
			return;
		}
		local3.method29307();
		@Pc(93) Class115_Sub2 local93 = (Class115_Sub2) this.aClass107_16.method8871();
		@Pc(97) Class77_Sub36 local97 = local93.method21209();
		@Pc(101) Class447 local101 = local97.method14453();
		@Pc(109) Class447 local109 = Class447.method29120(0.0F, 0.0F, (float) (anInt2362 * 59713917));
		local109.method29198(local3);
		local109.aFloat276 *= -1.0F;
		local101.method29146(local109);
		@Pc(129) Class447 local129 = Class447.method29120((float) (anInt2363 * 1200406943), 0.0F, 0.0F);
		local129.method29198(local3);
		local129.aFloat276 *= -1.0F;
		local101.method29146(local129);
		this.method16727(local101);
		local93.method10238(new Class77_Sub36(local97.anInt1776 * 955276319, (int) local101.aFloat277, (int) local101.aFloat276, (int) local101.aFloat278));
		anInt2363 = 0;
		anInt2362 = 0;
	}

	@OriginalMember(owner = "client!ang", name = "t", descriptor = "(F)V", line = 85)
	@Override
	public void method23159(@OriginalArg(0) float arg0) {
		@Pc(3) Class452 local3 = this.method16735();
		if (anInt2360 * -334470185 != 0 || anInt2361 * -1911440133 != 0) {
			@Pc(14) Class452 local14 = Class452.method29269();
			local14.method29292(1.0F, 0.0F, 0.0F, (float) ((double) (anInt2360 * -334470185) * 3.141592653589793D * 2.0D) / 16384.0F);
			local3.method29330(local14);
			@Pc(38) Class447 local38 = Class447.method29120(0.0F, 1.0F, 0.0F);
			local38.method29198(local3);
			@Pc(43) Class452 local43 = Class452.method29269();
			local38.method29145();
			local43.method29290(local38, (float) (2.0D * 3.141592653589793D * (double) (anInt2361 * -1911440133)) / 16384.0F);
			local3.method29330(local43);
			this.method16715(local3);
			anInt2360 = 0;
			anInt2361 = 0;
		}
		if (this.aClass107_16.method8880() != Class331.aClass331_5 || anInt2363 * 1200406943 == 0 && anInt2362 * 59713917 == 0) {
			return;
		}
		local3.method29307();
		@Pc(93) Class115_Sub2 local93 = (Class115_Sub2) this.aClass107_16.method8871();
		@Pc(97) Class77_Sub36 local97 = local93.method21209();
		@Pc(101) Class447 local101 = local97.method14453();
		@Pc(109) Class447 local109 = Class447.method29120(0.0F, 0.0F, (float) (anInt2362 * 59713917));
		local109.method29198(local3);
		local109.aFloat276 *= -1.0F;
		local101.method29146(local109);
		@Pc(129) Class447 local129 = Class447.method29120((float) (anInt2363 * 1200406943), 0.0F, 0.0F);
		local129.method29198(local3);
		local129.aFloat276 *= -1.0F;
		local101.method29146(local129);
		this.method16727(local101);
		local93.method10238(new Class77_Sub36(local97.anInt1776 * 955276319, (int) local101.aFloat277, (int) local101.aFloat276, (int) local101.aFloat278));
		anInt2363 = 0;
		anInt2362 = 0;
	}

	@OriginalMember(owner = "client!ang", name = "d", descriptor = "(IIIIIII)J", line = 113)
	public static long method16726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Class61.aCalendar1.clear();
		Class61.aCalendar1.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return Class61.aCalendar1.getTime().getTime();
	}

	@OriginalMember(owner = "client!ang", name = "a", descriptor = "(Lclient!oo;I)V", line = 121)
	void method16727(@OriginalArg(0) Class447 arg0) {
		if (-1.0F != aFloat158 && arg0.aFloat277 < aFloat158) {
			arg0.aFloat277 = aFloat158;
		}
		if (aFloat159 != -1.0F && arg0.aFloat277 > aFloat159) {
			arg0.aFloat277 = aFloat159;
		}
		if (aFloat160 != -1.0F && arg0.aFloat276 < aFloat160) {
			arg0.aFloat276 = aFloat160;
		}
		if (-1.0F != aFloat155 && arg0.aFloat276 > aFloat155) {
			arg0.aFloat276 = aFloat155;
		}
		if (aFloat156 != -1.0F && arg0.aFloat278 < aFloat156) {
			arg0.aFloat278 = aFloat156;
		}
		if (-1.0F != aFloat157 && arg0.aFloat278 > aFloat157) {
			arg0.aFloat278 = aFloat157;
		}
	}

	@OriginalMember(owner = "client!ang", name = "ak", descriptor = "(Lclient!oo;)V", line = 121)
	void method16728(@OriginalArg(0) Class447 arg0) {
		if (-1.0F != aFloat158 && arg0.aFloat277 < aFloat158) {
			arg0.aFloat277 = aFloat158;
		}
		if (aFloat159 != -1.0F && arg0.aFloat277 > aFloat159) {
			arg0.aFloat277 = aFloat159;
		}
		if (aFloat160 != -1.0F && arg0.aFloat276 < aFloat160) {
			arg0.aFloat276 = aFloat160;
		}
		if (-1.0F != aFloat155 && arg0.aFloat276 > aFloat155) {
			arg0.aFloat276 = aFloat155;
		}
		if (aFloat156 != -1.0F && arg0.aFloat278 < aFloat156) {
			arg0.aFloat278 = aFloat156;
		}
		if (-1.0F != aFloat157 && arg0.aFloat278 > aFloat157) {
			arg0.aFloat278 = aFloat157;
		}
	}

	@OriginalMember(owner = "client!ang", name = "au", descriptor = "(Lclient!oo;)V", line = 121)
	void method16729(@OriginalArg(0) Class447 arg0) {
		if (-1.0F != aFloat158 && arg0.aFloat277 < aFloat158) {
			arg0.aFloat277 = aFloat158;
		}
		if (aFloat159 != -1.0F && arg0.aFloat277 > aFloat159) {
			arg0.aFloat277 = aFloat159;
		}
		if (aFloat160 != -1.0F && arg0.aFloat276 < aFloat160) {
			arg0.aFloat276 = aFloat160;
		}
		if (-1.0F != aFloat155 && arg0.aFloat276 > aFloat155) {
			arg0.aFloat276 = aFloat155;
		}
		if (aFloat156 != -1.0F && arg0.aFloat278 < aFloat156) {
			arg0.aFloat278 = aFloat156;
		}
		if (-1.0F != aFloat157 && arg0.aFloat278 > aFloat157) {
			arg0.aFloat278 = aFloat157;
		}
	}

	@OriginalMember(owner = "client!ang", name = "ax", descriptor = "(Lclient!oo;)V", line = 121)
	void method16730(@OriginalArg(0) Class447 arg0) {
		if (-1.0F != aFloat158 && arg0.aFloat277 < aFloat158) {
			arg0.aFloat277 = aFloat158;
		}
		if (aFloat159 != -1.0F && arg0.aFloat277 > aFloat159) {
			arg0.aFloat277 = aFloat159;
		}
		if (aFloat160 != -1.0F && arg0.aFloat276 < aFloat160) {
			arg0.aFloat276 = aFloat160;
		}
		if (-1.0F != aFloat155 && arg0.aFloat276 > aFloat155) {
			arg0.aFloat276 = aFloat155;
		}
		if (aFloat156 != -1.0F && arg0.aFloat278 < aFloat156) {
			arg0.aFloat278 = aFloat156;
		}
		if (-1.0F != aFloat157 && arg0.aFloat278 > aFloat157) {
			arg0.aFloat278 = aFloat157;
		}
	}

	@OriginalMember(owner = "client!ang", name = "m", descriptor = "(Lclient!oo;IIIIIIB)V", line = 130)
	public void method16731(@OriginalArg(0) Class447 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat158 = arg1 == -1 ? -1.0F : arg0.aFloat277 - (float) (arg1 * 512);
		aFloat159 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.aFloat277;
		aFloat160 = arg5 == -1 ? -1.0F : -arg0.aFloat276 - (float) (arg5 * 512);
		aFloat155 = arg6 == -1 ? -1.0F : -arg0.aFloat276 + (float) (arg6 * 512);
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat278 - (float) (arg3 * 512);
		aFloat157 = arg4 == -1 ? -1.0F : (float) (arg4 * 512) + arg0.aFloat278;
	}

	@OriginalMember(owner = "client!ang", name = "ad", descriptor = "(Lclient!oo;IIIIII)V", line = 130)
	public void method16732(@OriginalArg(0) Class447 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat158 = arg1 == -1 ? -1.0F : arg0.aFloat277 - (float) (arg1 * 512);
		aFloat159 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.aFloat277;
		aFloat160 = arg5 == -1 ? -1.0F : -arg0.aFloat276 - (float) (arg5 * 512);
		aFloat155 = arg6 == -1 ? -1.0F : -arg0.aFloat276 + (float) (arg6 * 512);
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat278 - (float) (arg3 * 512);
		aFloat157 = arg4 == -1 ? -1.0F : (float) (arg4 * 512) + arg0.aFloat278;
	}

	@OriginalMember(owner = "client!ang", name = "ar", descriptor = "(Lclient!oo;IIIIII)V", line = 130)
	public void method16733(@OriginalArg(0) Class447 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat158 = arg1 == -1 ? -1.0F : arg0.aFloat277 - (float) (arg1 * 512);
		aFloat159 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.aFloat277;
		aFloat160 = arg5 == -1 ? -1.0F : -arg0.aFloat276 - (float) (arg5 * 512);
		aFloat155 = arg6 == -1 ? -1.0F : -arg0.aFloat276 + (float) (arg6 * 512);
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat278 - (float) (arg3 * 512);
		aFloat157 = arg4 == -1 ? -1.0F : (float) (arg4 * 512) + arg0.aFloat278;
	}

	@OriginalMember(owner = "client!ang", name = "ac", descriptor = "(Lclient!oo;IIIIII)V", line = 130)
	public void method16734(@OriginalArg(0) Class447 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat158 = arg1 == -1 ? -1.0F : arg0.aFloat277 - (float) (arg1 * 512);
		aFloat159 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.aFloat277;
		aFloat160 = arg5 == -1 ? -1.0F : -arg0.aFloat276 - (float) (arg5 * 512);
		aFloat155 = arg6 == -1 ? -1.0F : -arg0.aFloat276 + (float) (arg6 * 512);
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat278 - (float) (arg3 * 512);
		aFloat157 = arg4 == -1 ? -1.0F : (float) (arg4 * 512) + arg0.aFloat278;
	}

	@OriginalMember(owner = "client!ang", name = "c", descriptor = "(B)Z", line = 139)
	@Override
	public boolean method23154() {
		return !Float.isNaN(this.aClass452_4.aFloat284) && this.aClass107_16.method8883() != null;
	}

	@OriginalMember(owner = "client!ang", name = "d", descriptor = "()Z", line = 139)
	@Override
	public boolean method23162() {
		return !Float.isNaN(this.aClass452_4.aFloat284) && this.aClass107_16.method8883() != null;
	}

	@OriginalMember(owner = "client!ang", name = "h", descriptor = "(I)Lclient!ot;", line = 143)
	public Class452 method16735() {
		return new Class452(this.aClass452_4);
	}

	@OriginalMember(owner = "client!ang", name = "ae", descriptor = "()Lclient!ot;", line = 143)
	public Class452 method16736() {
		return new Class452(this.aClass452_4);
	}

	@OriginalMember(owner = "client!ang", name = "av", descriptor = "()Lclient!ot;", line = 143)
	public Class452 method16737() {
		return new Class452(this.aClass452_4);
	}

	@OriginalMember(owner = "client!ang", name = "at", descriptor = "()Lclient!ot;", line = 143)
	public Class452 method16738() {
		return new Class452(this.aClass452_4);
	}

	@OriginalMember(owner = "client!ang", name = "y", descriptor = "(Lclient!ia;Lclient!ow;IIFI)V", line = 147)
	@Override
	public void method23157(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class447 local5 = Class447.method29124(this.aClass107_16.method8883());
		local5.aFloat277 -= arg2;
		local5.aFloat278 -= arg3;
		local5.aFloat276 *= -1.0F;
		arg1.method29414(Class452.method29313(this.aClass452_4));
		arg1.method29432(local5);
		arg1.method29409();
		local5.method29130();
	}

	@OriginalMember(owner = "client!ang", name = "s", descriptor = "(Lclient!ia;Lclient!ow;IIF)V", line = 147)
	@Override
	public void method23163(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class447 local5 = Class447.method29124(this.aClass107_16.method8883());
		local5.aFloat277 -= arg2;
		local5.aFloat278 -= arg3;
		local5.aFloat276 *= -1.0F;
		arg1.method29414(Class452.method29313(this.aClass452_4));
		arg1.method29432(local5);
		arg1.method29409();
		local5.method29130();
	}

	@OriginalMember(owner = "client!ang", name = "k", descriptor = "(Lclient!akv;)V", line = 158)
	@Override
	public void method23168(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass452_4.method29280(arg0);
	}

	@OriginalMember(owner = "client!ang", name = "w", descriptor = "(Lclient!akv;I)V", line = 158)
	@Override
	public void method23152(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass452_4.method29280(arg0);
	}
}
