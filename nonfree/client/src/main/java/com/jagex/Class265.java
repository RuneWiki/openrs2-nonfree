package com.jagex;

import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public class Class265 {

	@OriginalMember(owner = "client!fj", name = "ie", descriptor = "Lclient!adm;")
	public static Class79_Sub1_Sub2 aClass79_Sub1_Sub2_4;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Lclient!fj;")
	static final Class265 aClass265_4 = new Class265(1);

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Lclient!fj;")
	static final Class265 aClass265_1 = new Class265(0);

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "Lclient!fj;")
	static final Class265 aClass265_3 = new Class265(5);

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "Lclient!fj;")
	static final Class265 aClass265_6 = new Class265(3);

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!fj;")
	static final Class265 aClass265_5 = new Class265(2);

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "Lclient!fj;")
	static final Class265 aClass265_2 = new Class265(4);

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
	final int anInt3880;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I)V", line = 13)
	Class265(@OriginalArg(0) int arg0) {
		this.anInt3880 = arg0 * 1857672113;
	}

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "()I", line = 18)
	int method26214() {
		return aClass265_4 == this ? -1 : this.anInt3880 * 1415484753 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "()I", line = 18)
	int method26215() {
		return aClass265_4 == this ? -1 : this.anInt3880 * 1415484753 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "()I", line = 18)
	int method26216() {
		return aClass265_4 == this ? -1 : this.anInt3880 * 1415484753 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)I", line = 18)
	int method26217() {
		return aClass265_4 == this ? -1 : this.anInt3880 * 1415484753 | 0x1000000;
	}

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "(B)V", line = 263)
	static final void method26218() {
		if (Class411.anInt4721 * 327612781 == 7 || Class411.anInt4721 * 327612781 == 103) {
			return;
		}
		try {
			@Pc(22) short local22;
			if (Class411.anInt4748 * 558401221 == 0 && Class411.anInt4721 * 327612781 < 98) {
				local22 = 500;
			} else {
				local22 = 2000;
			}
			if (Class411.aBoolean749 && Class411.anInt4721 * 327612781 >= 64) {
				local22 = 6000;
			}
			if (Class411.anInt4714 * -1128337797 == 211 && Class411.anInt4721 * 327612781 != 215 && Class411.anInt4750 * 1486673001 != 42 || Class411.anInt4714 * -1128337797 == 132 && Class411.anInt4749 * 914785575 != 49 && Class411.anInt4749 * 914785575 != 52) {
				Class411.anInt4751 += -498616603;
			}
			if (Class411.anInt4751 * -803989779 > local22) {
				Class411.aClass175_3.method24355();
				if (Class411.anInt4748 * 558401221 >= 3) {
					Class411.anInt4721 = -522138941;
					Class114.method7638(-5);
					Class680.method33243();
					return;
				}
				if (Class411.anInt4714 * -1128337797 == 211) {
					Class50.aClass28_5.method593();
				} else {
					Class50.aClass28_2.method593();
				}
				Class411.anInt4751 = 0;
				Class411.anInt4748 += 1751058445;
				Class411.anInt4721 = -1044277882;
			}
			@Pc(160) Class93_Sub22 local160;
			if (Class411.anInt4721 * 327612781 == 14) {
				if (Class411.anInt4714 * -1128337797 == 211) {
					Class411.aClass175_3.method24353(Class516.method30289(Class50.aClass28_5.method599(), 40000), Class50.aClass28_5.aString4);
				} else {
					Class411.aClass175_3.method24353(Class516.method30289(Class50.aClass28_2.method599(), 40000), Class50.aClass28_2.aString4);
				}
				if (Class110_Sub9.aSecureRandom1 == null) {
					Class110_Sub9.aSecureRandom1 = client.aClass151_1.method13974();
					client.aClass151_1.method13975();
					client.aClass151_1 = null;
				}
				Class411.aClass175_3.method24369();
				local160 = Class720.method36918();
				local160.aClass93_Sub41_Sub2_1.method22510(Class449.aClass449_12.anInt4980 * 1690737369);
				Class411.aClass175_3.method24351(local160);
				Class411.aClass175_3.method24350();
				Class411.anInt4721 = 1684272591;
			}
			@Pc(210) int local210;
			if (Class411.anInt4721 * 327612781 == 35) {
				if (!Class411.aClass175_3.method24356().method14720(9)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 9);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				local210 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22413();
				if (local210 != 0) {
					Class411.anInt4721 = -522138941;
					Class543.method30943(local210);
					Class114.method7638(local210);
					Class411.aClass175_3.method24355();
					Class680.method33243();
					return;
				}
				Class411.aLong269 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22423() * -4112723527472146283L;
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				if (Class411.aBoolean749) {
					Class411.anInt4721 = -339489564;
				} else {
					Class411.anInt4721 = -1970699996;
				}
			}
			@Pc(271) int local271;
			@Pc(331) int local331;
			if (Class411.anInt4721 * 327612781 == 276) {
				local160 = Class720.method36918();
				local160.aClass93_Sub41_Sub2_1.method22510(Class449.aClass449_8.anInt4980 * 1690737369);
				local160.aClass93_Sub41_Sub2_1.method22454(0);
				local271 = local160.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local160.aClass93_Sub41_Sub2_1.method22395(910);
				local160.aClass93_Sub41_Sub2_1.method22395(1);
				if (Class411.anInt4714 * -1128337797 == 211) {
					local160.aClass93_Sub41_Sub2_1.method22510(client.anInt3435 * -849002901 == 14 ? 1 : 0);
				}
				@Pc(301) Class93_Sub41 local301 = Class346.method27569();
				Class709.method36765(local301, (long) (Class411.anInt4746 * 276097583));
				Class413.aLong272 = (long) Class411.anInt4746 * -1187630733921575941L;
				local301.method22510(Class411.anInt4746 * 276097583);
				local301.method22510(Class106.aClass717_8.method36920());
				local301.method22395(client.anInt3426 * -1765120027);
				for (local331 = 0; local331 < 5; local331++) {
					local301.method22395(Class110_Sub9.aSecureRandom1.nextInt());
				}
				local301.method22399(client.aLong243 * 6484786827691107089L);
				local301.method22510(client.aClass702_4.anInt5953 * -1111983921);
				local301.method22510(Class110_Sub9.aSecureRandom1.nextInt());
				local301.method22416(Class95.aBigInteger2, Class95.aBigInteger4);
				local160.aClass93_Sub41_Sub2_1.method22405(local301.aByteArray58, 0, local301.anInt3070 * 212851357);
				local160.aClass93_Sub41_Sub2_1.method22407(local160.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local271);
				Class411.aClass175_3.method24351(local160);
				Class411.aClass175_3.method24350();
				Class411.anInt4721 = 697749448;
			}
			if (Class411.anInt4721 * 327612781 == 40) {
				if (!Class411.aClass175_3.method24356().method14720(2)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 2);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22415() * -1445626955;
				Class411.anInt4721 = 582239970;
			}
			if (Class411.anInt4721 * 327612781 == 58) {
				if (!Class411.aClass175_3.method24356().method14720(Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 * 212851357)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 * 212851357);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22440(Class411.anIntArray441);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				@Pc(479) String local479 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22428();
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				@Pc(487) String local487 = Class447.aClass447_9.method28901();
				Class453.method28964(local479, true, local487, client.aBoolean596);
				Class411.anInt4721 = 1975392576;
			}
			if (Class411.anInt4721 * 327612781 == 64) {
				if (!Class411.aClass175_3.method24356().method14720(1)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 1);
				if ((Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58[0] & 0xFF) == 1) {
					Class411.anInt4721 = -926422114;
				}
			}
			if (Class411.anInt4721 * 327612781 == 70) {
				if (!Class411.aClass175_3.method24356().method14720(16)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 16);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = -1655194800;
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22440(Class411.anIntArray441);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				Class411.aLong271 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22423() * 7033311592096984251L;
				Class411.aLong270 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22423() * 5236525202755218899L;
				Class411.anInt4721 = -1970699996;
			}
			if (Class411.anInt4721 * 327612781 == 84) {
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				Class411.aClass175_3.method24369();
				local160 = Class720.method36918();
				@Pc(601) Class93_Sub41_Sub2 local601 = local160.aClass93_Sub41_Sub2_1;
				@Pc(634) int local634;
				@Pc(663) Class93_Sub41 local663;
				@Pc(773) Class93_Sub41 local773;
				@Pc(610) Class449 local610;
				if (Class411.anInt4714 * -1128337797 == 211) {
					if (Class411.aBoolean749) {
						local610 = Class449.aClass449_10;
					} else {
						local610 = Class449.aClass449_3;
					}
					local601.method22510(local610.anInt4980 * 1690737369);
					local601.method22454(0);
					local331 = local601.anInt3070 * 212851357;
					local634 = local601.anInt3070 * 212851357;
					if (!Class411.aBoolean749) {
						local601.method22395(910);
						local601.method22395(1);
						local601.method22510(client.anInt3435 * -849002901 == 14 ? 1 : 0);
						local634 = local601.anInt3070 * 212851357;
						local663 = Class168.method17629();
						local601.method22405(local663.aByteArray58, 0, local663.anInt3070 * 212851357);
						local634 = local601.anInt3070 * 212851357;
						local601.method22510(Class411.aLong271 * 4457507688757033075L == -1L ? 1 : 0);
						if (Class411.aLong271 * 4457507688757033075L == -1L) {
							local601.method22402(Class411.aString200);
						} else {
							local601.method22399(Class411.aLong271 * 4457507688757033075L);
						}
					}
					local601.method22510(Class255.method26008());
					local601.method22454(Class553.anInt3408 * -1378711501);
					local601.method22454(Class553.anInt3416 * 2091353777);
					local601.method22510(Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16343());
					Class314.method26940(local601);
					local601.method22402(client.aString143);
					local601.method22395(client.anInt3426 * -1765120027);
					local663 = Class51.aClass93_Sub36_1.method14356();
					local601.method22510(local663.anInt3070 * 212851357);
					local601.method22405(local663.aByteArray58, 0, local663.anInt3070 * 212851357);
					client.aBoolean601 = true;
					local773 = new Class93_Sub41(Class125_Sub3.aClass93_Sub42_1.method15299());
					Class125_Sub3.aClass93_Sub42_1.method15298(local773);
					local601.method22405(local773.aByteArray58, 0, local773.aByteArray58.length);
					local601.method22395(client.anInt3455 * 1598735607);
					local601.method22395(client.anInt3429 * 1672118199);
					local601.method22395(client.anInt3428 * -1830493323);
					local601.method22395(client.anInt3431 * 1723909759);
					local601.method22395(client.anInt3430 * 1191340313);
					local601.method22402(Class454.aString210);
					local601.method22510(client.aString138 == null ? 0 : 1);
					if (client.aString138 != null) {
						local601.method22402(client.aString138);
					}
					local601.method22510(client.aBoolean632 ? 1 : 0);
					local601.method22510(client.aBoolean597 ? 1 : 0);
					local601.method22510(Class349.anInt4202 * -1710417755 & 0x1);
					local601.method22395(client.anInt3434 * -1579845029);
					local601.method22402(client.aString139);
					local601.method22510(Class94.aClass28_7 != null && Class94.aClass28_7.anInt101 * 2142901097 == Class50.aClass28_5.anInt101 * 2142901097 ? 0 : 1);
					local601.method22454(Class50.aClass28_2.anInt101 * 2142901097);
					Class4.method30(local601);
					local601.method22441(Class411.anIntArray441, local634, local601.anInt3070 * 212851357);
					local601.method22407(local601.anInt3070 * 212851357 - local331);
				} else {
					if (Class411.aBoolean749) {
						local610 = Class449.aClass449_10;
					} else {
						local610 = Class449.aClass449_2;
					}
					local601.method22510(local610.anInt4980 * 1690737369);
					local601.method22454(0);
					local331 = local601.anInt3070 * 212851357;
					local634 = local601.anInt3070 * 212851357;
					if (!Class411.aBoolean749) {
						local601.method22395(910);
						local601.method22395(1);
						local663 = Class168.method17629();
						local601.method22405(local663.aByteArray58, 0, local663.anInt3070 * 212851357);
						local634 = local601.anInt3070 * 212851357;
						local601.method22510(Class411.aLong271 * 4457507688757033075L == -1L ? 1 : 0);
						if (Class411.aLong271 * 4457507688757033075L == -1L) {
							local601.method22402(Class411.aString200);
						} else {
							local601.method22399(Class411.aLong271 * 4457507688757033075L);
						}
					}
					local601.method22510(client.aClass702_4.anInt5953 * -1111983921);
					local601.method22510(Class106.aClass717_8.method36920());
					local601.method22510(Class255.method26008());
					local601.method22454(Class553.anInt3408 * -1378711501);
					local601.method22454(Class553.anInt3416 * 2091353777);
					local601.method22510(Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16343());
					Class314.method26940(local601);
					local601.method22402(client.aString143);
					local663 = Class51.aClass93_Sub36_1.method14356();
					local601.method22510(local663.anInt3070 * 212851357);
					local601.method22405(local663.aByteArray58, 0, local663.anInt3070 * 212851357);
					local773 = new Class93_Sub41(Class125_Sub3.aClass93_Sub42_1.method15299());
					Class125_Sub3.aClass93_Sub42_1.method15298(local773);
					local601.method22405(local773.aByteArray58, 0, local773.aByteArray58.length);
					local601.method22395(client.anInt3455 * 1598735607);
					local601.method22402(Class454.aString210);
					local601.method22395(client.anInt3426 * -1765120027);
					local601.method22395(client.anInt3434 * -1579845029);
					local601.method22402(client.aString139);
					local601.method22510(Class349.anInt4202 * -1710417755 & 0x1);
					local601.method22401(false);
					Class4.method30(local601);
					local601.method22441(Class411.anIntArray441, local634, local601.anInt3070 * 212851357);
					local601.method22407(local601.anInt3070 * 212851357 - local331);
				}
				Class411.aClass175_3.method24351(local160);
				Class411.aClass175_3.method24350();
				Class411.aClass175_3.aClass24_2 = new Class24(Class411.anIntArray441);
				@Pc(1157) int[] local1157 = new int[4];
				for (local331 = 0; local331 < 4; local331++) {
					local1157[local331] = Class411.anIntArray441[local331] + 50;
				}
				Class411.aClass175_3.aClass24_3 = new Class24(local1157);
				new Class24(local1157);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22672(Class411.aClass175_3.aClass24_3);
				Class411.anIntArray441 = null;
				Class411.anInt4721 = 1279989418;
			}
			if (Class411.anInt4721 * 327612781 == 98) {
				if (!Class411.aClass175_3.method24356().method14720(1)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 1);
				local210 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22413();
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				if (local210 == 21) {
					Class411.anInt4721 = -808566346;
				} else if (local210 == 1) {
					Class411.anInt4721 = 293466275;
					Class114.method7638(local210);
					return;
				} else if (local210 == 52) {
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					Class411.anInt4721 = -1443868475;
				} else if (local210 == 2) {
					if (Class411.aBoolean753) {
						Class411.aBoolean753 = false;
						Class411.anInt4721 = -1044277882;
						return;
					}
					if (Class411.anInt4714 * -1128337797 == 211) {
						Class596.aClass113_Sub1_1.method7414();
						Class411.anInt4721 = -688364288;
					} else {
						Class411.anInt4721 = 526831521;
					}
				} else if (local210 == 15) {
					Class411.aClass175_3.anInt3301 = 1705477074;
					Class411.anInt4721 = 122548348;
				} else if (local210 == 23 && Class411.anInt4748 * 558401221 < 3) {
					Class411.anInt4751 = 0;
					Class411.anInt4748 += 1751058445;
					Class411.anInt4721 = -1044277882;
					Class411.aClass175_3.method24355();
					return;
				} else if (local210 == 42) {
					Class411.anInt4721 = 529177811;
					Class114.method7638(local210);
					return;
				} else if (Class411.anInt4714 * -1128337797 == 132 && local210 == 49 && client.anInt3435 * -849002901 != 9) {
					if (Class411.anInt4749 * 914785575 != 52) {
						Class114.method7638(local210);
					}
					return;
				} else if (!Class411.aBoolean750 || Class411.aBoolean749 || Class411.anInt4746 * 276097583 == -1 || local210 != 35) {
					if (local210 != 53) {
						Class411.anInt4721 = -522138941;
						Class114.method7638(local210);
						Class411.aClass175_3.method24355();
						Class680.method33243();
						return;
					}
					Class411.anInt4721 = -1094993751;
				} else {
					Class411.aBoolean749 = true;
					Class411.anInt4751 = 0;
					Class411.anInt4721 = -1044277882;
					Class411.aClass175_3.method24355();
					return;
				}
			}
			if (Class411.anInt4721 * 327612781 == 126) {
				if (!Class411.aClass175_3.method24356().method14720(1)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 1);
				local210 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58[0] & 0xFF;
				Class411.anInt4739 = local210 * 1250766390;
				Class411.anInt4721 = -522138941;
				Class114.method7638(21);
				Class411.aClass175_3.method24355();
				Class680.method33243();
				return;
			}
			if (Class411.anInt4721 * 327612781 == 215) {
				if (!Class411.aClass175_3.method24356().method14720(2)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 2);
				Class411.anInt4742 = (((Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58[0] & 0xFF) << 8) + (Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58[1] & 0xFF)) * 1980524355;
				Class411.anInt4721 = 1279989418;
				return;
			}
			if (Class411.anInt4721 * 327612781 == 245) {
				if (!Class411.aClass175_3.method24356().method14720(4)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 4);
				Class411.anInt4757 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22419() * -1923297061;
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				Class411.anInt4721 = -522138941;
				Class114.method7638(53);
				Class411.aClass175_3.method24355();
				Class680.method33243();
				return;
			}
			if (Class411.anInt4721 * 327612781 == 194) {
				if (Class166_Sub32.anInt2280 * 250407149 == 29) {
					if (!Class411.aClass175_3.method24356().method14720(1)) {
						return;
					}
					Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 1);
					Class411.anInt4755 = (Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58[0] & 0xFF) * 1109601241;
				} else if (Class166_Sub32.anInt2280 * 250407149 == 45) {
					if (!Class411.aClass175_3.method24356().method14720(3)) {
						return;
					}
					Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 3);
					Class411.anInt4755 = (Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58[0] & 0xFF) * 1109601241;
					Class411.anInt4754 = (((Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58[1] & 0xFF) << 8) + (Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58[2] & 0xFF)) * 156824051;
				} else {
					throw new IllegalStateException();
				}
				Class411.anInt4721 = -522138941;
				Class114.method7638(Class166_Sub32.anInt2280 * 250407149);
				Class411.aClass175_3.method24355();
				Class680.method33243();
				if (Class56.method18034(client.anInt3435 * -849002901)) {
					Class642.method32522(true);
					Class411.anInt4750 = Class166_Sub32.anInt2280 * 1066586085;
				}
				return;
			}
			if (Class411.anInt4721 * 327612781 == 225) {
				if (!Class411.aClass175_3.method24356().method14720(2)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 2);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				Class629.anInt5710 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22415() * -430049679;
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				Class411.anInt4721 = 878052535;
				return;
			}
			if (Class411.anInt4721 * 327612781 == 235) {
				if (!Class411.aClass175_3.method24356().method14720(Class629.anInt5710 * -2062087535)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, Class629.anInt5710 * -2062087535);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				@Pc(1720) byte[] local1720 = new byte[Class629.anInt5710 * -2062087535 + 1];
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22667(local1720, 0, Class629.anInt5710 * -2062087535);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				@Pc(1738) Class93_Sub41 local1738 = new Class93_Sub41(local1720);
				@Pc(1742) String local1742 = local1738.method22427();
				Class338.method27468(local1742, true, client.aBoolean596);
				Class114.method7638(Class166_Sub32.anInt2280 * 250407149);
				if (Class411.anInt4714 * -1128337797 == 132 && client.anInt3435 * -849002901 != 9) {
					Class411.anInt4721 = 1279989418;
				} else {
					Class411.anInt4721 = -522138941;
					Class411.aClass175_3.method24355();
					Class680.method33243();
				}
				return;
			}
			if (Class411.anInt4721 * 327612781 == 256) {
				if (!Class411.aClass175_3.method24356().method14720(2)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 2);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				Class411.aClass175_3.anInt3301 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22415() * -852738537;
				Class411.anInt4721 = 2097940924;
			}
			@Pc(1890) Class93_Sub41_Sub2 local1890;
			if (Class411.anInt4721 * 327612781 == 268) {
				if (!Class411.aClass175_3.method24356().method14720(Class411.aClass175_3.anInt3301 * 2010044839)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, Class411.aClass175_3.anInt3301 * 2010044839);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				@Pc(1855) boolean local1855 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22413() == 1;
				while (true) {
					if (Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 * 212851357 >= Class411.aClass175_3.anInt3301 * 2010044839) {
						if (local1855) {
							@Pc(1887) Class93_Sub22 local1887 = Class720.method36918();
							local1890 = local1887.aClass93_Sub41_Sub2_1;
							local1890.method22510(Class449.aClass449_7.anInt4980 * 1690737369);
							Class411.aClass175_3.method24351(local1887);
							Class411.aClass175_3.method24350();
							Class411.anInt4721 = 1977738866;
						} else {
							Class411.anInt4721 = -688364288;
						}
						break;
					}
					@Pc(1871) Class466 local1871 = Class72.aClass79_Sub1_Sub2_2.method1463(Class411.aClass175_3.aClass93_Sub41_Sub2_2);
					Class596.aClass113_Sub1_1.anInterface3_2.method776(local1871.anInt5092 * -1181855333, local1871.anObject19);
				}
			}
			if (Class411.anInt4721 * 327612781 == 138) {
				if (!Class411.aClass175_3.method24356().method14720(1)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 1);
				local210 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58[0] & 0xFF;
				if (local210 != 2) {
					if (local210 != 29 && local210 != 45) {
						Class411.anInt4721 = -522138941;
						Class114.method7638(local210);
						Class411.aClass175_3.method24355();
						Class680.method33243();
						if (Class56.method18034(client.anInt3435 * -849002901)) {
							Class642.method32522(true);
							Class411.anInt4750 = local210 * 449182681;
						}
						return;
					}
					Class166_Sub32.anInt2280 = local210 * -2099137307;
					Class411.anInt4721 = 2095594634;
					return;
				}
				Class411.anInt4721 = 526831521;
			}
			if (Class411.anInt4721 * 327612781 == 141) {
				if (!Class411.aClass175_3.method24356().method14720(1)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 1);
				Class566.anInt5385 = (Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58[0] & 0xFF) * 252135035;
				Class411.anInt4721 = -53062159;
			}
			@Pc(2027) Class93_Sub41_Sub2 local2027;
			if (Class411.anInt4721 * 327612781 == 157) {
				local2027 = Class411.aClass175_3.aClass93_Sub41_Sub2_2;
				if (Class411.anInt4714 * -1128337797 == 211) {
					if (!Class411.aClass175_3.method24356().method14720(Class566.anInt5385 * 1395370163)) {
						return;
					}
					Class411.aClass175_3.method24356().method14711(local2027.aByteArray58, 0, Class566.anInt5385 * 1395370163);
					local2027.anInt3070 = 0;
					Class124.method21430(local2027);
					client.anInt3514 = local2027.method22413() * 1370077333;
					client.anInt3515 = local2027.method22413() * -823645517;
					client.aBoolean621 = local2027.method22413() == 1;
					client.aBoolean633 = local2027.method22413() == 1;
					client.aBoolean622 = local2027.method22413() == 1;
					client.aBoolean638 = local2027.method22413() == 1;
					client.anInt3513 = local2027.method22415() * -410368243;
					client.aBoolean629 = local2027.method22413() == 1;
					Class626.anInt5704 = local2027.method22408() * 889370685;
					client.aBoolean620 = local2027.method22413() == 1;
					Class108_Sub2.aString24 = local2027.method22427();
					Class99.aLong23 = (local2027.method22422() - Class305.method26796()) * -3359956914723456965L;
					client.aClass532_1.method30466().method17144(client.aBoolean620);
					Class392.aClass541_1.method30905().method30466().method17144(client.aBoolean620);
					Class277.aClass32_Sub12_1.method17070(client.aBoolean620);
					Class162.aClass32_Sub3_2.method16688(client.aBoolean620);
				} else if (Class411.aClass175_3.method24356().method14720(Class566.anInt5385 * 1395370163)) {
					Class411.aClass175_3.method24356().method14711(local2027.aByteArray58, 0, Class566.anInt5385 * 1395370163);
					local2027.anInt3070 = 0;
					Class124.method21430(local2027);
					client.anInt3514 = local2027.method22413() * 1370077333;
					client.anInt3515 = local2027.method22413() * -823645517;
					client.aBoolean621 = local2027.method22413() == 1;
					Class626.anInt5704 = local2027.method22408() * 889370685;
					Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte75 = (byte) local2027.method22413();
					client.aBoolean633 = local2027.method22413() == 1;
					client.aBoolean622 = local2027.method22413() == 1;
					Class707.aLong308 = local2027.method22423() * 2435269274467726403L;
					Class99.aLong23 = (-9212939189200455573L * Class707.aLong308 - Class305.method26796() - local2027.method22609()) * -3359956914723456965L;
					local271 = local2027.method22413();
					client.aBoolean629 = (local271 & 0x1) != 0;
					Class154_Sub1.aBoolean342 = (local271 & 0x2) != 0;
					Class351.anInt4205 = local2027.method22419() * 2104983145;
					Class380.anInt4623 = local2027.method22419() * -446903243;
					Class82.anInt251 = local2027.method22415() * -1522109095;
					Class659.anInt5822 = local2027.method22415() * -872150107;
					Class278.anInt3888 = local2027.method22415() * 472135179;
					Class669.anInt5855 = local2027.method22419() * -860346295;
					Class120.aClass499_1 = new Class499(Class669.anInt5855 * 1514424825);
					(new Thread(Class120.aClass499_1)).start();
					Class552.anInt5318 = local2027.method22413() * 393742747;
					Class358.anInt4567 = local2027.method22415() * -606039961;
					Class481.anInt5142 = local2027.method22415() * 1920483791;
					Class32_Sub19.aBoolean374 = local2027.method22413() == 1;
					Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aString82 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aString81 = RuntimeException_Sub1.aString116 = local2027.method22428();
					Class529.anInt5230 = local2027.method22413() * -375509133;
					Class549.anInt5292 = local2027.method22419() * -2104784137;
					Class94.aClass28_7 = new Class28();
					Class94.aClass28_7.anInt101 = local2027.method22415() * 470002905;
					if (Class94.aClass28_7.anInt101 * 2142901097 == 65535) {
						Class94.aClass28_7.anInt101 = -470002905;
					}
					Class94.aClass28_7.aString4 = local2027.method22428();
					Class94.aClass28_7.anInt100 = local2027.method22415() * -1138615973;
					Class94.aClass28_7.anInt99 = local2027.method22415() * 702279345;
					if (Class280.aClass693_1 != Class693.aClass693_12 && (Class280.aClass693_1 != Class693.aClass693_4 || client.anInt3514 * 2055688893 < 2) && Class50.aClass28_5.method592(Class50.aClass28_3)) {
						Class667.method32915();
					}
				} else {
					return;
				}
				if (client.aBoolean622) {
					try {
						Class70.method1239(Class32_Sub10.anApplet2, "zap");
					} catch (@Pc(2456) Throwable local2456) {
						if (client.aBoolean593) {
							try {
								Class32_Sub10.anApplet2.getAppletContext().showDocument(new URL(Class32_Sub10.anApplet2.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(2470) Exception local2470) {
							}
						}
					}
				} else {
					try {
						Class70.method1239(Class32_Sub10.anApplet2, "unzap");
					} catch (@Pc(2478) Throwable local2478) {
					}
				}
				if (Class280.aClass693_1 == Class693.aClass693_8) {
					Class447.aClass447_2.method28904();
				}
				if (Class411.anInt4714 * -1128337797 != 211) {
					Class411.anInt4721 = -522138941;
					Class114.method7638(2);
					Class163.method14924();
					Class481.method29756(13);
					Class411.aClass175_3.aClass453_2 = null;
					return;
				}
				Class411.anInt4721 = 817951506;
			}
			if (Class411.anInt4721 * 327612781 == 170) {
				if (!Class411.aClass175_3.method24356().method14720(3)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 3);
				Class411.anInt4721 = 702442028;
			}
			if (Class411.anInt4721 * 327612781 == 188) {
				local2027 = Class411.aClass175_3.aClass93_Sub41_Sub2_2;
				local2027.anInt3070 = 0;
				if (local2027.method22679()) {
					if (!Class411.aClass175_3.method24356().method14720(1)) {
						return;
					}
					Class411.aClass175_3.method24356().method14711(local2027.aByteArray58, 3, 1);
				}
				Class411.aClass175_3.aClass453_2 = Class166_Sub3.method15407()[local2027.method22666()];
				Class411.aClass175_3.anInt3301 = local2027.method22415() * -852738537;
				Class411.anInt4721 = -1503969504;
			}
			if (Class411.anInt4721 * 327612781 == 160) {
				if (!Class411.aClass175_3.method24356().method14720(Class411.aClass175_3.anInt3301 * 2010044839)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, Class411.aClass175_3.anInt3301 * 2010044839);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				local210 = Class411.aClass175_3.anInt3301 * 2010044839;
				Class411.anInt4721 = -522138941;
				Class114.method7638(2);
				Class329.method27349();
				Class110_Sub5.method7654(Class411.aClass175_3.aClass93_Sub41_Sub2_2);
				local271 = local210 - Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 * 212851357;
				local1890 = new Class93_Sub41_Sub2(local271);
				System.arraycopy(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 * 212851357, local1890.aByteArray58, 0, local271);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 += local271 * -1445626955;
				if (Class453.aClass453_46 == Class411.aClass175_3.aClass453_2) {
					client.aClass532_1.method30465(new Class537(Class526.aClass526_3, local1890));
				} else {
					client.aClass532_1.method30465(new Class537(Class526.aClass526_8, local1890));
				}
				if (local210 != Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 * 212851357) {
					throw new RuntimeException(Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 * 212851357 + " " + local210);
				}
				Class411.aClass175_3.aClass453_2 = null;
				return;
			}
			if (Class411.anInt4721 * 327612781 == 204) {
				if (Class411.aClass175_3.anInt3301 * 2010044839 == -2) {
					if (!Class411.aClass175_3.method24356().method14720(2)) {
						return;
					}
					Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, 2);
					Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
					Class411.aClass175_3.anInt3301 = Class411.aClass175_3.aClass93_Sub41_Sub2_2.method22415() * -852738537;
				}
				if (!Class411.aClass175_3.method24356().method14720(Class411.aClass175_3.anInt3301 * 2010044839)) {
					return;
				}
				Class411.aClass175_3.method24356().method14711(Class411.aClass175_3.aClass93_Sub41_Sub2_2.aByteArray58, 0, Class411.aClass175_3.anInt3301 * 2010044839);
				Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 = 0;
				local210 = Class411.aClass175_3.anInt3301 * 2010044839;
				Class411.anInt4721 = -522138941;
				Class114.method7638(15);
				Class490.method29977();
				Class110_Sub5.method7654(Class411.aClass175_3.aClass93_Sub41_Sub2_2);
				if (Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 * 212851357 != local210) {
					throw new RuntimeException(Class411.aClass175_3.aClass93_Sub41_Sub2_2.anInt3070 * 212851357 + " " + local210);
				}
				Class411.aClass175_3.aClass453_2 = null;
				return;
			}
		} catch (@Pc(2835) IOException local2835) {
			Class411.aClass175_3.method24355();
			if (Class411.anInt4748 * 558401221 < 3) {
				if (Class411.anInt4714 * -1128337797 == 211) {
					Class50.aClass28_5.method593();
				} else {
					Class50.aClass28_2.method593();
				}
				Class411.anInt4751 = 0;
				Class411.anInt4748 += 1751058445;
				Class411.anInt4721 = -1044277882;
			} else {
				Class411.anInt4721 = -522138941;
				Class114.method7638(-4);
				Class680.method33243();
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "lr", descriptor = "(Lclient!yf;I)V", line = 7031)
	static final void method26221(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class280.method26456(local11, arg0);
	}

	@OriginalMember(owner = "client!fj", name = "zh", descriptor = "(Lclient!yf;I)V", line = 9389)
	static final void method26219(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3522 * 929376837;
	}

	@OriginalMember(owner = "client!fj", name = "acq", descriptor = "(Lclient!yf;B)V", line = 10025)
	static final void method26220(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.anInt4647 * 1113751329;
	}

	@OriginalMember(owner = "client!fj", name = "avi", descriptor = "(Lclient!yf;B)V", line = 13563)
	static final void method26222(@OriginalArg(0) Class681 arg0) {
		@Pc(2) long local2 = Class305.method26796();
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) (local2 / 60000L);
	}
}
