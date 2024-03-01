package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aku")
public class Class40_Sub1_Sub2 extends Class40_Sub1 {

	@OriginalMember(owner = "client!aku", name = "ab", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_84;

	@OriginalMember(owner = "client!aku", name = "aj", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_85;

	@OriginalMember(owner = "client!aku", name = "aq", descriptor = "Lclient!fk;")
	Class25 aClass25_12;

	@OriginalMember(owner = "client!aku", name = "am", descriptor = "I")
	public int anInt2455;

	@OriginalMember(owner = "client!aku", name = "ae", descriptor = "I")
	public int anInt2456;

	@OriginalMember(owner = "client!aku", name = "as", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_86;

	@OriginalMember(owner = "client!aku", name = "az", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_87;

	@OriginalMember(owner = "client!aku", name = "ao", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_88;

	@OriginalMember(owner = "client!aku", name = "av", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_89;

	@OriginalMember(owner = "client!aku", name = "ag", descriptor = "I")
	public int anInt2457;

	@OriginalMember(owner = "client!aku", name = "ay", descriptor = "F")
	float aFloat182;

	@OriginalMember(owner = "client!aku", name = "ar", descriptor = "I")
	public int anInt2458;

	@OriginalMember(owner = "client!aku", name = "ai", descriptor = "Lclient!fk;")
	Class25 aClass25_13;

	@OriginalMember(owner = "client!aku", name = "ax", descriptor = "Lclient!mq;")
	public final Class328 aClass328_75 = new Class328();

	@OriginalMember(owner = "client!aku", name = "al", descriptor = "Lclient!mq;")
	public final Class328 aClass328_76 = new Class328();

	@OriginalMember(owner = "client!aku", name = "ap", descriptor = "[F")
	final float[] aFloatArray73 = new float[4];

	@OriginalMember(owner = "client!aku", name = "au", descriptor = "[F")
	final float[] aFloatArray74 = new float[4];

	@OriginalMember(owner = "client!aku", name = "an", descriptor = "Lclient!ir;")
	final Class243 aClass243_4;

	@OriginalMember(owner = "client!aku", name = "<init>", descriptor = "(Lclient!abv;Lclient!ir;)V", line = 28)
	public Class40_Sub1_Sub2(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class243 arg1) throws Exception_Sub1 {
		super(arg0);
		this.aClass243_4 = arg1;
		if (this.aClass243_4.method24753() && arg0.method17432()) {
			this.method16967("Waterfall");
		}
	}

	@OriginalMember(owner = "client!aku", name = "o", descriptor = "()Z", line = 37)
	@Override
	boolean method16988() throws Exception_Sub1 {
		this.aClass3_Sub19_Sub1_87 = this.aClass24_10.method6583("WorldMatrix");
		this.aClass3_Sub19_Sub1_89 = this.aClass24_10.method6583("WVPMatrix");
		this.aClass3_Sub19_Sub1_88 = this.aClass24_10.method6583("UGenerationPlane");
		this.aClass3_Sub19_Sub1_84 = this.aClass24_10.method6583("VGenerationPlane");
		this.aClass3_Sub19_Sub1_85 = this.aClass24_10.method6583("Time");
		this.aClass3_Sub19_Sub1_86 = this.aClass24_10.method6583("billowSampler3D");
		if (this.aClass243_4.aBoolean682) {
			this.aClass25_13 = this.aClass24_10.method6555("Waterfall3D");
			this.aClass24_10.method6560(this.aClass25_13);
		} else {
			this.aClass25_12 = this.aClass24_10.method6555("Waterfall2D");
			this.aClass24_10.method6560(this.aClass25_12);
		}
		return true;
	}

	@OriginalMember(owner = "client!aku", name = "as", descriptor = "()Z", line = 37)
	@Override
	boolean method16982() throws Exception_Sub1 {
		this.aClass3_Sub19_Sub1_87 = this.aClass24_10.method6583("WorldMatrix");
		this.aClass3_Sub19_Sub1_89 = this.aClass24_10.method6583("WVPMatrix");
		this.aClass3_Sub19_Sub1_88 = this.aClass24_10.method6583("UGenerationPlane");
		this.aClass3_Sub19_Sub1_84 = this.aClass24_10.method6583("VGenerationPlane");
		this.aClass3_Sub19_Sub1_85 = this.aClass24_10.method6583("Time");
		this.aClass3_Sub19_Sub1_86 = this.aClass24_10.method6583("billowSampler3D");
		if (this.aClass243_4.aBoolean682) {
			this.aClass25_13 = this.aClass24_10.method6555("Waterfall3D");
			this.aClass24_10.method6560(this.aClass25_13);
		} else {
			this.aClass25_12 = this.aClass24_10.method6555("Waterfall2D");
			this.aClass24_10.method6560(this.aClass25_12);
		}
		return true;
	}

	@OriginalMember(owner = "client!aku", name = "bf", descriptor = "(IIB)V", line = 55)
	public void method17003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(36) boolean local36 = (arg0 & 0x80) != 0;
		if (local36) {
			this.aFloatArray73[0] = local27;
			this.aFloatArray73[1] = 0.0F;
			this.aFloatArray73[2] = 0.0F;
			this.aFloatArray73[3] = 0.0F;
		} else {
			this.aFloatArray73[0] = 0.0F;
			this.aFloatArray73[1] = 0.0F;
			this.aFloatArray73[2] = local27;
			this.aFloatArray73[3] = 0.0F;
		}
		this.aFloatArray74[0] = 0.0F;
		this.aFloatArray74[1] = local27;
		this.aFloatArray74[2] = 0.0F;
		this.aFloatArray74[3] = local8 * (float) this.aClass21_Sub3_30.anInt2487 % 1.0F;
		if (this.aClass243_4.aBoolean682) {
			this.aFloat182 = (float) ((double) local19 * (double) this.aClass21_Sub3_30.anInt2487 % 1.0D);
		} else {
			@Pc(120) int local120 = (int) ((float) this.aClass21_Sub3_30.anInt2487 * local19 * 16.0F);
			this.aClass21_Sub3_30.method17513(this.aClass243_4.anInterface20Array1[local120 % 16]);
		}
	}

	@OriginalMember(owner = "client!aku", name = "bk", descriptor = "(II)V", line = 55)
	public void method17005(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(36) boolean local36 = (arg0 & 0x80) != 0;
		if (local36) {
			this.aFloatArray73[0] = local27;
			this.aFloatArray73[1] = 0.0F;
			this.aFloatArray73[2] = 0.0F;
			this.aFloatArray73[3] = 0.0F;
		} else {
			this.aFloatArray73[0] = 0.0F;
			this.aFloatArray73[1] = 0.0F;
			this.aFloatArray73[2] = local27;
			this.aFloatArray73[3] = 0.0F;
		}
		this.aFloatArray74[0] = 0.0F;
		this.aFloatArray74[1] = local27;
		this.aFloatArray74[2] = 0.0F;
		this.aFloatArray74[3] = local8 * (float) this.aClass21_Sub3_30.anInt2487 % 1.0F;
		if (this.aClass243_4.aBoolean682) {
			this.aFloat182 = (float) ((double) local19 * (double) this.aClass21_Sub3_30.anInt2487 % 1.0D);
		} else {
			@Pc(120) int local120 = (int) ((float) this.aClass21_Sub3_30.anInt2487 * local19 * 16.0F);
			this.aClass21_Sub3_30.method17513(this.aClass243_4.anInterface20Array1[local120 % 16]);
		}
	}

	@OriginalMember(owner = "client!aku", name = "br", descriptor = "()V", line = 85)
	public void method17002() {
		if (this.aClass243_4.aBoolean682) {
			this.aClass24_10.method6560(this.aClass25_13);
		} else {
			this.aClass24_10.method6560(this.aClass25_12);
		}
		this.aClass24_10.method6550();
		if (this.aClass243_4.aBoolean682) {
			this.aClass24_10.method6622(this.aClass3_Sub19_Sub1_86, 0, this.aClass243_4.anInterface23_2);
		}
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_87, this.aClass328_76);
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_89, this.aClass328_75);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_88, new Class333(this.aFloatArray73[0], this.aFloatArray73[1], this.aFloatArray73[2], this.aFloatArray73[3]));
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_84, new Class333(this.aFloatArray74[0], this.aFloatArray74[1], this.aFloatArray74[2], this.aFloatArray74[3]));
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_85, new Class333(this.aFloat182, 0.0F, 0.0F, 0.0F));
		this.aClass21_Sub3_30.method17555(Class263.aClass263_4, this.anInt2457 * 22925161, this.anInt2455 * 396269411, this.anInt2458 * 1360708323, this.anInt2456 * 2026574475);
	}

	@OriginalMember(owner = "client!aku", name = "bt", descriptor = "(I)V", line = 85)
	public void method17004() {
		if (this.aClass243_4.aBoolean682) {
			this.aClass24_10.method6560(this.aClass25_13);
		} else {
			this.aClass24_10.method6560(this.aClass25_12);
		}
		this.aClass24_10.method6550();
		if (this.aClass243_4.aBoolean682) {
			this.aClass24_10.method6622(this.aClass3_Sub19_Sub1_86, 0, this.aClass243_4.anInterface23_2);
		}
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_87, this.aClass328_76);
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_89, this.aClass328_75);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_88, new Class333(this.aFloatArray73[0], this.aFloatArray73[1], this.aFloatArray73[2], this.aFloatArray73[3]));
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_84, new Class333(this.aFloatArray74[0], this.aFloatArray74[1], this.aFloatArray74[2], this.aFloatArray74[3]));
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_85, new Class333(this.aFloat182, 0.0F, 0.0F, 0.0F));
		this.aClass21_Sub3_30.method17555(Class263.aClass263_4, this.anInt2457 * 22925161, this.anInt2455 * 396269411, this.anInt2458 * 1360708323, this.anInt2456 * 2026574475);
	}

	@OriginalMember(owner = "client!aku", name = "bg", descriptor = "()V", line = 85)
	public void method17006() {
		if (this.aClass243_4.aBoolean682) {
			this.aClass24_10.method6560(this.aClass25_13);
		} else {
			this.aClass24_10.method6560(this.aClass25_12);
		}
		this.aClass24_10.method6550();
		if (this.aClass243_4.aBoolean682) {
			this.aClass24_10.method6622(this.aClass3_Sub19_Sub1_86, 0, this.aClass243_4.anInterface23_2);
		}
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_87, this.aClass328_76);
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_89, this.aClass328_75);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_88, new Class333(this.aFloatArray73[0], this.aFloatArray73[1], this.aFloatArray73[2], this.aFloatArray73[3]));
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_84, new Class333(this.aFloatArray74[0], this.aFloatArray74[1], this.aFloatArray74[2], this.aFloatArray74[3]));
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_85, new Class333(this.aFloat182, 0.0F, 0.0F, 0.0F));
		this.aClass21_Sub3_30.method17555(Class263.aClass263_4, this.anInt2457 * 22925161, this.anInt2455 * 396269411, this.anInt2458 * 1360708323, this.anInt2456 * 2026574475);
	}

	@OriginalMember(owner = "client!aku", name = "bb", descriptor = "()V", line = 85)
	public void method17007() {
		if (this.aClass243_4.aBoolean682) {
			this.aClass24_10.method6560(this.aClass25_13);
		} else {
			this.aClass24_10.method6560(this.aClass25_12);
		}
		this.aClass24_10.method6550();
		if (this.aClass243_4.aBoolean682) {
			this.aClass24_10.method6622(this.aClass3_Sub19_Sub1_86, 0, this.aClass243_4.anInterface23_2);
		}
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_87, this.aClass328_76);
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_89, this.aClass328_75);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_88, new Class333(this.aFloatArray73[0], this.aFloatArray73[1], this.aFloatArray73[2], this.aFloatArray73[3]));
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_84, new Class333(this.aFloatArray74[0], this.aFloatArray74[1], this.aFloatArray74[2], this.aFloatArray74[3]));
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_85, new Class333(this.aFloat182, 0.0F, 0.0F, 0.0F));
		this.aClass21_Sub3_30.method17555(Class263.aClass263_4, this.anInt2457 * 22925161, this.anInt2455 * 396269411, this.anInt2458 * 1360708323, this.anInt2456 * 2026574475);
	}
}
