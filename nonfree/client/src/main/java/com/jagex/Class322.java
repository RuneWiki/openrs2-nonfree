package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public class Class322 {

	@OriginalMember(owner = "client!ih", name = "fo", descriptor = "Lclient!pw;")
	public static Class478 aClass478_95;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Lclient!ih;")
	static final Class322 aClass322_14 = new Class322(0, Class44.aClass44_15, 2);

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "Lclient!ih;")
	static final Class322 aClass322_12 = new Class322(1, Class44.aClass44_15, Class44.aClass44_15, 2, 3);

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "Lclient!ih;")
	static final Class322 aClass322_8 = new Class322(2, Class44.aClass44_15, 3);

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!ih;")
	static final Class322 aClass322_11 = new Class322(3, Class44.aClass44_15, Class44.aClass44_15, 3, 4);

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "Lclient!ih;")
	static final Class322 aClass322_9 = new Class322(4, Class44.aClass44_15, 4);

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "Lclient!ih;")
	static final Class322 aClass322_5 = new Class322(5, Class44.aClass44_15, Class44.aClass44_15, 4, 5);

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "Lclient!ih;")
	static final Class322 aClass322_21 = new Class322(6, Class44.aClass44_15, Class44.aClass44_15, 5, 98, true, true);

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "Lclient!ih;")
	static final Class322 aClass322_18 = new Class322(7, Class44.aClass44_15, 99);

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "Lclient!ih;")
	static final Class322 aClass322_13 = new Class322(8, Class44.aClass44_15, 100);

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!ih;")
	static final Class322 aClass322_7 = new Class322(9, Class44.aClass44_103, Class44.aClass44_103, 0, 92, true, true);

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "Lclient!ih;")
	static final Class322 aClass322_15 = new Class322(10, Class44.aClass44_103, Class44.aClass44_103, 92, 93);

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "Lclient!ih;")
	static final Class322 aClass322_16 = new Class322(11, Class44.aClass44_103, Class44.aClass44_103, 94, 95);

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!ih;")
	static final Class322 aClass322_17 = new Class322(12, Class44.aClass44_103, Class44.aClass44_103, 96, 97);

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "Lclient!ih;")
	static final Class322 aClass322_10 = new Class322(13, Class44.aClass44_103, 97);

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient!ih;")
	static final Class322 aClass322_19 = new Class322(14, Class44.aClass44_103, 97);

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "Lclient!ih;")
	static final Class322 aClass322_22 = new Class322(15, Class44.aClass44_103, 100);

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Lclient!ih;")
	static final Class322 aClass322_6 = new Class322(16, Class44.aClass44_103, 100);

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "Lclient!ih;")
	static final Class322 aClass322_20 = new Class322(17, Class44.aClass44_103, 100);

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public final int anInt4077;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	final int anInt4078;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "Lclient!abt;")
	final Class44 aClass44_177;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!abt;")
	final Class44 aClass44_178;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	final int anInt4079;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Z")
	final boolean aBoolean698;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Z")
	final boolean aBoolean699;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "(B)[Lclient!ih;", line = 37)
	static Class322[] method27465() {
		return new Class322[] { aClass322_14, aClass322_12, aClass322_8, aClass322_11, aClass322_9, aClass322_5, aClass322_21, aClass322_18, aClass322_13, aClass322_7, aClass322_15, aClass322_16, aClass322_17, aClass322_10, aClass322_19, aClass322_22, aClass322_6, aClass322_20 };
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILclient!abt;I)V", line = 41)
	Class322(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILclient!abt;Lclient!abt;II)V", line = 45)
	Class322(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILclient!abt;Lclient!abt;IIZZ)V", line = 48)
	Class322(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4077 = arg0 * -1308202205;
		this.aClass44_178 = arg1;
		this.aClass44_177 = arg2;
		this.anInt4078 = arg3 * -1471041949;
		this.anInt4079 = arg4 * -1163696883;
		this.aBoolean698 = arg5;
		this.aBoolean699 = arg6;
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "(S)V", line = 57)
	static void method27466() {
		@Pc(4) Class115_Sub2 local4 = (Class115_Sub2) Class434.aClass107_Sub1_1.method8871();
		@Pc(9) Class149_Sub3 local9 = (Class149_Sub3) Class434.aClass107_Sub1_1.method8873();
		@Pc(13) Class447 local13 = local4.method21213();
		@Pc(17) Class452 local17 = local9.method16735();
		if (client.aClass277_6 != null) {
			@Pc(25) int local25 = client.aClass277_6.anInt3874 * -881188269;
			@Pc(30) int local30 = client.aClass277_6.anInt3875 * -1279656873;
			@Pc(32) float local32 = 1000.0F;
			@Pc(44) float local44 = (float) (Math.atan((double) ((float) local25 / 2.0F / local32)) * 2.0D);
			@Pc(56) float local56 = (float) (Math.atan((double) ((float) local30 / 2.0F / local32)) * 2.0D);
			try {
				Class434.aClass107_Sub1_1.method8842(local44, local56);
			} catch (@Pc(63) Exception_Sub2 local63) {
			}
		}
		if (Class60.aClass138_1.method14242()) {
			@Pc(69) Class452 local69 = Class452.method29269();
			local69.method29292(1.0F, 0.0F, 0.0F, (float) (Class60.aClass138_1.method14225() - RuntimeException_Sub4.anInt3175 * -230736199) / 200.0F);
			local17.method29330(local69);
			@Pc(92) Class447 local92 = Class447.method29120(0.0F, 1.0F, 0.0F);
			local92.method29198(local17);
			@Pc(97) Class452 local97 = Class452.method29269();
			local97.method29290(local92, (float) (Class434.anInt4909 * 1453851069 - Class60.aClass138_1.method14234()) / 200.0F);
			local17.method29330(local97);
			local9.method16715(local17);
		}
		Class434.anInt4909 = Class60.aClass138_1.method14234() * 742277525;
		RuntimeException_Sub4.anInt3175 = Class60.aClass138_1.method14225() * -1144821879;
		local17.method29307();
		@Pc(141) Class447 local141;
		if (Class662.aClass141_1.method14784(98)) {
			local141 = Class447.method29120(0.0F, 0.0F, 25.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(99)) {
			local141 = Class447.method29120(0.0F, 0.0F, -25.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(96)) {
			local141 = Class447.method29120(-25.0F, 0.0F, 0.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		if (Class662.aClass141_1.method14784(97)) {
			local141 = Class447.method29120(25.0F, 0.0F, 0.0F);
			local141.method29198(local17);
			local141.aFloat276 *= -1.0F;
			local13.method29146(local141);
		}
		@Pc(233) Class77_Sub36 local233 = new Class77_Sub36(0, (int) local13.aFloat277, (int) local13.aFloat276, (int) local13.aFloat278);
		local4.method10238(local233);
		@Pc(241) Class595 local241 = client.aClass517_1.method30409();
		@Pc(248) int local248 = local241.anInt5504 * -424199969 << 9;
		@Pc(255) int local255 = local241.anInt5506 * -1166289421 << 9;
		Class434.aClass107_Sub1_1.method8778(0.02F, client.aClass517_1.method30459().anIntArrayArrayArray14, client.aClass517_1.method30441(), local248, local255);
	}

	@OriginalMember(owner = "client!ih", name = "bs", descriptor = "(Lclient!apv;ZB)V", line = 1511)
	static void method27467(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Class683.anInt5826 * 324852453 >= 407) {
			return;
		}
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != arg0) {
			@Pc(176) String local176;
			@Pc(65) boolean local65;
			@Pc(96) int local96;
			if (arg0.anInt2908 * -825066439 == 0) {
				local65 = true;
				if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2907 * 800727223 != -1 && arg0.anInt2907 * 800727223 != -1) {
					local96 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2907 * 800727223 < arg0.anInt2907 * 800727223 ? Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2907 * 800727223 : arg0.anInt2907 * 800727223;
					@Pc(106) int local106 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2904 * 1423663301 - arg0.anInt2904 * 1423663301;
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local106 > local96) {
						local65 = false;
					}
				}
				@Pc(129) String local129 = client.aClass670_4 == Class670.aClass670_6 ? Class44.aClass44_137.method713(Class128.aClass667_3) : Class44.aClass44_135.method713(Class128.aClass667_3);
				if (arg0.anInt2904 * 1423663301 >= arg0.anInt2906 * -2058823415) {
					local176 = arg0.method21176(true) + (local65 ? Class320.method27453(arg0.anInt2904 * 1423663301, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2904 * 1423663301) : Class192.method25433(16777215)) + Class184.aString134 + local129 + arg0.anInt2904 * 1423663301 + Class184.aString132;
				} else {
					local176 = arg0.method21176(true) + (local65 ? Class320.method27453(arg0.anInt2904 * 1423663301, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2904 * 1423663301) : Class192.method25433(16777215)) + Class184.aString134 + local129 + arg0.anInt2904 * 1423663301 + "+" + (arg0.anInt2906 * -2058823415 - arg0.anInt2904 * 1423663301) + Class184.aString132;
				}
			} else if (arg0.anInt2908 * -825066439 == -1) {
				local176 = arg0.method21176(true);
			} else {
				local176 = arg0.method21176(true) + Class184.aString134 + Class44.aClass44_136.method713(Class128.aClass667_3) + arg0.anInt2908 * -825066439 + Class184.aString132;
			}
			local65 = false;
			if (arg0.aClass628_1 != null && arg0.aClass628_1.anInt5660 * 1568742735 != -1) {
				@Pc(287) Class333 local287 = (Class333) Class578.aClass35_Sub3_1.method18319(arg0.aClass628_1.anInt5660 * 1568742735);
				if (local287.aBoolean717) {
					local65 = true;
					local176 = ((Class333) Class578.aClass35_Sub3_1.method18319(arg0.aClass628_1.anInt5660 * 1568742735)).aString202;
					if (local287.anInt4105 * -927618257 != 0) {
						@Pc(322) String local322 = Class670.aClass670_6 == client.aClass670_4 ? Class44.aClass44_137.method713(Class128.aClass667_3) : Class44.aClass44_135.method713(Class128.aClass667_3);
						local176 = local176 + Class320.method27453(local287.anInt4105 * -927618257, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2904 * 1423663301) + Class184.aString134 + local322 + local287.anInt4105 * -927618257 + Class184.aString132;
					}
				}
			}
			if (client.aBoolean619 && !arg1 && (Class96_Sub15.anInt893 * 460977285 & 0x8) != 0) {
				Class155.method23634(client.aString160, client.aString161 + " " + Class184.aString136 + " " + Class192.method25433(16777215) + local176, Class130.anInt1407 * -731032933, 15, -1, (long) (arg0.anInt2867 * 1126388985), 0, 0, true, false, (long) (arg0.anInt2867 * 1126388985), false);
			}
			if (!arg1) {
				for (local96 = 7; local96 >= 0; local96--) {
					if (client.aStringArray24[local96] != null) {
						@Pc(415) short local415 = 0;
						if (client.aStringArray24[local96].equalsIgnoreCase(Class44.aClass44_130.method713(Class128.aClass667_3))) {
							if (Class632.aClass632_4 == client.aClass632_1) {
								continue;
							}
							if (client.aClass632_1 == Class632.aClass632_6) {
								local415 = 2000;
							} else if (Class632.aClass632_3 == client.aClass632_1 && arg0.anInt2904 * 1423663301 > Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2904 * 1423663301) {
								local415 = 2000;
							}
							if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 == 0 || arg0.anInt2911 * 676699829 == 0) {
								if (arg0.aBoolean486) {
									local415 = 2000;
								}
							} else if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2911 * 676699829 == arg0.anInt2911 * 676699829) {
								local415 = 2000;
							} else {
								local415 = 0;
							}
						} else if (client.aBooleanArray18[local96]) {
							local415 = 2000;
						}
						@Pc(493) short local493 = (short) (local415 + client.aShortArray86[local96]);
						@Pc(506) int local506 = client.anIntArray332[local96] == -1 ? client.anInt3473 * 2068410197 : client.anIntArray332[local96];
						@Pc(512) int local512 = local65 ? 16776960 : 16777215;
						Class155.method23634(client.aStringArray24[local96], Class192.method25433(local512) + local176, local506, local493, -1, (long) (arg0.anInt2867 * 1126388985), 0, 0, true, false, (long) (arg0.anInt2867 * 1126388985), false);
					}
				}
			} else if (!local65) {
				Class155.method23634(Class192.method25433(13421772) + local176, "", -1, -1, 0, 0L, 0, 0, false, true, (long) (arg0.anInt2867 * 1126388985), false);
			}
			if (!arg1 && !local65) {
				for (@Pc(586) Class77_Sub1_Sub7 local586 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36395(); local586 != null; local586 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36406()) {
					if (local586.anInt2987 * -1986934021 == 23) {
						local586.aString94 = Class192.method25433(16777215) + local176;
						break;
					}
				}
			}
		} else if (client.aBoolean619 && (Class96_Sub15.anInt893 * 460977285 & 0x10) != 0) {
			Class155.method23634(client.aString160, client.aString161 + " " + Class184.aString136 + " " + Class192.method25433(16777215) + Class44.aClass44_108.method713(Class128.aClass667_3), Class130.anInt1407 * -731032933, 16, -1, 0L, 0, 0, true, false, (long) (arg0.anInt2867 * 1126388985), false);
		}
	}

	@OriginalMember(owner = "client!ih", name = "aac", descriptor = "(Lclient!yf;I)V", line = 9231)
	static final void method27468(@OriginalArg(0) Class665 arg0) {
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = arg0.aClass368_3.aString210;
	}

	@OriginalMember(owner = "client!ih", name = "aib", descriptor = "(Lclient!yf;B)V", line = 10913)
	static final void method27469(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (Class136_Sub1.aClass12_16 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			@Pc(20) Class77 local20 = Class136_Sub1.aClass12_16.method173((long) local12);
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local20 == null ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "amk", descriptor = "(Lclient!yf;S)V", line = 11760)
	static final void method27470(@OriginalArg(0) Class665 arg0) {
		if (Class597.aClass107_Sub1_2.method8880() != Class331.aClass331_5) {
			throw new RuntimeException();
		}
		((Class115_Sub2) Class597.aClass107_Sub1_2.method8871()).method10242(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1);
	}
}
