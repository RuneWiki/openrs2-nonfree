package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anb")
public class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!anb", name = "k", descriptor = "I")
	static int anInt2247 = 0;

	@OriginalMember(owner = "client!anb", name = "f", descriptor = "I")
	static int anInt2245 = 0;

	@OriginalMember(owner = "client!anb", name = "w", descriptor = "I")
	static int anInt2244 = 0;

	@OriginalMember(owner = "client!anb", name = "l", descriptor = "I")
	static int anInt2246 = 0;

	@OriginalMember(owner = "client!anb", name = "u", descriptor = "F")
	static float aFloat157 = -1.0F;

	@OriginalMember(owner = "client!anb", name = "z", descriptor = "F")
	static float aFloat155 = -1.0F;

	@OriginalMember(owner = "client!anb", name = "p", descriptor = "F")
	static float aFloat158 = -1.0F;

	@OriginalMember(owner = "client!anb", name = "d", descriptor = "F")
	static float aFloat159 = -1.0F;

	@OriginalMember(owner = "client!anb", name = "c", descriptor = "F")
	static float aFloat156 = -1.0F;

	@OriginalMember(owner = "client!anb", name = "r", descriptor = "F")
	static float aFloat160 = -1.0F;

	@OriginalMember(owner = "client!anb", name = "n", descriptor = "Lclient!ov;")
	final Class471 aClass471_4 = new Class471();

	@OriginalMember(owner = "client!anb", name = "m", descriptor = "Lclient!ov;")
	final Class471 aClass471_3 = new Class471(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!anb", name = "e", descriptor = "(I)[Lclient!ib;", line = 15)
	static Class332[] method15995() {
		return new Class332[] { Class332.aClass332_5, Class332.aClass332_4, Class332.aClass332_6, Class332.aClass332_1, Class332.aClass332_2, Class332.aClass332_3 };
	}

	@OriginalMember(owner = "client!anb", name = "<init>", descriptor = "(Lclient!je;)V", line = 31)
	public Class25_Sub1(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anb", name = "q", descriptor = "(Lclient!ov;I)V", line = 35)
	public void method15963(@OriginalArg(0) Class471 arg0) {
		this.aClass471_3.aFloat314 = arg0.aFloat314;
		this.aClass471_3.aFloat315 = arg0.aFloat315;
		this.aClass471_3.aFloat316 = arg0.aFloat316;
		this.aClass471_3.aFloat313 = arg0.aFloat313;
		this.aClass471_4.method29464(this.aClass471_3);
	}

	@OriginalMember(owner = "client!anb", name = "ag", descriptor = "(Lclient!ov;)V", line = 35)
	public void method15974(@OriginalArg(0) Class471 arg0) {
		this.aClass471_3.aFloat314 = arg0.aFloat314;
		this.aClass471_3.aFloat315 = arg0.aFloat315;
		this.aClass471_3.aFloat316 = arg0.aFloat316;
		this.aClass471_3.aFloat313 = arg0.aFloat313;
		this.aClass471_4.method29464(this.aClass471_3);
	}

	@OriginalMember(owner = "client!anb", name = "ae", descriptor = "(Lclient!ov;)V", line = 35)
	public void method15994(@OriginalArg(0) Class471 arg0) {
		this.aClass471_3.aFloat314 = arg0.aFloat314;
		this.aClass471_3.aFloat315 = arg0.aFloat315;
		this.aClass471_3.aFloat316 = arg0.aFloat316;
		this.aClass471_3.aFloat313 = arg0.aFloat313;
		this.aClass471_4.method29464(this.aClass471_3);
	}

	@OriginalMember(owner = "client!anb", name = "x", descriptor = "(II)V", line = 43)
	public void method15971(@OriginalArg(0) int arg0) {
		anInt2247 = arg0 * 1699331235;
	}

	@OriginalMember(owner = "client!anb", name = "ah", descriptor = "(I)V", line = 43)
	public void method15975(@OriginalArg(0) int arg0) {
		anInt2247 = arg0 * 1699331235;
	}

	@OriginalMember(owner = "client!anb", name = "b", descriptor = "(IB)V", line = 47)
	public void method15965(@OriginalArg(0) int arg0) {
		anInt2245 = arg0 * 1962311187;
	}

	@OriginalMember(owner = "client!anb", name = "al", descriptor = "(I)V", line = 47)
	public void method15976(@OriginalArg(0) int arg0) {
		anInt2245 = arg0 * 1962311187;
	}

	@OriginalMember(owner = "client!anb", name = "ac", descriptor = "(I)V", line = 47)
	public void method15977(@OriginalArg(0) int arg0) {
		anInt2245 = arg0 * 1962311187;
	}

	@OriginalMember(owner = "client!anb", name = "ai", descriptor = "(I)V", line = 47)
	public void method15978(@OriginalArg(0) int arg0) {
		anInt2245 = arg0 * 1962311187;
	}

	@OriginalMember(owner = "client!anb", name = "h", descriptor = "(IB)V", line = 51)
	public void method15970(@OriginalArg(0) int arg0) {
		anInt2244 = arg0 * 1097649223;
	}

	@OriginalMember(owner = "client!anb", name = "at", descriptor = "(I)V", line = 51)
	public void method15973(@OriginalArg(0) int arg0) {
		anInt2244 = arg0 * 1097649223;
	}

	@OriginalMember(owner = "client!anb", name = "aw", descriptor = "(I)V", line = 51)
	public void method15979(@OriginalArg(0) int arg0) {
		anInt2244 = arg0 * 1097649223;
	}

	@OriginalMember(owner = "client!anb", name = "as", descriptor = "(I)V", line = 51)
	public void method15980(@OriginalArg(0) int arg0) {
		anInt2244 = arg0 * 1097649223;
	}

	@OriginalMember(owner = "client!anb", name = "ad", descriptor = "(I)V", line = 51)
	public void method15982(@OriginalArg(0) int arg0) {
		anInt2244 = arg0 * 1097649223;
	}

	@OriginalMember(owner = "client!anb", name = "a", descriptor = "(IB)V", line = 55)
	public void method15966(@OriginalArg(0) int arg0) {
		anInt2246 = arg0 * 2123450257;
	}

	@OriginalMember(owner = "client!anb", name = "am", descriptor = "(I)V", line = 55)
	public void method15981(@OriginalArg(0) int arg0) {
		anInt2246 = arg0 * 2123450257;
	}

	@OriginalMember(owner = "client!anb", name = "m", descriptor = "(I)Lclient!ox;", line = 59)
	@Override
	public Class472 method23120() {
		@Pc(6) Class472 local6 = new Class472(0.0F, 0.0F, 1000.0F);
		local6.method29572(Class471.method29471(this.aClass471_4));
		local6.aFloat318 *= -1.0F;
		local6.method29543(this.aClass123_16.method8957());
		return local6;
	}

	@OriginalMember(owner = "client!anb", name = "d", descriptor = "()Lclient!ox;", line = 59)
	@Override
	public Class472 method23127() {
		@Pc(6) Class472 local6 = new Class472(0.0F, 0.0F, 1000.0F);
		local6.method29572(Class471.method29471(this.aClass471_4));
		local6.aFloat318 *= -1.0F;
		local6.method29543(this.aClass123_16.method8957());
		return local6;
	}

	@OriginalMember(owner = "client!anb", name = "k", descriptor = "(I)Lclient!ox;", line = 67)
	@Override
	public Class472 method23122() {
		@Pc(6) Class472 local6 = new Class472(0.0F, 0.0F, 1000.0F);
		local6.method29572(Class471.method29471(this.aClass471_3));
		local6.aFloat318 *= -1.0F;
		local6.method29543(this.aClass123_16.method8957());
		return local6;
	}

	@OriginalMember(owner = "client!anb", name = "y", descriptor = "()Lclient!ox;", line = 67)
	@Override
	public Class472 method23133() {
		@Pc(6) Class472 local6 = new Class472(0.0F, 0.0F, 1000.0F);
		local6.method29572(Class471.method29471(this.aClass471_3));
		local6.aFloat318 *= -1.0F;
		local6.method29543(this.aClass123_16.method8957());
		return local6;
	}

	@OriginalMember(owner = "client!anb", name = "s", descriptor = "()Lclient!ox;", line = 67)
	@Override
	public Class472 method23117() {
		@Pc(6) Class472 local6 = new Class472(0.0F, 0.0F, 1000.0F);
		local6.method29572(Class471.method29471(this.aClass471_3));
		local6.aFloat318 *= -1.0F;
		local6.method29543(this.aClass123_16.method8957());
		return local6;
	}

	@OriginalMember(owner = "client!anb", name = "g", descriptor = "(IIII)V", line = 75)
	public void method15967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class470 local3 = new Class470();
		local3.method29368(0.0D, 0.0D, 0.0D, (double) arg0, (double) -arg1, (double) arg2, 0.0F, 1.0F, 0.0F);
		@Pc(22) Class457 local22 = new Class457();
		local3.method29446(local22.aFloatArray108);
		@Pc(30) Class471 local30 = local22.method29155();
		local30.method29470();
		this.aClass471_4.method29464(local30);
	}

	@OriginalMember(owner = "client!anb", name = "ap", descriptor = "(III)V", line = 75)
	public void method15968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class470 local3 = new Class470();
		local3.method29368(0.0D, 0.0D, 0.0D, (double) arg0, (double) -arg1, (double) arg2, 0.0F, 1.0F, 0.0F);
		@Pc(22) Class457 local22 = new Class457();
		local3.method29446(local22.aFloatArray108);
		@Pc(30) Class471 local30 = local22.method29155();
		local30.method29470();
		this.aClass471_4.method29464(local30);
	}

	@OriginalMember(owner = "client!anb", name = "au", descriptor = "(III)V", line = 75)
	public void method15985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class470 local3 = new Class470();
		local3.method29368(0.0D, 0.0D, 0.0D, (double) arg0, (double) -arg1, (double) arg2, 0.0F, 1.0F, 0.0F);
		@Pc(22) Class457 local22 = new Class457();
		local3.method29446(local22.aFloatArray108);
		@Pc(30) Class471 local30 = local22.method29155();
		local30.method29470();
		this.aClass471_4.method29464(local30);
	}

	@OriginalMember(owner = "client!anb", name = "ar", descriptor = "(III)V", line = 75)
	public void method15986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class470 local3 = new Class470();
		local3.method29368(0.0D, 0.0D, 0.0D, (double) arg0, (double) -arg1, (double) arg2, 0.0F, 1.0F, 0.0F);
		@Pc(22) Class457 local22 = new Class457();
		local3.method29446(local22.aFloatArray108);
		@Pc(30) Class471 local30 = local22.method29155();
		local30.method29470();
		this.aClass471_4.method29464(local30);
	}

	@OriginalMember(owner = "client!anb", name = "l", descriptor = "(F)V", line = 85)
	@Override
	public void method23128(@OriginalArg(0) float arg0) {
		@Pc(3) Class471 local3 = this.method15969();
		if (anInt2247 * 1148770059 != 0 || anInt2245 * 121830427 != 0) {
			@Pc(15) Class471 local15 = Class471.method29521();
			local15.method29466(1.0F, 0.0F, 0.0F, (float) ((double) (anInt2247 * 1148770059) * 3.141592653589793D * 2.0D) / 16384.0F);
			local3.method29476(local15);
			@Pc(39) Class472 local39 = Class472.method29529(0.0F, 1.0F, 0.0F);
			local39.method29572(local3);
			@Pc(44) Class471 local44 = Class471.method29521();
			local39.method29559();
			local44.method29465(local39, (float) (2.0D * 3.141592653589793D * (double) (anInt2245 * 121830427)) / 16384.0F);
			local3.method29476(local44);
			this.method15963(local3);
			anInt2247 = 0;
			anInt2245 = 0;
		}
		if (this.aClass123_16.method9023() != Class342.aClass342_4 || anInt2244 * -1947263625 == 0 && anInt2246 * -316778127 == 0) {
			return;
		}
		local3.method29470();
		@Pc(93) Class124_Sub2 local93 = (Class124_Sub2) this.aClass123_16.method8952();
		@Pc(97) Class93_Sub30 local97 = local93.method21404();
		@Pc(101) Class472 local101 = local97.method13870();
		@Pc(109) Class472 local109 = Class472.method29529(0.0F, 0.0F, (float) (anInt2246 * -316778127));
		local109.method29572(local3);
		local109.aFloat318 *= -1.0F;
		local101.method29543(local109);
		@Pc(129) Class472 local129 = Class472.method29529((float) (anInt2244 * -1947263625), 0.0F, 0.0F);
		local129.method29572(local3);
		local129.aFloat318 *= -1.0F;
		local101.method29543(local129);
		this.method15972(local101);
		local93.method9297(new Class93_Sub30(local97.anInt1609 * -2022654167, (int) local101.aFloat317, (int) local101.aFloat318, (int) local101.aFloat319));
		anInt2244 = 0;
		anInt2246 = 0;
	}

	@OriginalMember(owner = "client!anb", name = "e", descriptor = "(FB)V", line = 85)
	@Override
	public void method23118(@OriginalArg(0) float arg0) {
		@Pc(3) Class471 local3 = this.method15969();
		if (anInt2247 * 1148770059 != 0 || anInt2245 * 121830427 != 0) {
			@Pc(15) Class471 local15 = Class471.method29521();
			local15.method29466(1.0F, 0.0F, 0.0F, (float) ((double) (anInt2247 * 1148770059) * 3.141592653589793D * 2.0D) / 16384.0F);
			local3.method29476(local15);
			@Pc(39) Class472 local39 = Class472.method29529(0.0F, 1.0F, 0.0F);
			local39.method29572(local3);
			@Pc(44) Class471 local44 = Class471.method29521();
			local39.method29559();
			local44.method29465(local39, (float) (2.0D * 3.141592653589793D * (double) (anInt2245 * 121830427)) / 16384.0F);
			local3.method29476(local44);
			this.method15963(local3);
			anInt2247 = 0;
			anInt2245 = 0;
		}
		if (this.aClass123_16.method9023() != Class342.aClass342_4 || anInt2244 * -1947263625 == 0 && anInt2246 * -316778127 == 0) {
			return;
		}
		local3.method29470();
		@Pc(93) Class124_Sub2 local93 = (Class124_Sub2) this.aClass123_16.method8952();
		@Pc(97) Class93_Sub30 local97 = local93.method21404();
		@Pc(101) Class472 local101 = local97.method13870();
		@Pc(109) Class472 local109 = Class472.method29529(0.0F, 0.0F, (float) (anInt2246 * -316778127));
		local109.method29572(local3);
		local109.aFloat318 *= -1.0F;
		local101.method29543(local109);
		@Pc(129) Class472 local129 = Class472.method29529((float) (anInt2244 * -1947263625), 0.0F, 0.0F);
		local129.method29572(local3);
		local129.aFloat318 *= -1.0F;
		local101.method29543(local129);
		this.method15972(local101);
		local93.method9297(new Class93_Sub30(local97.anInt1609 * -2022654167, (int) local101.aFloat317, (int) local101.aFloat318, (int) local101.aFloat319));
		anInt2244 = 0;
		anInt2246 = 0;
	}

	@OriginalMember(owner = "client!anb", name = "u", descriptor = "(F)V", line = 85)
	@Override
	public void method23124(@OriginalArg(0) float arg0) {
		@Pc(3) Class471 local3 = this.method15969();
		if (anInt2247 * 1148770059 != 0 || anInt2245 * 121830427 != 0) {
			@Pc(15) Class471 local15 = Class471.method29521();
			local15.method29466(1.0F, 0.0F, 0.0F, (float) ((double) (anInt2247 * 1148770059) * 3.141592653589793D * 2.0D) / 16384.0F);
			local3.method29476(local15);
			@Pc(39) Class472 local39 = Class472.method29529(0.0F, 1.0F, 0.0F);
			local39.method29572(local3);
			@Pc(44) Class471 local44 = Class471.method29521();
			local39.method29559();
			local44.method29465(local39, (float) (2.0D * 3.141592653589793D * (double) (anInt2245 * 121830427)) / 16384.0F);
			local3.method29476(local44);
			this.method15963(local3);
			anInt2247 = 0;
			anInt2245 = 0;
		}
		if (this.aClass123_16.method9023() != Class342.aClass342_4 || anInt2244 * -1947263625 == 0 && anInt2246 * -316778127 == 0) {
			return;
		}
		local3.method29470();
		@Pc(93) Class124_Sub2 local93 = (Class124_Sub2) this.aClass123_16.method8952();
		@Pc(97) Class93_Sub30 local97 = local93.method21404();
		@Pc(101) Class472 local101 = local97.method13870();
		@Pc(109) Class472 local109 = Class472.method29529(0.0F, 0.0F, (float) (anInt2246 * -316778127));
		local109.method29572(local3);
		local109.aFloat318 *= -1.0F;
		local101.method29543(local109);
		@Pc(129) Class472 local129 = Class472.method29529((float) (anInt2244 * -1947263625), 0.0F, 0.0F);
		local129.method29572(local3);
		local129.aFloat318 *= -1.0F;
		local101.method29543(local129);
		this.method15972(local101);
		local93.method9297(new Class93_Sub30(local97.anInt1609 * -2022654167, (int) local101.aFloat317, (int) local101.aFloat318, (int) local101.aFloat319));
		anInt2244 = 0;
		anInt2246 = 0;
	}

	@OriginalMember(owner = "client!anb", name = "i", descriptor = "(Lclient!ox;B)V", line = 121)
	void method15972(@OriginalArg(0) Class472 arg0) {
		if (aFloat157 != -1.0F && arg0.aFloat317 < aFloat157) {
			arg0.aFloat317 = aFloat157;
		}
		if (-1.0F != aFloat155 && arg0.aFloat317 > aFloat155) {
			arg0.aFloat317 = aFloat155;
		}
		if (aFloat158 != -1.0F && arg0.aFloat318 < aFloat158) {
			arg0.aFloat318 = aFloat158;
		}
		if (-1.0F != aFloat159 && arg0.aFloat318 > aFloat159) {
			arg0.aFloat318 = aFloat159;
		}
		if (aFloat156 != -1.0F && arg0.aFloat319 < aFloat156) {
			arg0.aFloat319 = aFloat156;
		}
		if (-1.0F != aFloat160 && arg0.aFloat319 > aFloat160) {
			arg0.aFloat319 = aFloat160;
		}
	}

	@OriginalMember(owner = "client!anb", name = "ao", descriptor = "(Lclient!ox;)V", line = 121)
	void method15983(@OriginalArg(0) Class472 arg0) {
		if (aFloat157 != -1.0F && arg0.aFloat317 < aFloat157) {
			arg0.aFloat317 = aFloat157;
		}
		if (-1.0F != aFloat155 && arg0.aFloat317 > aFloat155) {
			arg0.aFloat317 = aFloat155;
		}
		if (aFloat158 != -1.0F && arg0.aFloat318 < aFloat158) {
			arg0.aFloat318 = aFloat158;
		}
		if (-1.0F != aFloat159 && arg0.aFloat318 > aFloat159) {
			arg0.aFloat318 = aFloat159;
		}
		if (aFloat156 != -1.0F && arg0.aFloat319 < aFloat156) {
			arg0.aFloat319 = aFloat156;
		}
		if (-1.0F != aFloat160 && arg0.aFloat319 > aFloat160) {
			arg0.aFloat319 = aFloat160;
		}
	}

	@OriginalMember(owner = "client!anb", name = "aq", descriptor = "(Lclient!ox;)V", line = 121)
	void method15988(@OriginalArg(0) Class472 arg0) {
		if (aFloat157 != -1.0F && arg0.aFloat317 < aFloat157) {
			arg0.aFloat317 = aFloat157;
		}
		if (-1.0F != aFloat155 && arg0.aFloat317 > aFloat155) {
			arg0.aFloat317 = aFloat155;
		}
		if (aFloat158 != -1.0F && arg0.aFloat318 < aFloat158) {
			arg0.aFloat318 = aFloat158;
		}
		if (-1.0F != aFloat159 && arg0.aFloat318 > aFloat159) {
			arg0.aFloat318 = aFloat159;
		}
		if (aFloat156 != -1.0F && arg0.aFloat319 < aFloat156) {
			arg0.aFloat319 = aFloat156;
		}
		if (-1.0F != aFloat160 && arg0.aFloat319 > aFloat160) {
			arg0.aFloat319 = aFloat160;
		}
	}

	@OriginalMember(owner = "client!anb", name = "ax", descriptor = "(Lclient!ox;)V", line = 121)
	void method15989(@OriginalArg(0) Class472 arg0) {
		if (aFloat157 != -1.0F && arg0.aFloat317 < aFloat157) {
			arg0.aFloat317 = aFloat157;
		}
		if (-1.0F != aFloat155 && arg0.aFloat317 > aFloat155) {
			arg0.aFloat317 = aFloat155;
		}
		if (aFloat158 != -1.0F && arg0.aFloat318 < aFloat158) {
			arg0.aFloat318 = aFloat158;
		}
		if (-1.0F != aFloat159 && arg0.aFloat318 > aFloat159) {
			arg0.aFloat318 = aFloat159;
		}
		if (aFloat156 != -1.0F && arg0.aFloat319 < aFloat156) {
			arg0.aFloat319 = aFloat156;
		}
		if (-1.0F != aFloat160 && arg0.aFloat319 > aFloat160) {
			arg0.aFloat319 = aFloat160;
		}
	}

	@OriginalMember(owner = "client!anb", name = "av", descriptor = "(Lclient!ox;)V", line = 121)
	void method15990(@OriginalArg(0) Class472 arg0) {
		if (aFloat157 != -1.0F && arg0.aFloat317 < aFloat157) {
			arg0.aFloat317 = aFloat157;
		}
		if (-1.0F != aFloat155 && arg0.aFloat317 > aFloat155) {
			arg0.aFloat317 = aFloat155;
		}
		if (aFloat158 != -1.0F && arg0.aFloat318 < aFloat158) {
			arg0.aFloat318 = aFloat158;
		}
		if (-1.0F != aFloat159 && arg0.aFloat318 > aFloat159) {
			arg0.aFloat318 = aFloat159;
		}
		if (aFloat156 != -1.0F && arg0.aFloat319 < aFloat156) {
			arg0.aFloat319 = aFloat156;
		}
		if (-1.0F != aFloat160 && arg0.aFloat319 > aFloat160) {
			arg0.aFloat319 = aFloat160;
		}
	}

	@OriginalMember(owner = "client!anb", name = "aj", descriptor = "(Lclient!ox;)V", line = 121)
	void method15991(@OriginalArg(0) Class472 arg0) {
		if (aFloat157 != -1.0F && arg0.aFloat317 < aFloat157) {
			arg0.aFloat317 = aFloat157;
		}
		if (-1.0F != aFloat155 && arg0.aFloat317 > aFloat155) {
			arg0.aFloat317 = aFloat155;
		}
		if (aFloat158 != -1.0F && arg0.aFloat318 < aFloat158) {
			arg0.aFloat318 = aFloat158;
		}
		if (-1.0F != aFloat159 && arg0.aFloat318 > aFloat159) {
			arg0.aFloat318 = aFloat159;
		}
		if (aFloat156 != -1.0F && arg0.aFloat319 < aFloat156) {
			arg0.aFloat319 = aFloat156;
		}
		if (-1.0F != aFloat160 && arg0.aFloat319 > aFloat160) {
			arg0.aFloat319 = aFloat160;
		}
	}

	@OriginalMember(owner = "client!anb", name = "j", descriptor = "(Lclient!ox;IIIIIIB)V", line = 130)
	public void method15962(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat157 = arg1 == -1 ? -1.0F : arg0.aFloat317 - (float) (arg1 * 512);
		aFloat155 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.aFloat317;
		aFloat158 = arg5 == -1 ? -1.0F : -arg0.aFloat318 - (float) (arg5 * 512);
		aFloat159 = arg6 == -1 ? -1.0F : -arg0.aFloat318 + (float) (arg6 * 512);
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat319 - (float) (arg3 * 512);
		aFloat160 = arg4 == -1 ? -1.0F : arg0.aFloat319 + (float) (arg4 * 512);
	}

	@OriginalMember(owner = "client!anb", name = "ab", descriptor = "(Lclient!ox;IIIIII)V", line = 130)
	public void method15964(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat157 = arg1 == -1 ? -1.0F : arg0.aFloat317 - (float) (arg1 * 512);
		aFloat155 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.aFloat317;
		aFloat158 = arg5 == -1 ? -1.0F : -arg0.aFloat318 - (float) (arg5 * 512);
		aFloat159 = arg6 == -1 ? -1.0F : -arg0.aFloat318 + (float) (arg6 * 512);
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat319 - (float) (arg3 * 512);
		aFloat160 = arg4 == -1 ? -1.0F : arg0.aFloat319 + (float) (arg4 * 512);
	}

	@OriginalMember(owner = "client!anb", name = "ay", descriptor = "(Lclient!ox;IIIIII)V", line = 130)
	public void method15984(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat157 = arg1 == -1 ? -1.0F : arg0.aFloat317 - (float) (arg1 * 512);
		aFloat155 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.aFloat317;
		aFloat158 = arg5 == -1 ? -1.0F : -arg0.aFloat318 - (float) (arg5 * 512);
		aFloat159 = arg6 == -1 ? -1.0F : -arg0.aFloat318 + (float) (arg6 * 512);
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat319 - (float) (arg3 * 512);
		aFloat160 = arg4 == -1 ? -1.0F : arg0.aFloat319 + (float) (arg4 * 512);
	}

	@OriginalMember(owner = "client!anb", name = "aa", descriptor = "(Lclient!ox;IIIIII)V", line = 130)
	public void method15987(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat157 = arg1 == -1 ? -1.0F : arg0.aFloat317 - (float) (arg1 * 512);
		aFloat155 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.aFloat317;
		aFloat158 = arg5 == -1 ? -1.0F : -arg0.aFloat318 - (float) (arg5 * 512);
		aFloat159 = arg6 == -1 ? -1.0F : -arg0.aFloat318 + (float) (arg6 * 512);
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat319 - (float) (arg3 * 512);
		aFloat160 = arg4 == -1 ? -1.0F : arg0.aFloat319 + (float) (arg4 * 512);
	}

	@OriginalMember(owner = "client!anb", name = "af", descriptor = "(Lclient!ox;IIIIII)V", line = 130)
	public void method15992(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat157 = arg1 == -1 ? -1.0F : arg0.aFloat317 - (float) (arg1 * 512);
		aFloat155 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.aFloat317;
		aFloat158 = arg5 == -1 ? -1.0F : -arg0.aFloat318 - (float) (arg5 * 512);
		aFloat159 = arg6 == -1 ? -1.0F : -arg0.aFloat318 + (float) (arg6 * 512);
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat319 - (float) (arg3 * 512);
		aFloat160 = arg4 == -1 ? -1.0F : arg0.aFloat319 + (float) (arg4 * 512);
	}

	@OriginalMember(owner = "client!anb", name = "az", descriptor = "(Lclient!ox;IIIIII)V", line = 130)
	public void method15993(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		aFloat157 = arg1 == -1 ? -1.0F : arg0.aFloat317 - (float) (arg1 * 512);
		aFloat155 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.aFloat317;
		aFloat158 = arg5 == -1 ? -1.0F : -arg0.aFloat318 - (float) (arg5 * 512);
		aFloat159 = arg6 == -1 ? -1.0F : -arg0.aFloat318 + (float) (arg6 * 512);
		aFloat156 = arg3 == -1 ? -1.0F : arg0.aFloat319 - (float) (arg3 * 512);
		aFloat160 = arg4 == -1 ? -1.0F : arg0.aFloat319 + (float) (arg4 * 512);
	}

	@OriginalMember(owner = "client!anb", name = "n", descriptor = "(I)Z", line = 139)
	@Override
	public boolean method23132() {
		return !Float.isNaN(this.aClass471_4.aFloat314) && this.aClass123_16.method8957() != null;
	}

	@OriginalMember(owner = "client!anb", name = "z", descriptor = "()Z", line = 139)
	@Override
	public boolean method23125() {
		return !Float.isNaN(this.aClass471_4.aFloat314) && this.aClass123_16.method8957() != null;
	}

	@OriginalMember(owner = "client!anb", name = "t", descriptor = "(I)Lclient!ov;", line = 143)
	public Class471 method15969() {
		return new Class471(this.aClass471_4);
	}

	@OriginalMember(owner = "client!anb", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V", line = 147)
	@Override
	public void method23123(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class472 local5 = Class472.method29530(this.aClass123_16.method8957());
		local5.aFloat317 -= arg2;
		local5.aFloat319 -= arg3;
		local5.aFloat318 *= -1.0F;
		arg1.method29374(Class471.method29471(this.aClass471_4));
		arg1.method29386(local5);
		arg1.method29372();
		local5.method29532();
	}

	@OriginalMember(owner = "client!anb", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V", line = 147)
	@Override
	public void method23126(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class472 local5 = Class472.method29530(this.aClass123_16.method8957());
		local5.aFloat317 -= arg2;
		local5.aFloat319 -= arg3;
		local5.aFloat318 *= -1.0F;
		arg1.method29374(Class471.method29471(this.aClass471_4));
		arg1.method29386(local5);
		arg1.method29372();
		local5.method29532();
	}

	@OriginalMember(owner = "client!anb", name = "w", descriptor = "(Lclient!alw;I)V", line = 158)
	@Override
	public void method23119(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass471_4.method29462(arg0);
	}

	@OriginalMember(owner = "client!anb", name = "c", descriptor = "(Lclient!alw;)V", line = 158)
	@Override
	public void method23121(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass471_4.method29462(arg0);
	}

	@OriginalMember(owner = "client!anb", name = "r", descriptor = "(Lclient!alw;)V", line = 158)
	@Override
	public void method23129(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass471_4.method29462(arg0);
	}

	@OriginalMember(owner = "client!anb", name = "o", descriptor = "(Lclient!alw;)V", line = 158)
	@Override
	public void method23131(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass471_4.method29462(arg0);
	}

	@OriginalMember(owner = "client!anb", name = "v", descriptor = "(Lclient!alw;)V", line = 158)
	@Override
	public void method23130(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass471_4.method29462(arg0);
	}

	@OriginalMember(owner = "client!anb", name = "qi", descriptor = "(Lclient!yf;I)V", line = 7948)
	static final void method15996(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class93.method23972(local11, local14, arg0);
	}
}
