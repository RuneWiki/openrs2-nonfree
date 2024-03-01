package com.jagex;

import jaclib.ping.Ping;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public class Class378 implements Interface33 {

	@OriginalMember(owner = "client!kg", name = "ca", descriptor = "Lclient!hf;")
	static Class312 aClass312_10;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
	int anInt4618;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!eu;")
	Class106 aClass106_11;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "J")
	long aLong266 = 302932814116787885L;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_107;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!py;")
	final Class497 aClass497_108;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!km;")
	final Class382 aClass382_1;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!km;)V", line = 20)
	Class378(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class382 arg2) {
		this.aClass497_107 = arg0;
		this.aClass497_108 = arg1;
		this.aClass382_1 = arg2;
	}

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "(Z)V", line = 27)
	@Override
	public void method28281(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass382_1.aClass390_9.method28273(0, client.anInt3511 * 2040043391) + this.aClass382_1.anInt4630 * -396223381;
		@Pc(31) int local31 = this.aClass382_1.aClass392_9.method28290(0, client.anInt3512 * -817449061) + this.aClass382_1.anInt4628 * -1025648387;
		@Pc(41) String local41;
		switch(this.aClass382_1.anInt4625 * 2110757975) {
			case 0:
				local41 = Class653.aClass357_1.method27739();
				break;
			case 1:
				local41 = "" + Class653.aClass357_1.method27737() + "%";
				break;
			case 2:
				local41 = Class653.aClass357_1.method27738();
				break;
			default:
				local41 = "";
		}
		@Pc(67) int local67 = Class653.aClass357_1.method27737();
		if (this.aLong266 * 1467976703334007515L < 0L || local67 == 0 || this.anInt4618 * 1941071467 != local67) {
			this.aLong266 = Class305.method26796() * -302932814116787885L;
			this.anInt4618 = local67 * 923145795;
		}
		if (this.aClass382_1.anInt4625 * 2110757975 != 1 && Class305.method26796() - this.aLong266 * 1467976703334007515L > 10000L) {
			local41 = local41 + " (" + Class653.aClass357_1.method27741().anInt4590 * -909097621 + ")";
		}
		this.aClass106_11.method7526(local41, local15, local31, this.aClass382_1.anInt4632 * 1058203625, -1);
	}

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "(ZI)V", line = 27)
	@Override
	public void method28285(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass382_1.aClass390_9.method28273(0, client.anInt3511 * 2040043391) + this.aClass382_1.anInt4630 * -396223381;
		@Pc(31) int local31 = this.aClass382_1.aClass392_9.method28290(0, client.anInt3512 * -817449061) + this.aClass382_1.anInt4628 * -1025648387;
		@Pc(41) String local41;
		switch(this.aClass382_1.anInt4625 * 2110757975) {
			case 0:
				local41 = Class653.aClass357_1.method27739();
				break;
			case 1:
				local41 = "" + Class653.aClass357_1.method27737() + "%";
				break;
			case 2:
				local41 = Class653.aClass357_1.method27738();
				break;
			default:
				local41 = "";
		}
		@Pc(67) int local67 = Class653.aClass357_1.method27737();
		if (this.aLong266 * 1467976703334007515L < 0L || local67 == 0 || this.anInt4618 * 1941071467 != local67) {
			this.aLong266 = Class305.method26796() * -302932814116787885L;
			this.anInt4618 = local67 * 923145795;
		}
		if (this.aClass382_1.anInt4625 * 2110757975 != 1 && Class305.method26796() - this.aLong266 * 1467976703334007515L > 10000L) {
			local41 = local41 + " (" + Class653.aClass357_1.method27741().anInt4590 * -909097621 + ")";
		}
		this.aClass106_11.method7526(local41, local15, local31, this.aClass382_1.anInt4632 * 1058203625, -1);
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(Z)V", line = 27)
	@Override
	public void method28282(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass382_1.aClass390_9.method28273(0, client.anInt3511 * 2040043391) + this.aClass382_1.anInt4630 * -396223381;
		@Pc(31) int local31 = this.aClass382_1.aClass392_9.method28290(0, client.anInt3512 * -817449061) + this.aClass382_1.anInt4628 * -1025648387;
		@Pc(41) String local41;
		switch(this.aClass382_1.anInt4625 * 2110757975) {
			case 0:
				local41 = Class653.aClass357_1.method27739();
				break;
			case 1:
				local41 = "" + Class653.aClass357_1.method27737() + "%";
				break;
			case 2:
				local41 = Class653.aClass357_1.method27738();
				break;
			default:
				local41 = "";
		}
		@Pc(67) int local67 = Class653.aClass357_1.method27737();
		if (this.aLong266 * 1467976703334007515L < 0L || local67 == 0 || this.anInt4618 * 1941071467 != local67) {
			this.aLong266 = Class305.method26796() * -302932814116787885L;
			this.anInt4618 = local67 * 923145795;
		}
		if (this.aClass382_1.anInt4625 * 2110757975 != 1 && Class305.method26796() - this.aLong266 * 1467976703334007515L > 10000L) {
			local41 = local41 + " (" + Class653.aClass357_1.method27741().anInt4590 * -909097621 + ")";
		}
		this.aClass106_11.method7526(local41, local15, local31, this.aClass382_1.anInt4632 * 1058203625, -1);
	}

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "(I)Z", line = 64)
	@Override
	public boolean method28279() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_107.method30054(this.aClass382_1.anInt4631 * 1722585703)) {
			local1 = false;
		}
		if (!this.aClass497_108.method30054(this.aClass382_1.anInt4631 * 1722585703)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "()Z", line = 64)
	@Override
	public boolean method28278() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_107.method30054(this.aClass382_1.anInt4631 * 1722585703)) {
			local1 = false;
		}
		if (!this.aClass497_108.method30054(this.aClass382_1.anInt4631 * 1722585703)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V", line = 71)
	@Override
	public void method28280() {
		@Pc(10) Class5 local10 = Class691.method36594(this.aClass497_108, this.aClass382_1.anInt4631 * 1722585703, Class157.aClass462_2);
		this.aClass106_11 = Class694.aClass104_14.method20506(local10, Class203.method24650(this.aClass497_107, this.aClass382_1.anInt4631 * 1722585703), true);
	}

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "()V", line = 71)
	@Override
	public void method28284() {
		@Pc(10) Class5 local10 = Class691.method36594(this.aClass497_108, this.aClass382_1.anInt4631 * 1722585703, Class157.aClass462_2);
		this.aClass106_11 = Class694.aClass104_14.method20506(local10, Class203.method24650(this.aClass497_107, this.aClass382_1.anInt4631 * 1722585703), true);
	}

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "()V", line = 71)
	@Override
	public void method28283() {
		@Pc(10) Class5 local10 = Class691.method36594(this.aClass497_108, this.aClass382_1.anInt4631 * 1722585703, Class157.aClass462_2);
		this.aClass106_11 = Class694.aClass104_14.method20506(local10, Class203.method24650(this.aClass497_107, this.aClass382_1.anInt4631 * 1722585703), true);
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)I", line = 71)
	public static int method28069() {
		if (Class487.anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1082(new Class475("jaclib"));
			if (Class57.aClass57_3.method1081().method30020() != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1081()).method29674() && !Class448.method28923()) {
				try {
					Class717.aClient1.method24864();
					Class211.method25428();
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15481(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause());
				} catch (@Pc(52) Throwable local52) {
				}
			}
			Class487.anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (Class487.anInt5150 * -303781075 == 1) {
			Class487.aClass57Array1 = Class57.method1078();
			Class57.aClass57_26.method1082(new Class495(Class222.aClass497_97));
			Class57.aClass57_16.method1082(new Class475("jaggl"));
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29675();
			}
			Class57.aClass57_20.method1082(local81);
			Class57.aClass57_4.method1082(new Class475("sw3d"));
			Class57.aClass57_6.method1082(new Class475("hw3d"));
			Class57.aClass57_5.method1082(new Class475("RuneScape-Setup.exe", true));
			Class57.aClass57_27.method1082(new Class495(Class364.aClass497_105));
			Class57.aClass57_7.method1082(new Class495(Class108_Sub1.aClass497_19));
			Class57.aClass57_8.method1082(new Class495(Class166_Sub45.aClass497_60));
			Class57.aClass57_9.method1082(new Class495(Class493.aClass497_124));
			Class57.aClass57_10.method1082(new Class495(Class47.aClass497_6));
			Class57.aClass57_11.method1082(new Class495(Class514.aClass497_128));
			Class57.aClass57_24.method1082(new Class495(Class157.aClass497_49));
			Class57.aClass57_12.method1082(new Class495(Class705.aClass497_141));
			Class57.aClass57_23.method1082(new Class495(Class327.aClass497_102));
			Class57.aClass57_14.method1082(new Class495(Class443.aClass497_115));
			Class57.aClass57_15.method1082(new Class495(Class621.aClass497_135));
			Class57.aClass57_2.method1082(new Class495(Class486.aClass497_123));
			Class57.aClass57_17.method1082(new Class495(Class304.aClass497_101));
			Class57.aClass57_18.method1082(new Class495(Class577.aClass497_130));
			Class57.aClass57_19.method1082(new Class495(Class75.aClass497_11));
			Class57.aClass57_25.method1082(new Class476(Class40.aClass497_4, "huffman"));
			Class57.aClass57_21.method1082(new Class495(Class200.aClass497_96));
			Class57.aClass57_22.method1082(new Class495(Class542.aClass497_129));
			Class57.aClass57_1.method1082(new Class495(Class633.aClass497_137));
			Class57.aClass57_13.method1082(new Class485(Class144_Sub1.aClass497_42, 0));
			for (local258 = 0; local258 < Class487.aClass57Array1.length; local258++) {
				if (Class487.aClass57Array1[local258].method1081() == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = Class487.aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1079();
				local298 = local288.method1081().method30020();
				local258 += local292 * local298 / 100;
			}
			Class487.anInt5151 = local258 * -1420497609;
			Class487.anInt5150 = 1625274698;
		}
		if (Class487.aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = Class487.aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1079();
			@Pc(347) int local347 = local337.method1081().method30020();
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			Class487.aClass57Array1 = null;
		}
		local258 -= Class487.anInt5151 * -1498130297;
		local321 -= Class487.anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)Z", line = 118)
	static boolean method28072() {
		return Class411.anInt4746 * 276097583 == -1 ? Class666.method32903(Class411.aString200, Class411.aString201) : Class529.method30397();
	}

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "(Lclient!aqk;I)V", line = 268)
	public static void method28071(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class93_Sub13 local8 = (Class93_Sub13) Class93_Sub13.aClass16_11.method215((long) (arg0.anInt2768 * -1688488127));
		if (local8 == null) {
			return;
		}
		if (local8.aClass539_3 != null) {
			local8.aClass539_3.method30791(100);
			Class274.aClass258_1.method26068(local8.aClass539_3);
			local8.aClass539_3 = null;
		}
		local8.method23969();
	}

	@OriginalMember(owner = "client!kg", name = "yw", descriptor = "(Lclient!yf;I)V", line = 9303)
	static final void method28070(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class106.aClass717_8.method36920();
	}
}
