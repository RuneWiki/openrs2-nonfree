package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agp")
public class Class106_Sub2 extends Class106 {

	@OriginalMember(owner = "client!agp", name = "e", descriptor = "Lclient!hr;")
	Class105 aClass105_2;

	@OriginalMember(owner = "client!agp", name = "z", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_2;

	@OriginalMember(owner = "client!agp", name = "s", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_3;

	@OriginalMember(owner = "client!agp", name = "r", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_4;

	@OriginalMember(owner = "client!agp", name = "j", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_5;

	@OriginalMember(owner = "client!agp", name = "q", descriptor = "Lclient!hi;")
	Class112 aClass112_3;

	@OriginalMember(owner = "client!agp", name = "k", descriptor = "Lclient!hr;")
	Class105 aClass105_3;

	@OriginalMember(owner = "client!agp", name = "i", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_6;

	@OriginalMember(owner = "client!agp", name = "g", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_7;

	@OriginalMember(owner = "client!agp", name = "u", descriptor = "Lclient!hr;")
	Class105 aClass105_4;

	@OriginalMember(owner = "client!agp", name = "x", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_8;

	@OriginalMember(owner = "client!agp", name = "d", descriptor = "Lclient!oi;")
	final Class442 aClass442_42 = new Class442();

	@OriginalMember(owner = "client!agp", name = "<init>", descriptor = "(Lclient!aed;)V", line = 24)
	public Class106_Sub2(@OriginalArg(0) Class86_Sub1 arg0) throws Exception_Sub3 {
		super(arg0);
		this.method8977();
	}

	@OriginalMember(owner = "client!agp", name = "s", descriptor = "(I)Z", line = 29)
	boolean method8977() throws Exception_Sub3 {
		this.aClass112_3 = this.aClass86_Sub1_13.method20613("Particle");
		this.aClass77_Sub12_Sub1_3 = this.aClass112_3.method9524("WVPMatrix");
		this.aClass77_Sub12_Sub1_8 = this.aClass112_3.method9524("DiffuseSampler");
		this.aClass77_Sub12_Sub1_4 = this.aClass112_3.method9524("TexCoordMatrix");
		this.aClass77_Sub12_Sub1_7 = this.aClass112_3.method9524("DistanceFogPlane");
		this.aClass77_Sub12_Sub1_2 = this.aClass112_3.method9524("DistanceFogColour");
		this.aClass77_Sub12_Sub1_5 = this.aClass112_3.method9524("DistanceFogAmount");
		this.aClass77_Sub12_Sub1_6 = this.aClass112_3.method9524("DiffuseColour");
		this.aClass105_3 = this.aClass112_3.method9458("NoFog");
		this.aClass105_4 = this.aClass112_3.method9458("ParticleFog");
		this.aClass105_2 = this.aClass112_3.method9458("BillboardFog");
		if (!this.aClass105_3.method9595()) {
			return false;
		} else if (this.aClass105_4.method9595()) {
			return this.aClass105_2.method9595();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agp", name = "z", descriptor = "()Z", line = 29)
	boolean method8978() throws Exception_Sub3 {
		this.aClass112_3 = this.aClass86_Sub1_13.method20613("Particle");
		this.aClass77_Sub12_Sub1_3 = this.aClass112_3.method9524("WVPMatrix");
		this.aClass77_Sub12_Sub1_8 = this.aClass112_3.method9524("DiffuseSampler");
		this.aClass77_Sub12_Sub1_4 = this.aClass112_3.method9524("TexCoordMatrix");
		this.aClass77_Sub12_Sub1_7 = this.aClass112_3.method9524("DistanceFogPlane");
		this.aClass77_Sub12_Sub1_2 = this.aClass112_3.method9524("DistanceFogColour");
		this.aClass77_Sub12_Sub1_5 = this.aClass112_3.method9524("DistanceFogAmount");
		this.aClass77_Sub12_Sub1_6 = this.aClass112_3.method9524("DiffuseColour");
		this.aClass105_3 = this.aClass112_3.method9458("NoFog");
		this.aClass105_4 = this.aClass112_3.method9458("ParticleFog");
		this.aClass105_2 = this.aClass112_3.method9458("BillboardFog");
		if (!this.aClass105_3.method9595()) {
			return false;
		} else if (this.aClass105_4.method9595()) {
			return this.aClass105_2.method9595();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agp", name = "g", descriptor = "()Z", line = 29)
	boolean method8979() throws Exception_Sub3 {
		this.aClass112_3 = this.aClass86_Sub1_13.method20613("Particle");
		this.aClass77_Sub12_Sub1_3 = this.aClass112_3.method9524("WVPMatrix");
		this.aClass77_Sub12_Sub1_8 = this.aClass112_3.method9524("DiffuseSampler");
		this.aClass77_Sub12_Sub1_4 = this.aClass112_3.method9524("TexCoordMatrix");
		this.aClass77_Sub12_Sub1_7 = this.aClass112_3.method9524("DistanceFogPlane");
		this.aClass77_Sub12_Sub1_2 = this.aClass112_3.method9524("DistanceFogColour");
		this.aClass77_Sub12_Sub1_5 = this.aClass112_3.method9524("DistanceFogAmount");
		this.aClass77_Sub12_Sub1_6 = this.aClass112_3.method9524("DiffuseColour");
		this.aClass105_3 = this.aClass112_3.method9458("NoFog");
		this.aClass105_4 = this.aClass112_3.method9458("ParticleFog");
		this.aClass105_2 = this.aClass112_3.method9458("BillboardFog");
		if (!this.aClass105_3.method9595()) {
			return false;
		} else if (this.aClass105_4.method9595()) {
			return this.aClass105_2.method9595();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!agp", name = "p", descriptor = "(Lclient!oi;)V", line = 47)
	@Override
	public void method8969(@OriginalArg(0) Class442 arg0) {
		this.aClass442_42.method28954(arg0);
		this.aClass442_42.method28965(this.aClass86_Sub1_13.aClass442_84);
	}

	@OriginalMember(owner = "client!agp", name = "y", descriptor = "(Lclient!oi;)V", line = 47)
	@Override
	public void method8967(@OriginalArg(0) Class442 arg0) {
		this.aClass442_42.method28954(arg0);
		this.aClass442_42.method28965(this.aClass86_Sub1_13.aClass442_84);
	}

	@OriginalMember(owner = "client!agp", name = "w", descriptor = "(Lclient!oi;)V", line = 47)
	@Override
	public void method8973(@OriginalArg(0) Class442 arg0) {
		this.aClass442_42.method28954(arg0);
		this.aClass442_42.method28965(this.aClass86_Sub1_13.aClass442_84);
	}

	@OriginalMember(owner = "client!agp", name = "l", descriptor = "(Lclient!oi;)V", line = 47)
	@Override
	public void method8972(@OriginalArg(0) Class442 arg0) {
		this.aClass442_42.method28954(arg0);
		this.aClass442_42.method28965(this.aClass86_Sub1_13.aClass442_84);
	}

	@OriginalMember(owner = "client!agp", name = "c", descriptor = "(IZ)V", line = 52)
	@Override
	public void method8971(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass112_3.method9547(arg1 ? this.aClass105_4 : this.aClass105_3);
		this.aClass112_3.method9545();
		this.method8981(arg1, true);
		this.aClass86_Sub1_13.method20663(Class384.aClass384_4, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!agp", name = "t", descriptor = "(IZ)V", line = 52)
	@Override
	public void method8974(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass112_3.method9547(arg1 ? this.aClass105_4 : this.aClass105_3);
		this.aClass112_3.method9545();
		this.method8981(arg1, true);
		this.aClass86_Sub1_13.method20663(Class384.aClass384_4, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!agp", name = "q", descriptor = "(IZ)V", line = 52)
	@Override
	public void method8975(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass112_3.method9547(arg1 ? this.aClass105_4 : this.aClass105_3);
		this.aClass112_3.method9545();
		this.method8981(arg1, true);
		this.aClass86_Sub1_13.method20663(Class384.aClass384_4, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!agp", name = "x", descriptor = "(IZ)V", line = 52)
	@Override
	public void method8968(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass112_3.method9547(arg1 ? this.aClass105_4 : this.aClass105_3);
		this.aClass112_3.method9545();
		this.method8981(arg1, true);
		this.aClass86_Sub1_13.method20663(Class384.aClass384_4, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!agp", name = "v", descriptor = "(Z)V", line = 59)
	@Override
	public void method8970(@OriginalArg(0) boolean arg0) {
		this.aClass112_3.method9547(arg0 ? this.aClass105_2 : this.aClass105_3);
		this.aClass112_3.method9545();
		this.method8981(arg0, false);
		this.aClass86_Sub1_13.method20591();
	}

	@OriginalMember(owner = "client!agp", name = "d", descriptor = "(Z)V", line = 59)
	@Override
	public void method8976(@OriginalArg(0) boolean arg0) {
		this.aClass112_3.method9547(arg0 ? this.aClass105_2 : this.aClass105_3);
		this.aClass112_3.method9545();
		this.method8981(arg0, false);
		this.aClass86_Sub1_13.method20591();
	}

	@OriginalMember(owner = "client!agp", name = "j", descriptor = "(ZZ)V", line = 66)
	void method8980(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass112_3.method9503(this.aClass77_Sub12_Sub1_8, 0, this.anInterface37_15);
		this.aClass112_3.method9500(this.aClass77_Sub12_Sub1_3, this.aClass442_42);
		this.aClass112_3.method9497(this.aClass77_Sub12_Sub1_4, this.aClass442_41);
		this.aClass112_3.method9493(this.aClass77_Sub12_Sub1_6, this.anInt1046);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass112_3.method9483(this.aClass77_Sub12_Sub1_7, this.aClass450_5.aFloat279, this.aClass450_5.aFloat280, this.aClass450_5.aFloat282, this.aClass450_5.aFloat281);
		} else {
			this.aClass112_3.method9474(this.aClass77_Sub12_Sub1_5, Math.min(Math.max(this.aFloat118, 0.0F), 1.0F));
		}
		this.aClass112_3.method9480(this.aClass77_Sub12_Sub1_2, this.aClass447_16.aFloat277, this.aClass447_16.aFloat276, this.aClass447_16.aFloat278);
	}

	@OriginalMember(owner = "client!agp", name = "r", descriptor = "(ZZI)V", line = 66)
	void method8981(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass112_3.method9503(this.aClass77_Sub12_Sub1_8, 0, this.anInterface37_15);
		this.aClass112_3.method9500(this.aClass77_Sub12_Sub1_3, this.aClass442_42);
		this.aClass112_3.method9497(this.aClass77_Sub12_Sub1_4, this.aClass442_41);
		this.aClass112_3.method9493(this.aClass77_Sub12_Sub1_6, this.anInt1046);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass112_3.method9483(this.aClass77_Sub12_Sub1_7, this.aClass450_5.aFloat279, this.aClass450_5.aFloat280, this.aClass450_5.aFloat282, this.aClass450_5.aFloat281);
		} else {
			this.aClass112_3.method9474(this.aClass77_Sub12_Sub1_5, Math.min(Math.max(this.aFloat118, 0.0F), 1.0F));
		}
		this.aClass112_3.method9480(this.aClass77_Sub12_Sub1_2, this.aClass447_16.aFloat277, this.aClass447_16.aFloat276, this.aClass447_16.aFloat278);
	}

	@OriginalMember(owner = "client!agp", name = "k", descriptor = "(ZZ)V", line = 66)
	void method8982(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass112_3.method9503(this.aClass77_Sub12_Sub1_8, 0, this.anInterface37_15);
		this.aClass112_3.method9500(this.aClass77_Sub12_Sub1_3, this.aClass442_42);
		this.aClass112_3.method9497(this.aClass77_Sub12_Sub1_4, this.aClass442_41);
		this.aClass112_3.method9493(this.aClass77_Sub12_Sub1_6, this.anInt1046);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass112_3.method9483(this.aClass77_Sub12_Sub1_7, this.aClass450_5.aFloat279, this.aClass450_5.aFloat280, this.aClass450_5.aFloat282, this.aClass450_5.aFloat281);
		} else {
			this.aClass112_3.method9474(this.aClass77_Sub12_Sub1_5, Math.min(Math.max(this.aFloat118, 0.0F), 1.0F));
		}
		this.aClass112_3.method9480(this.aClass77_Sub12_Sub1_2, this.aClass447_16.aFloat277, this.aClass447_16.aFloat276, this.aClass447_16.aFloat278);
	}

	@OriginalMember(owner = "client!agp", name = "i", descriptor = "(ZZ)V", line = 66)
	void method8983(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass112_3.method9503(this.aClass77_Sub12_Sub1_8, 0, this.anInterface37_15);
		this.aClass112_3.method9500(this.aClass77_Sub12_Sub1_3, this.aClass442_42);
		this.aClass112_3.method9497(this.aClass77_Sub12_Sub1_4, this.aClass442_41);
		this.aClass112_3.method9493(this.aClass77_Sub12_Sub1_6, this.anInt1046);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass112_3.method9483(this.aClass77_Sub12_Sub1_7, this.aClass450_5.aFloat279, this.aClass450_5.aFloat280, this.aClass450_5.aFloat282, this.aClass450_5.aFloat281);
		} else {
			this.aClass112_3.method9474(this.aClass77_Sub12_Sub1_5, Math.min(Math.max(this.aFloat118, 0.0F), 1.0F));
		}
		this.aClass112_3.method9480(this.aClass77_Sub12_Sub1_2, this.aClass447_16.aFloat277, this.aClass447_16.aFloat276, this.aClass447_16.aFloat278);
	}

	@OriginalMember(owner = "client!agp", name = "nl", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6954)
	static final void method8984(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray33 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!agp", name = "alc", descriptor = "(Lclient!yf;I)V", line = 11477)
	static final void method8985(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class597.aClass107_Sub1_2.method8839((float) local13, (float) local23);
	}
}
