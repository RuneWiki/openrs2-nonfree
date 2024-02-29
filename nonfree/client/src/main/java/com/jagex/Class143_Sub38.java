package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amu")
public class Class143_Sub38 extends Class143 {

	@OriginalMember(owner = "client!amu", name = "w", descriptor = "I")
	public static final int anInt2287 = 4;

	@OriginalMember(owner = "client!amu", name = "t", descriptor = "I")
	public static final int anInt2288 = 3;

	@OriginalMember(owner = "client!amu", name = "q", descriptor = "I")
	public static final int anInt2289 = 2;

	@OriginalMember(owner = "client!amu", name = "x", descriptor = "I")
	public static final int anInt2290 = 1;

	@OriginalMember(owner = "client!amu", name = "d", descriptor = "I")
	public static final int anInt2291 = 0;

	@OriginalMember(owner = "client!amu", name = "<init>", descriptor = "(Lclient!akq;)V", line = 14)
	public Class143_Sub38(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amu", name = "<init>", descriptor = "(ILclient!akq;)V", line = 18)
	public Class143_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amu", name = "i", descriptor = "(B)V", line = 22)
	public void method16158() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 4) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amu", name = "u", descriptor = "()V", line = 22)
	public void method16159() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 4) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amu", name = "p", descriptor = "(I)I", line = 26)
	@Override
	int method16256() {
		return 0;
	}

	@OriginalMember(owner = "client!amu", name = "y", descriptor = "()I", line = 26)
	@Override
	int method16259() {
		return 0;
	}

	@OriginalMember(owner = "client!amu", name = "t", descriptor = "()I", line = 26)
	@Override
	int method16257() {
		return 0;
	}

	@OriginalMember(owner = "client!amu", name = "w", descriptor = "()I", line = 26)
	@Override
	int method16260() {
		return 0;
	}

	@OriginalMember(owner = "client!amu", name = "c", descriptor = "(II)I", line = 30)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "s", descriptor = "(I)I", line = 30)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "r", descriptor = "(I)I", line = 30)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "g", descriptor = "(I)I", line = 30)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "z", descriptor = "(I)I", line = 30)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amu", name = "l", descriptor = "(II)V", line = 34)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amu", name = "x", descriptor = "(I)V", line = 34)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amu", name = "q", descriptor = "(I)V", line = 34)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amu", name = "d", descriptor = "(I)V", line = 34)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amu", name = "k", descriptor = "(I)I", line = 38)
	public int method16160() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amu", name = "v", descriptor = "(I)V", line = 51)
	static void method16161() {
		if (Class132.aClass86_8 != null) {
			Class132.aClass86_8.method19929();
			Class132.aClass86_8 = null;
			Class657.aClass94_13 = null;
		}
	}

	@OriginalMember(owner = "client!amu", name = "kn", descriptor = "([Lclient!gm;IIIIIIIIZI)V", line = 10298)
	public static final void method16162(@OriginalArg(0) Class277[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) Class277 local15 = arg0[local7];
			if (local15 != null && (arg1 == local15.anInt3876 * -742015869 || arg1 == -1412584499 && client.aClass277_4 == local15)) {
				@Pc(70) int local70;
				if (arg8 == -1) {
					client.aRectangleArray1[client.anInt3494 * 1372795039].setBounds(local15.anInt3872 * -1196182029 + arg6, local15.anInt3873 * -612037017 + arg7, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873);
					local70 = (client.anInt3494 += 799140703) * 1372795039 - 1;
				} else {
					local70 = arg8;
				}
				local15.anInt3952 = local70 * -182601423;
				local15.anInt3953 = client.anInt3414 * 476982323;
				if (!client.method25381(local15)) {
					if (local15.anInt3866 * 1231845787 != 0) {
						Class143_Sub9.method15199(local15);
					}
					@Pc(103) int local103 = local15.anInt3872 * -1196182029 + arg6;
					@Pc(110) int local110 = local15.anInt3873 * -612037017 + arg7;
					@Pc(115) int local115 = local15.anInt3884 * 1943720095;
					if (client.aBoolean600 && (client.method25376(local15).anInt1558 * 1837782131 != 0 || local15.anInt3857 * -1960530827 == 0) && local115 > 127) {
						local115 = 127;
					}
					@Pc(187) int local187;
					@Pc(191) int local191;
					if (client.aClass277_4 == local15) {
						if (arg1 != -1412584499 && (local15.anInt3924 * -712285239 == Class277.anInt3864 * 1319143699 || local15.anInt3924 * -712285239 == Class277.anInt3926 * 1098206671 || client.method25376(local15).method13662() && Class277.anInt3848 * 2113390179 != local15.anInt3924 * -712285239)) {
							Class525.aClass277Array5 = arg0;
							Class56.anInt189 = arg6 * 803767343;
							Class636.anInt5713 = arg7 * -831277231;
							continue;
						}
						if (client.aBoolean624 && client.aBoolean604) {
							local187 = Class60.aClass138_1.method14234();
							local191 = Class60.aClass138_1.method14225();
							local187 -= client.anInt3429 * -1626933515;
							local191 -= client.anInt3387 * 1953389231;
							if (local187 < client.anInt3484 * -169004095) {
								local187 = client.anInt3484 * -169004095;
							}
							if (local15.anInt3874 * -881188269 + local187 > client.anInt3484 * -169004095 + client.anInt3486 * -1152577469) {
								local187 = client.anInt3484 * -169004095 + client.anInt3486 * -1152577469 - local15.anInt3874 * -881188269;
							}
							if (local191 < client.anInt3445 * -171218513) {
								local191 = client.anInt3445 * -171218513;
							}
							if (local191 + local15.anInt3875 * -1279656873 > client.anInt3490 * 1976194639 + client.anInt3445 * -171218513) {
								local191 = client.anInt3490 * 1976194639 + client.anInt3445 * -171218513 - local15.anInt3875 * -1279656873;
							}
							if (client.method25376(local15).method13662()) {
								Class341.method27765(local187, local191, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873);
							}
							if (Class277.anInt3848 * 2113390179 != local15.anInt3924 * -712285239) {
								local103 = local187;
								local110 = local191;
							}
						}
						if (Class277.anInt3926 * 1098206671 == local15.anInt3924 * -712285239) {
							local115 = 128;
						}
					}
					@Pc(326) int local326;
					@Pc(328) int local328;
					@Pc(336) int local336;
					@Pc(343) int local343;
					if (local15.anInt3857 * -1960530827 == 2) {
						local187 = arg2;
						local191 = arg3;
						local326 = arg4;
						local328 = arg5;
					} else {
						local336 = local103 + local15.anInt3874 * -881188269;
						local343 = local15.anInt3875 * -1279656873 + local110;
						if (local15.anInt3857 * -1960530827 == 9) {
							local336++;
							local343++;
						}
						local187 = local103 > arg2 ? local103 : arg2;
						local191 = local110 > arg3 ? local110 : arg3;
						local326 = local336 < arg4 ? local336 : arg4;
						local328 = local343 < arg5 ? local343 : arg5;
					}
					if (local187 < local326 && local191 < local328) {
						@Pc(666) int local666;
						@Pc(717) int local717;
						@Pc(656) Class83 local656;
						@Pc(692) int local692;
						@Pc(686) int local686;
						@Pc(709) int local709;
						if (local15.anInt3866 * 1231845787 != 0) {
							if (local15.anInt3866 * 1231845787 == Class277.anInt3933 * -24082201 || local15.anInt3866 * 1231845787 == Class277.anInt3851 * -28714589) {
								if (client.aBoolean622) {
									Class284.aClass86_9.method20012();
									Class614.method32337(local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873, Class277.anInt3851 * -28714589 == local15.anInt3866 * 1231845787);
									Class317.method27387(local70, local187, local191, local326, local328, local103, local110);
									Class284.aClass86_9.method20078();
									Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
									client.aBooleanArray17[local70] = true;
								}
								continue;
							}
							if (local15.anInt3866 * 1231845787 == Class277.anInt3852 * -387004955 && client.anInt3443 * -1468443459 == 1) {
								if (local15.anInt3857 * -1960530827 != 5 || local15.method26633(Class284.aClass86_9) != null) {
									Class96_Sub20.method7746(Class284.aClass86_9, local15, local103, local110);
									Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (Class277.anInt3914 * 94559621 == local15.anInt3866 * 1231845787) {
								Class244.method26112(Class284.aClass86_9, local103, local110, local15);
								continue;
							}
							if (Class277.anInt3861 * 1478916581 == local15.anInt3866 * 1231845787) {
								Class272.method26526(Class284.aClass86_9, local103, local110, local15, local15.anInt3883 * 290091559 % 64);
								continue;
							}
							if (local15.anInt3866 * 1231845787 == Class277.anInt3853 * 1576053415) {
								if (local15.method26633(Class284.aClass86_9) != null) {
									Class284.aClass86_9.method20012();
									Class199.method25497(local15, local103, local110);
									Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
								}
								continue;
							}
							if (Class277.anInt3854 * -718771705 == local15.anInt3866 * 1231845787) {
								Class574.method31547(Class284.aClass86_9, local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873);
								client.aBooleanArray17[local70] = true;
								Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Class277.anInt3855 * 627941839 == local15.anInt3866 * 1231845787) {
								Class139.method14333(Class284.aClass86_9, local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873);
								client.aBooleanArray17[local70] = true;
								Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
								continue;
							}
							if (Class277.anInt3950 * -1022419033 == local15.anInt3866 * 1231845787) {
								if (client.aBoolean626 || client.aBoolean596) {
									Class385.method28345(local103, local110, local15);
									client.aBooleanArray17[local70] = true;
								}
								continue;
							}
							if (Class277.anInt3846 * -1927636305 == local15.anInt3866 * 1231845787) {
								local656 = Class655.method32992();
								if (local656 != null) {
									local343 = arg4 - arg2;
									local666 = arg5 - arg3;
									@Pc(672) float local672 = (float) local343 / (float) local666;
									@Pc(680) float local680 = (float) local656.method18169() / (float) local656.method18171();
									if (local672 < local680) {
										local686 = local343;
										local692 = (int) ((float) local343 / local680);
									} else {
										local686 = (int) (local680 * (float) local666);
										local692 = local666;
									}
									local709 = arg2 + (local343 - local686) / 2;
									local717 = (local666 - local692) / 2 + arg3;
									local656.method18125(local709, local717, local686, local692);
								}
								continue;
							}
							if (local15.anInt3866 * 1231845787 == Class277.anInt3940 * 1835705285) {
								if (Class257.method26227() && Class329.method27586()) {
									Class667.method33162(arg2, arg3, arg4, arg5);
								}
								continue;
							}
						}
						@Pc(920) int local920;
						@Pc(924) int local924;
						if (local15.anInt3857 * -1960530827 == 0) {
							if (local15.anInt3866 * 1231845787 == Class277.anInt3858 * -593375903) {
								Class284.aClass86_9.method20012();
								client.aClass517_1.method30443().method32247(client.aClass517_1);
								Class284.aClass86_9.method20134(local103, local110, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
							}
							method16162(arg0, local15.anInt3863 * -1278450723, local187, local191, local326, local328, local103 - local15.anInt3879 * -488164841, local110 - local15.anInt3880 * 2142374941, local70, arg9);
							if (local15.aClass277Array4 != null) {
								method16162(local15.aClass277Array4, local15.anInt3863 * -1278450723, local187, local191, local326, local328, local103 - local15.anInt3879 * -488164841, local110 - local15.anInt3880 * 2142374941, local70, arg9);
							}
							@Pc(840) Class77_Sub38 local840 = (Class77_Sub38) client.aClass12_20.method173((long) (local15.anInt3863 * -1278450723));
							if (local840 != null) {
								Class700.method36491(local840.anInt3113 * 1225863589, local187, local191, local326, local328, local103 - local15.anInt3879 * -488164841, local110 - local15.anInt3880 * 2142374941, local70);
							}
							if (Class277.anInt3858 * -593375903 == local15.anInt3866 * 1231845787) {
								if (Class284.aClass86_9.method20136()) {
									Class284.aClass86_9.method20135(local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873);
									if (client.anInt3390 * -1850530127 == 16) {
										Class252.method26184(local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873);
									}
								}
								if (client.anInt3443 * -1468443459 == 3) {
									local343 = client.anInt3449 * 436142635;
									local666 = client.anInt3421 * 2087079589;
									local920 = client.anInt3460 * 849699371;
									local924 = client.anInt3422 * 163760341;
									if (client.anInt3414 < client.anInt3419 * 691235653) {
										@Pc(947) float local947 = (float) (client.anInt3414 - client.anInt3485 * 1433220121) * 1.0F / (float) (client.anInt3419 * 691235653 - client.anInt3485 * 1433220121);
										local343 = (int) ((float) (Class143_Sub35.anInt2272 * -946888063) * (1.0F - local947) + (float) (client.anInt3449 * 436142635) * local947);
										local666 = (int) ((float) (client.anInt3421 * 2087079589) * local947 + (1.0F - local947) * (float) (Class488.anInt5047 * 224715311));
										local920 = (int) ((float) (client.anInt3460 * 849699371) * local947 + (1.0F - local947) * (float) (Class394.anInt4600 * -1967749899));
										local924 = (int) (local947 * (float) (client.anInt3422 * 163760341) + (float) (Class405.anInt4704 * 1339734199) * (1.0F - local947));
									}
									if (local343 > 0) {
										Class284.aClass86_9.method19986(local187, local191, local326 - local187, local328 - local191, local343 << 24 | local666 << 16 | local920 << 8 | local924);
									}
								}
							}
							Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
						}
						if (client.aBooleanArray19[local70] || client.anInt3530 * 683407653 > 1) {
							if (local15.anInt3857 * -1960530827 == 3) {
								if (local115 == 0) {
									if (local15.aBoolean663) {
										Class284.aClass86_9.method20088(local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873, local15.anInt3883 * 290091559 | 0xFF000000, 0);
									} else {
										Class284.aClass86_9.method20087(local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873, local15.anInt3883 * 290091559 | 0xFF000000, 0);
									}
								} else if (local15.aBoolean663) {
									Class284.aClass86_9.method20088(local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873, 255 - (local115 & 0xFF) << 24 | local15.anInt3883 * 290091559 & 0xFFFFFF, 1);
								} else {
									Class284.aClass86_9.method20087(local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873, 255 - (local115 & 0xFF) << 24 | local15.anInt3883 * 290091559 & 0xFFFFFF, 1);
								}
							} else if (local15.anInt3857 * -1960530827 == 4) {
								local336 = 255 - (local115 & 0xFF);
								if (local336 != 0) {
									@Pc(1188) Class94 local1188 = local15.method26601(Class367.aClass415_1, client.anInterface51_1);
									if (local1188 != null) {
										local666 = local15.anInt3883 * 290091559;
										@Pc(1205) String local1205 = local15.aString178;
										if (local15.anInt3936 * 403396513 != -1) {
											@Pc(1220) Class18 local1220 = (Class18) Class537.aClass35_Sub7_1.method18319(local15.anInt3936 * 403396513);
											local1205 = local1220.aString2;
											if (local1205 == null) {
												local1205 = "null";
											}
											if ((local1220.anInt101 * 1113844363 == 1 || local15.anInt3934 * -148110895 != 1) && local15.anInt3934 * -148110895 != -1) {
												local1205 = Class192.method25433(16748608) + local1205 + Class184.aString135 + " x" + Class7.method68(local15.anInt3934 * -148110895);
											}
										}
										if (local15 == client.aClass277_5) {
											local1205 = Class44.aClass44_105.method713(Class128.aClass667_3);
											local666 = local15.anInt3883 * 290091559;
										}
										if (client.aBoolean608) {
											Class284.aClass86_9.method20079(local103, local110, local103 + local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873 + local110);
										}
										local336 <<= 0x18;
										if (local15.aBoolean679) {
											local1188.method7630(local1205, local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873, local336 | local666, local15.aBoolean678 ? local336 : -1, local15.anInt3912 * -1049814117, local15.anInt3911 * 183230983, client.aRandom2, Class703.anInt5889, client.anIntArray338, Class148.aClass83Array6, null);
										} else {
											local1188.method7617(local1205, local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873, local336 | local666, local15.aBoolean678 ? local336 : -1, local15.anInt3912 * -1049814117, local15.anInt3911 * 183230983, local15.anInt3907 * -1959194819, local15.anInt3913 * 741572507, Class148.aClass83Array6, null, null, 0, 0);
										}
										if (client.aBoolean608) {
											Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
										}
									} else if (Class277.aBoolean664) {
										Class461.method29531(local15);
									}
								}
							} else {
								@Pc(1659) int local1659;
								@Pc(1605) boolean local1605;
								if (local15.anInt3857 * -1960530827 == 5) {
									if (local15.anInt3939 * -1980976335 >= 0) {
										local15.method26614(Class214.aClass35_Sub6_1, Class497.aClass35_Sub9_1).method30308(Class284.aClass86_9, 0, local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873, local15.anInt3928 * -461629 << 3, local15.anInt3941 * -976080175 << 3, 0);
									} else {
										if (local15.anInt3936 * 403396513 != -1) {
											@Pc(1456) Class628 local1456 = local15.aBoolean683 ? Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 : null;
											local656 = Class537.aClass35_Sub7_1.method17008(Class284.aClass86_9, local15.anInt3936 * 403396513, local15.anInt3934 * -148110895, local15.anInt3887 * 973326593, local15.anInt3930 * 2071487835 | 0xFF000000, local15.anInt3900 * 1245616333, local1456);
										} else if (local15.anInt3859 * -154373687 == -1) {
											local656 = local15.method26596(Class284.aClass86_9);
										} else {
											local656 = (Class83) client.aClass232_66.method25835((long) (local15.anInt3859 * -154373687));
											if (local656 == null && !client.aMap14.containsKey(local15.anInt3859 * -154373687)) {
												try {
													client.aMap14.put(local15.anInt3859 * -154373687, Class486.aClass569_1.method31414(new URL(client.aString155 + "/img/image_" + local15.anInt3859 * -154373687 + ".png?a=" + Class280.method26667())));
												} catch (@Pc(1545) MalformedURLException local1545) {
													Class293.method27014(null, local1545);
												}
											}
										}
										if (local656 != null) {
											local343 = local656.method18121();
											local666 = local656.method18198();
											local920 = 255 - (local115 & 0xFF);
											if (local920 != 0) {
												if (local15.anInt3883 * 290091559 == -1) {
													local924 = 16777215;
												} else {
													local924 = local15.anInt3883 * 290091559 & 0xFFFFFF;
													if (local924 == 0) {
														local924 = 16777215;
													}
												}
												local924 |= local920 << 24;
												local1605 = local924 != -1;
												if (local15.aBoolean669) {
													Class284.aClass86_9.method20079(local103, local110, local103 + local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873 + local110);
													if (local15.anInt3886 * 1994134509 != 0) {
														local692 = (local343 - 1 + local15.anInt3874 * -881188269) / local343;
														local709 = (local15.anInt3875 * -1279656873 + (local666 - 1)) / local666;
														for (local717 = 0; local717 < local692; local717++) {
															for (local1659 = 0; local1659 < local709; local1659++) {
																if (local1605) {
																	local656.method18147((float) local343 / 2.0F + (float) (local717 * local343 + local103), (float) (local110 + local1659 * local666) + (float) local666 / 2.0F, 4096, local15.anInt3886 * 1994134509, 0, local924, 1);
																} else {
																	local656.method18142((float) (local343 * local717 + local103) + (float) local343 / 2.0F, (float) (local110 + local1659 * local666) + (float) local666 / 2.0F, 4096, local15.anInt3886 * 1994134509);
																}
															}
														}
													} else if (local1605) {
														local656.method18179(local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873, 0, local924, 1);
													} else {
														local656.method18133(local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873);
													}
													Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
												} else if (local1605) {
													if (local15.anInt3886 * 1994134509 != 0) {
														local656.method18147((float) (local15.anInt3874 * -881188269) / 2.0F + (float) local103, (float) (local15.anInt3875 * -1279656873) / 2.0F + (float) local110, local15.anInt3874 * -1574621184 / local343, local15.anInt3886 * 1994134509, 0, local924, 1);
													} else if (local343 == local15.anInt3874 * -881188269 && local15.anInt3875 * -1279656873 == local666) {
														local656.method18177(local103, local110, 0, local924, 1);
													} else {
														local656.method18129(local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873, 0, local924, 1);
													}
												} else if (local15.anInt3886 * 1994134509 != 0) {
													local656.method18150((float) (local15.anInt3874 * -881188269) / 2.0F + (float) local103, (float) (local15.anInt3875 * -1279656873) / 2.0F + (float) local110, (float) local343 / 2.0F, (float) local666 / 2.0F, local15.anInt3874 * -1574621184 / local343, local15.anInt3875 * -1614450688 / local666, local15.anInt3886 * 1994134509, 1, -1, 1);
												} else if (local15.anInt3874 * -881188269 == local343 && local15.anInt3875 * -1279656873 == local666) {
													local656.method18123(local103, local110);
												} else {
													local656.method18125(local103, local110, local15.anInt3874 * -881188269, local15.anInt3875 * -1279656873);
												}
											}
										} else if (Class277.aBoolean664) {
											Class461.method29531(local15);
										}
									}
								} else if (local15.anInt3857 * -1960530827 == 6) {
									Class284.aClass86_9.method20012();
									@Pc(1949) Class84 local1949 = null;
									local343 = 2048;
									if (local15.anInt3903 * -626632091 != 0) {
										local343 |= 0x80000;
									}
									local666 = 0;
									if (local15.anInt3936 * 403396513 == -1) {
										@Pc(2041) Class104_Sub1_Sub1_Sub1_Sub2 local2041;
										if (local15.anInt3888 * -1866862435 == 3) {
											local920 = local15.anInt3889 * 939166901;
											if (local920 >= 0 && local920 < 2048) {
												local2041 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local920];
												if (local2041 != null && (client.anInt3389 * -643758853 == local920 || Class516.method30379(local2041.aString82) == local15.anInt3919 * 27898029)) {
													local1949 = local15.method26605(Class284.aClass86_9, local343, Class96_Sub23.aClass35_Sub15_1, Class333.aClass35_Sub14_1, Class578.aClass35_Sub3_1, Class537.aClass35_Sub7_1, Class96_Sub11.aClass35_Sub2_3, Class55.aClass124_1, Class55.aClass124_1, local15.aClass151_6, local2041.aClass628_1);
													if (local1949 == null && Class277.aBoolean664) {
														Class461.method29531(local15);
													}
												}
											}
										} else if (local15.anInt3888 * -1866862435 == 5) {
											local920 = local15.anInt3889 * 939166901;
											local2041 = null;
											local1605 = false;
											if (local920 >= 0 && local920 < 2048) {
												local2041 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local920];
												local1605 = local2041 != null && (client.anInt3389 * -643758853 == local920 || Class516.method30379(local2041.aString82) == local15.anInt3919 * 27898029);
											} else if (local920 == -1) {
												local1605 = true;
												local2041 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3;
											} else {
												@Pc(2143) Class104_Sub1_Sub1_Sub1_Sub2 local2143 = (Class104_Sub1_Sub1_Sub1_Sub2) client.aMap15.get(local920);
												if (local2143 != null && local920 == local2143.anInt2867 * 1126388985) {
													local1605 = true;
													local2041 = local2143;
												}
											}
											if (local1605 && local2041 != null && local2041.aClass628_1 != null) {
												local1949 = local2041.aClass628_1.method32563(Class284.aClass86_9, local343, Class96_Sub23.aClass35_Sub15_1, Class333.aClass35_Sub14_1, Class578.aClass35_Sub3_1, Class537.aClass35_Sub7_1, Class55.aClass124_1, Class55.aClass124_1, local15.aClass151_6, null, null, null, 0, true, Class636.aClass627_1);
											}
										} else if (local15.anInt3888 * -1866862435 == 8 || local15.anInt3888 * -1866862435 == 9) {
											@Pc(2205) Class77_Sub7 local2205 = Class112.method9473(local15.anInt3889 * 939166901, false);
											if (local2205 != null) {
												local1949 = local2205.method13272(Class284.aClass86_9, local343, local15.aClass151_6, local15.anInt3919 * 27898029, local15.anInt3888 * -1866862435 == 9, local15.aBoolean683 ? Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 : null);
											}
										} else if (local15.aClass151_6 != null && local15.aClass151_6.method23396()) {
											local1949 = local15.method26605(Class284.aClass86_9, local343, Class96_Sub23.aClass35_Sub15_1, Class333.aClass35_Sub14_1, Class578.aClass35_Sub3_1, Class537.aClass35_Sub7_1, Class96_Sub11.aClass35_Sub2_3, Class55.aClass124_1, Class55.aClass124_1, local15.aClass151_6, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1);
											if (local1949 == null && Class277.aBoolean664) {
												Class461.method29531(local15);
											}
										} else {
											local1949 = local15.method26605(Class284.aClass86_9, local343, Class96_Sub23.aClass35_Sub15_1, Class333.aClass35_Sub14_1, Class578.aClass35_Sub3_1, Class537.aClass35_Sub7_1, Class96_Sub11.aClass35_Sub2_3, Class55.aClass124_1, Class55.aClass124_1, null, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1);
											if (local1949 == null && Class277.aBoolean664) {
												Class461.method29531(local15);
											}
										}
									} else {
										@Pc(1977) Class18 local1977 = (Class18) Class537.aClass35_Sub7_1.method18319(local15.anInt3936 * 403396513);
										if (local1977 != null) {
											local1977 = local1977.method353(local15.anInt3934 * -148110895);
											local1949 = local1977.method350(Class284.aClass86_9, local343, 1, local15.aBoolean683 ? Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 : null, local15.aClass151_6, 0, 0, 0, 0);
											if (local1949 == null) {
												Class461.method29531(local15);
											} else {
												local666 = -local1949.method6824() >> 1;
											}
										}
									}
									if (local1949 != null) {
										if (local15.anInt3903 * -626632091 != 0) {
											local1949.method6837(local15.anInt3901 * -2009238791, local15.anInt3925 * 292475331, local15.anInt3902 * -1130667895, local15.anInt3903 * -626632091);
										}
										if (local15.anInt3931 * -1843491229 > 0) {
											local920 = (local15.anInt3874 * -881188269 << 9) / (local15.anInt3931 * -1843491229);
										} else {
											local920 = 512;
										}
										if (local15.anInt3898 * 1477650141 > 0) {
											local924 = (local15.anInt3875 * -1279656873 << 9) / (local15.anInt3898 * 1477650141);
										} else {
											local924 = 512;
										}
										local686 = local103 + local15.anInt3874 * -881188269 / 2;
										local692 = local15.anInt3875 * -1279656873 / 2 + local110;
										if (!local15.aBoolean672) {
											local686 += local15.anInt3929 * -1399895567 * local920 >> 9;
											local692 += local924 * local15.anInt3894 * -1446592235 >> 9;
										}
										client.aClass455_51.method29394();
										Class284.aClass86_9.method20121(client.aClass455_51);
										@Pc(2410) Class442 local2410 = Class284.aClass86_9.method20282();
										local717 = client.aClass517_1.method30426();
										local1659 = client.aClass517_1.method30431();
										@Pc(2425) int local2425 = local1659 + local15.anInt3896 * -1230478387;
										if (local15.aBoolean676) {
											if (Class11.anInt36 * -891094135 == 3) {
												if (local15.aBoolean672) {
													local2410.method29011((float) local686, (float) local692, (float) local920, (float) local924, Class597.aClass107_Sub1_2.method8922(), Class597.aClass107_Sub1_2.method8924(), (float) (Class149_Sub4.anInt2368 * 1771907305), (float) (Class19.anInt108 * -1091172141), (float) (local15.anInt3896 * -1230478387));
												} else {
													local2410.method29011((float) local686, (float) local692, (float) local920, (float) local924, Class597.aClass107_Sub1_2.method8922(), Class597.aClass107_Sub1_2.method8924(), (float) (Class149_Sub4.anInt2368 * 1771907305), (float) (Class19.anInt108 * -1091172141), (float) (local15.anInt3896 * -1230478387 << 2));
												}
											} else if (local15.aBoolean672) {
												local2410.method29011((float) local686, (float) local692, (float) local920, (float) local924, (float) local717, (float) local2425, (float) (Class149_Sub4.anInt2368 * 1771907305), (float) (Class19.anInt108 * -1091172141), (float) (local15.anInt3896 * -1230478387));
											} else {
												local2410.method29011((float) local686, (float) local692, (float) local920, (float) local924, (float) local717, (float) local2425, (float) (Class149_Sub4.anInt2368 * 1771907305), (float) (Class19.anInt108 * -1091172141), (float) (local15.anInt3896 * -1230478387 << 2));
											}
										} else if (Class11.anInt36 * -891094135 == 3) {
											local2410.method29006((float) local686, (float) local692, (float) local920, (float) local924, Class597.aClass107_Sub1_2.method8922(), Class597.aClass107_Sub1_2.method8924(), (float) (Class149_Sub4.anInt2368 * 1771907305), (float) (Class19.anInt108 * -1091172141));
										} else {
											local2410.method29006((float) local686, (float) local692, (float) local920, (float) local924, (float) local717, (float) local2425, (float) (Class149_Sub4.anInt2368 * 1771907305), (float) (Class19.anInt108 * -1091172141));
										}
										Class284.aClass86_9.method20123(local2410);
										Class284.aClass86_9.method20125(2, 0);
										if (local15.aBoolean674) {
											Class284.aClass86_9.method20230(false);
										}
										if (local15.aBoolean672) {
											client.aClass455_52.method29411(1.0F, 0.0F, 0.0F, Class436.method28911(local15.anInt3892 * 1033849275));
											client.aClass455_52.method29420(0.0F, 1.0F, 0.0F, Class436.method28911(local15.anInt3893 * -806242263));
											client.aClass455_52.method29420(0.0F, 0.0F, 1.0F, Class436.method28911(local15.anInt3946 * -1513459333));
											client.aClass455_52.method29436((float) (local15.anInt3929 * -1399895567), (float) (local15.anInt3894 * -1446592235), (float) (local15.anInt3895 * 1556427793));
										} else {
											@Pc(2693) int local2693 = (local15.anInt3896 * -1230478387 << 2) * Class436.anIntArray464[local15.anInt3892 * 1033849275 << 3] >> 14;
											@Pc(2711) int local2711 = (local15.anInt3896 * -1230478387 << 2) * Class436.anIntArray463[local15.anInt3892 * 1033849275 << 3] >> 14;
											client.aClass455_52.method29411(0.0F, 0.0F, 1.0F, Class436.method28911(-(local15.anInt3946 * -1513459333) << 3));
											client.aClass455_52.method29420(0.0F, 1.0F, 0.0F, Class436.method28911(local15.anInt3893 * -806242263 << 3));
											client.aClass455_52.method29436((float) (local15.anInt3891 * -495767299 << 2), (float) (local666 + local2693 + (local15.anInt3932 * 1797197351 << 2)), (float) ((local15.anInt3932 * 1797197351 << 2) + local2711));
											client.aClass455_52.method29420(1.0F, 0.0F, 0.0F, Class436.method28911(local15.anInt3892 * 1033849275 << 3));
										}
										local15.method26611(Class284.aClass86_9, local1949, client.aClass455_52, client.anInt3414);
										Class284.aClass86_9.method20078();
										Class284.aClass86_9.method19979(true);
										Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
										if (client.aBoolean608) {
											Class284.aClass86_9.method20079(local103, local110, local15.anInt3874 * -881188269 + local103, local15.anInt3875 * -1279656873 + local110);
										}
										if (local15.aBoolean675) {
											client.aClass517_1.method30443().method32300((float) (local15.anInt3908 * 1469151327) / 256.0F, (float) (local15.anInt3905 * -660951517) / 256.0F, (float) (local15.anInt3906 * -531958613) / 256.0F, local15.anInt3899 * -1189137809, local15.anInt3945 * -893779117, local15.anInt3923 * 1770570081, local15.anInt3938 * -380992263, local15.anInt3850 * -2113334655);
										} else {
											client.aClass517_1.method30443().method32324();
										}
										local1949.method6813(client.aClass455_52, null, 1);
										if (!local15.aBoolean676 && local15.aClass626_6 != null) {
											Class284.aClass86_9.method20120(local15.aClass626_6.method32525());
										}
										if (client.aBoolean608) {
											Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
										}
										Class284.aClass86_9.method19979(false);
										Class284.aClass86_9.method20299();
										Class284.aClass86_9.method20151(arg2, arg3, arg4, arg5);
										if (local15.aBoolean675) {
											client.aClass517_1.method30443().method32324();
										}
										if (local15.aBoolean674) {
											Class284.aClass86_9.method20230(true);
										}
									}
								} else if (local15.anInt3857 * -1960530827 == 9) {
									if (local15.aBoolean668) {
										local336 = local103;
										local343 = local110 + local15.anInt3875 * -1279656873;
										local666 = local103 + local15.anInt3874 * -881188269;
										local920 = local110;
									} else {
										local336 = local103;
										local343 = local110;
										local666 = local15.anInt3874 * -881188269 + local103;
										local920 = local110 + local15.anInt3875 * -1279656873;
									}
									if (local15.anInt3885 * 1684703667 == 1) {
										Class284.aClass86_9.method20092(local336, local343, local666, local920, local15.anInt3883 * 290091559 | 0xFF000000, 0);
									} else {
										Class284.aClass86_9.method20096(local336, local343, local666, local920, local15.anInt3883 * 290091559 | 0xFF000000, local15.anInt3885 * 1684703667, 0);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
