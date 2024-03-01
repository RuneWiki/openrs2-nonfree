package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adv")
public class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!adv", name = "d", descriptor = "Lclient!fk;")
	Class25 aClass25_7;

	@OriginalMember(owner = "client!adv", name = "y", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_32;

	@OriginalMember(owner = "client!adv", name = "c", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_33;

	@OriginalMember(owner = "client!adv", name = "q", descriptor = "Lclient!fk;")
	Class25 aClass25_8;

	@OriginalMember(owner = "client!adv", name = "j", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_34;

	@OriginalMember(owner = "client!adv", name = "n", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_35;

	@OriginalMember(owner = "client!adv", name = "e", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_36;

	@OriginalMember(owner = "client!adv", name = "z", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_37;

	@OriginalMember(owner = "client!adv", name = "r", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_38;

	@OriginalMember(owner = "client!adv", name = "u", descriptor = "Lclient!fc;")
	Class24 aClass24_7;

	@OriginalMember(owner = "client!adv", name = "m", descriptor = "Lclient!fk;")
	Class25 aClass25_9;

	@OriginalMember(owner = "client!adv", name = "b", descriptor = "Lclient!mq;")
	final Class328 aClass328_50 = new Class328();

	@OriginalMember(owner = "client!adv", name = "<init>", descriptor = "(Lclient!abv;)V", line = 24)
	public Class39_Sub2(@OriginalArg(0) Class21_Sub3 arg0) throws Exception_Sub1 {
		super(arg0);
		this.method8265();
	}

	@OriginalMember(owner = "client!adv", name = "c", descriptor = "()Z", line = 29)
	boolean method8263() throws Exception_Sub1 {
		this.aClass24_7 = this.aClass21_Sub3_21.method17435("Particle");
		this.aClass3_Sub19_Sub1_33 = this.aClass24_7.method6583("WVPMatrix");
		this.aClass3_Sub19_Sub1_32 = this.aClass24_7.method6583("DiffuseSampler");
		this.aClass3_Sub19_Sub1_37 = this.aClass24_7.method6583("TexCoordMatrix");
		this.aClass3_Sub19_Sub1_34 = this.aClass24_7.method6583("DistanceFogPlane");
		this.aClass3_Sub19_Sub1_35 = this.aClass24_7.method6583("DistanceFogColour");
		this.aClass3_Sub19_Sub1_36 = this.aClass24_7.method6583("DistanceFogAmount");
		this.aClass3_Sub19_Sub1_38 = this.aClass24_7.method6583("DiffuseColour");
		this.aClass25_7 = this.aClass24_7.method6555("NoFog");
		this.aClass25_8 = this.aClass24_7.method6555("ParticleFog");
		this.aClass25_9 = this.aClass24_7.method6555("BillboardFog");
		if (!this.aClass25_7.method6418()) {
			return false;
		} else if (this.aClass25_8.method6418()) {
			return this.aClass25_9.method6418();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!adv", name = "z", descriptor = "()Z", line = 29)
	boolean method8264() throws Exception_Sub1 {
		this.aClass24_7 = this.aClass21_Sub3_21.method17435("Particle");
		this.aClass3_Sub19_Sub1_33 = this.aClass24_7.method6583("WVPMatrix");
		this.aClass3_Sub19_Sub1_32 = this.aClass24_7.method6583("DiffuseSampler");
		this.aClass3_Sub19_Sub1_37 = this.aClass24_7.method6583("TexCoordMatrix");
		this.aClass3_Sub19_Sub1_34 = this.aClass24_7.method6583("DistanceFogPlane");
		this.aClass3_Sub19_Sub1_35 = this.aClass24_7.method6583("DistanceFogColour");
		this.aClass3_Sub19_Sub1_36 = this.aClass24_7.method6583("DistanceFogAmount");
		this.aClass3_Sub19_Sub1_38 = this.aClass24_7.method6583("DiffuseColour");
		this.aClass25_7 = this.aClass24_7.method6555("NoFog");
		this.aClass25_8 = this.aClass24_7.method6555("ParticleFog");
		this.aClass25_9 = this.aClass24_7.method6555("BillboardFog");
		if (!this.aClass25_7.method6418()) {
			return false;
		} else if (this.aClass25_8.method6418()) {
			return this.aClass25_9.method6418();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!adv", name = "y", descriptor = "(B)Z", line = 29)
	boolean method8265() throws Exception_Sub1 {
		this.aClass24_7 = this.aClass21_Sub3_21.method17435("Particle");
		this.aClass3_Sub19_Sub1_33 = this.aClass24_7.method6583("WVPMatrix");
		this.aClass3_Sub19_Sub1_32 = this.aClass24_7.method6583("DiffuseSampler");
		this.aClass3_Sub19_Sub1_37 = this.aClass24_7.method6583("TexCoordMatrix");
		this.aClass3_Sub19_Sub1_34 = this.aClass24_7.method6583("DistanceFogPlane");
		this.aClass3_Sub19_Sub1_35 = this.aClass24_7.method6583("DistanceFogColour");
		this.aClass3_Sub19_Sub1_36 = this.aClass24_7.method6583("DistanceFogAmount");
		this.aClass3_Sub19_Sub1_38 = this.aClass24_7.method6583("DiffuseColour");
		this.aClass25_7 = this.aClass24_7.method6555("NoFog");
		this.aClass25_8 = this.aClass24_7.method6555("ParticleFog");
		this.aClass25_9 = this.aClass24_7.method6555("BillboardFog");
		if (!this.aClass25_7.method6418()) {
			return false;
		} else if (this.aClass25_8.method6418()) {
			return this.aClass25_9.method6418();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!adv", name = "p", descriptor = "(Lclient!mq;)V", line = 47)
	@Override
	public void method8254(@OriginalArg(0) Class328 arg0) {
		this.aClass328_50.method26104(arg0);
		this.aClass328_50.method26046(this.aClass21_Sub3_21.aClass328_85);
	}

	@OriginalMember(owner = "client!adv", name = "l", descriptor = "(Lclient!mq;)V", line = 47)
	@Override
	public void method8256(@OriginalArg(0) Class328 arg0) {
		this.aClass328_50.method26104(arg0);
		this.aClass328_50.method26046(this.aClass21_Sub3_21.aClass328_85);
	}

	@OriginalMember(owner = "client!adv", name = "a", descriptor = "(IZ)V", line = 52)
	@Override
	public void method8259(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass24_7.method6560(arg1 ? this.aClass25_8 : this.aClass25_7);
		this.aClass24_7.method6550();
		this.method8261(arg1, true);
		this.aClass21_Sub3_21.method17555(Class263.aClass263_4, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!adv", name = "x", descriptor = "(IZ)V", line = 52)
	@Override
	public void method8258(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass24_7.method6560(arg1 ? this.aClass25_8 : this.aClass25_7);
		this.aClass24_7.method6550();
		this.method8261(arg1, true);
		this.aClass21_Sub3_21.method17555(Class263.aClass263_4, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!adv", name = "h", descriptor = "(IZ)V", line = 52)
	@Override
	public void method8260(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass24_7.method6560(arg1 ? this.aClass25_8 : this.aClass25_7);
		this.aClass24_7.method6550();
		this.method8261(arg1, true);
		this.aClass21_Sub3_21.method17555(Class263.aClass263_4, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!adv", name = "s", descriptor = "(IZ)V", line = 52)
	@Override
	public void method8257(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass24_7.method6560(arg1 ? this.aClass25_8 : this.aClass25_7);
		this.aClass24_7.method6550();
		this.method8261(arg1, true);
		this.aClass21_Sub3_21.method17555(Class263.aClass263_4, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!adv", name = "u", descriptor = "(Z)V", line = 59)
	@Override
	public void method8253(@OriginalArg(0) boolean arg0) {
		this.aClass24_7.method6560(arg0 ? this.aClass25_9 : this.aClass25_7);
		this.aClass24_7.method6550();
		this.method8261(arg0, false);
		this.aClass21_Sub3_21.method17552();
	}

	@OriginalMember(owner = "client!adv", name = "g", descriptor = "(Z)V", line = 59)
	@Override
	public void method8255(@OriginalArg(0) boolean arg0) {
		this.aClass24_7.method6560(arg0 ? this.aClass25_9 : this.aClass25_7);
		this.aClass24_7.method6550();
		this.method8261(arg0, false);
		this.aClass21_Sub3_21.method17552();
	}

	@OriginalMember(owner = "client!adv", name = "b", descriptor = "(ZZI)V", line = 66)
	void method8261(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass24_7.method6622(this.aClass3_Sub19_Sub1_32, 0, this.anInterface20_17);
		this.aClass24_7.method6620(this.aClass3_Sub19_Sub1_33, this.aClass328_50);
		this.aClass24_7.method6572(this.aClass3_Sub19_Sub1_37, this.aClass328_49);
		this.aClass24_7.method6616(this.aClass3_Sub19_Sub1_38, this.anInt883);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass24_7.method6567(this.aClass3_Sub19_Sub1_34, this.aClass333_11.aFloat283, this.aClass333_11.aFloat282, this.aClass333_11.aFloat284, this.aClass333_11.aFloat281);
		} else {
			this.aClass24_7.method6564(this.aClass3_Sub19_Sub1_36, Math.min(Math.max(this.aFloat134, 0.0F), 1.0F));
		}
		this.aClass24_7.method6566(this.aClass3_Sub19_Sub1_35, this.aClass320_44.aFloat259, this.aClass320_44.aFloat260, this.aClass320_44.aFloat261);
	}

	@OriginalMember(owner = "client!adv", name = "j", descriptor = "(ZZ)V", line = 66)
	void method8262(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass24_7.method6622(this.aClass3_Sub19_Sub1_32, 0, this.anInterface20_17);
		this.aClass24_7.method6620(this.aClass3_Sub19_Sub1_33, this.aClass328_50);
		this.aClass24_7.method6572(this.aClass3_Sub19_Sub1_37, this.aClass328_49);
		this.aClass24_7.method6616(this.aClass3_Sub19_Sub1_38, this.anInt883);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass24_7.method6567(this.aClass3_Sub19_Sub1_34, this.aClass333_11.aFloat283, this.aClass333_11.aFloat282, this.aClass333_11.aFloat284, this.aClass333_11.aFloat281);
		} else {
			this.aClass24_7.method6564(this.aClass3_Sub19_Sub1_36, Math.min(Math.max(this.aFloat134, 0.0F), 1.0F));
		}
		this.aClass24_7.method6566(this.aClass3_Sub19_Sub1_35, this.aClass320_44.aFloat259, this.aClass320_44.aFloat260, this.aClass320_44.aFloat261);
	}

	@OriginalMember(owner = "client!adv", name = "n", descriptor = "(ZZ)V", line = 66)
	void method8266(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass24_7.method6622(this.aClass3_Sub19_Sub1_32, 0, this.anInterface20_17);
		this.aClass24_7.method6620(this.aClass3_Sub19_Sub1_33, this.aClass328_50);
		this.aClass24_7.method6572(this.aClass3_Sub19_Sub1_37, this.aClass328_49);
		this.aClass24_7.method6616(this.aClass3_Sub19_Sub1_38, this.anInt883);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass24_7.method6567(this.aClass3_Sub19_Sub1_34, this.aClass333_11.aFloat283, this.aClass333_11.aFloat282, this.aClass333_11.aFloat284, this.aClass333_11.aFloat281);
		} else {
			this.aClass24_7.method6564(this.aClass3_Sub19_Sub1_36, Math.min(Math.max(this.aFloat134, 0.0F), 1.0F));
		}
		this.aClass24_7.method6566(this.aClass3_Sub19_Sub1_35, this.aClass320_44.aFloat259, this.aClass320_44.aFloat260, this.aClass320_44.aFloat261);
	}

	@OriginalMember(owner = "client!adv", name = "e", descriptor = "(ZZ)V", line = 66)
	void method8267(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass24_7.method6622(this.aClass3_Sub19_Sub1_32, 0, this.anInterface20_17);
		this.aClass24_7.method6620(this.aClass3_Sub19_Sub1_33, this.aClass328_50);
		this.aClass24_7.method6572(this.aClass3_Sub19_Sub1_37, this.aClass328_49);
		this.aClass24_7.method6616(this.aClass3_Sub19_Sub1_38, this.anInt883);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass24_7.method6567(this.aClass3_Sub19_Sub1_34, this.aClass333_11.aFloat283, this.aClass333_11.aFloat282, this.aClass333_11.aFloat284, this.aClass333_11.aFloat281);
		} else {
			this.aClass24_7.method6564(this.aClass3_Sub19_Sub1_36, Math.min(Math.max(this.aFloat134, 0.0F), 1.0F));
		}
		this.aClass24_7.method6566(this.aClass3_Sub19_Sub1_35, this.aClass320_44.aFloat259, this.aClass320_44.aFloat260, this.aClass320_44.aFloat261);
	}

	@OriginalMember(owner = "client!adv", name = "b", descriptor = "(IZB)V", line = 127)
	static void method8268(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg1);
		if (local4 != null) {
			local4.method33656();
		}
	}
}
