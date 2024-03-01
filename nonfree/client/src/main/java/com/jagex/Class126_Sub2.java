package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahr")
public class Class126_Sub2 extends Class126 {

	@OriginalMember(owner = "client!ahr", name = "o", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_18;

	@OriginalMember(owner = "client!ahr", name = "c", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_19;

	@OriginalMember(owner = "client!ahr", name = "u", descriptor = "Lclient!ho;")
	Class115 aClass115_3;

	@OriginalMember(owner = "client!ahr", name = "d", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_20;

	@OriginalMember(owner = "client!ahr", name = "r", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_21;

	@OriginalMember(owner = "client!ahr", name = "v", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_22;

	@OriginalMember(owner = "client!ahr", name = "x", descriptor = "Lclient!hi;")
	Class116 aClass116_2;

	@OriginalMember(owner = "client!ahr", name = "s", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_23;

	@OriginalMember(owner = "client!ahr", name = "z", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_24;

	@OriginalMember(owner = "client!ahr", name = "q", descriptor = "Lclient!hi;")
	Class116 aClass116_3;

	@OriginalMember(owner = "client!ahr", name = "y", descriptor = "Lclient!hi;")
	Class116 aClass116_4;

	@OriginalMember(owner = "client!ahr", name = "p", descriptor = "Lclient!pq;")
	final Class489 aClass489_38 = new Class489();

	@OriginalMember(owner = "client!ahr", name = "<init>", descriptor = "(Lclient!afc;)V", line = 24)
	public Class126_Sub2(@OriginalArg(0) Class104_Sub2 arg0) throws Exception_Sub2 {
		super(arg0);
		this.method10041();
	}

	@OriginalMember(owner = "client!ahr", name = "p", descriptor = "(B)Z", line = 29)
	boolean method10041() throws Exception_Sub2 {
		this.aClass115_3 = this.aClass104_Sub2_15.method20892("Particle");
		this.aClass93_Sub33_Sub1_20 = this.aClass115_3.method8198("WVPMatrix");
		this.aClass93_Sub33_Sub1_24 = this.aClass115_3.method8198("DiffuseSampler");
		this.aClass93_Sub33_Sub1_19 = this.aClass115_3.method8198("TexCoordMatrix");
		this.aClass93_Sub33_Sub1_21 = this.aClass115_3.method8198("DistanceFogPlane");
		this.aClass93_Sub33_Sub1_22 = this.aClass115_3.method8198("DistanceFogColour");
		this.aClass93_Sub33_Sub1_18 = this.aClass115_3.method8198("DistanceFogAmount");
		this.aClass93_Sub33_Sub1_23 = this.aClass115_3.method8198("DiffuseColour");
		this.aClass116_4 = this.aClass115_3.method8268("NoFog");
		this.aClass116_3 = this.aClass115_3.method8268("ParticleFog");
		this.aClass116_2 = this.aClass115_3.method8268("BillboardFog");
		if (!this.aClass116_4.method8438()) {
			return false;
		} else if (this.aClass116_3.method8438()) {
			return this.aClass116_2.method8438();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "c", descriptor = "()Z", line = 29)
	boolean method10042() throws Exception_Sub2 {
		this.aClass115_3 = this.aClass104_Sub2_15.method20892("Particle");
		this.aClass93_Sub33_Sub1_20 = this.aClass115_3.method8198("WVPMatrix");
		this.aClass93_Sub33_Sub1_24 = this.aClass115_3.method8198("DiffuseSampler");
		this.aClass93_Sub33_Sub1_19 = this.aClass115_3.method8198("TexCoordMatrix");
		this.aClass93_Sub33_Sub1_21 = this.aClass115_3.method8198("DistanceFogPlane");
		this.aClass93_Sub33_Sub1_22 = this.aClass115_3.method8198("DistanceFogColour");
		this.aClass93_Sub33_Sub1_18 = this.aClass115_3.method8198("DistanceFogAmount");
		this.aClass93_Sub33_Sub1_23 = this.aClass115_3.method8198("DiffuseColour");
		this.aClass116_4 = this.aClass115_3.method8268("NoFog");
		this.aClass116_3 = this.aClass115_3.method8268("ParticleFog");
		this.aClass116_2 = this.aClass115_3.method8268("BillboardFog");
		if (!this.aClass116_4.method8438()) {
			return false;
		} else if (this.aClass116_3.method8438()) {
			return this.aClass116_2.method8438();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "v", descriptor = "()Z", line = 29)
	boolean method10043() throws Exception_Sub2 {
		this.aClass115_3 = this.aClass104_Sub2_15.method20892("Particle");
		this.aClass93_Sub33_Sub1_20 = this.aClass115_3.method8198("WVPMatrix");
		this.aClass93_Sub33_Sub1_24 = this.aClass115_3.method8198("DiffuseSampler");
		this.aClass93_Sub33_Sub1_19 = this.aClass115_3.method8198("TexCoordMatrix");
		this.aClass93_Sub33_Sub1_21 = this.aClass115_3.method8198("DistanceFogPlane");
		this.aClass93_Sub33_Sub1_22 = this.aClass115_3.method8198("DistanceFogColour");
		this.aClass93_Sub33_Sub1_18 = this.aClass115_3.method8198("DistanceFogAmount");
		this.aClass93_Sub33_Sub1_23 = this.aClass115_3.method8198("DiffuseColour");
		this.aClass116_4 = this.aClass115_3.method8268("NoFog");
		this.aClass116_3 = this.aClass115_3.method8268("ParticleFog");
		this.aClass116_2 = this.aClass115_3.method8268("BillboardFog");
		if (!this.aClass116_4.method8438()) {
			return false;
		} else if (this.aClass116_3.method8438()) {
			return this.aClass116_2.method8438();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "r", descriptor = "()Z", line = 29)
	boolean method10044() throws Exception_Sub2 {
		this.aClass115_3 = this.aClass104_Sub2_15.method20892("Particle");
		this.aClass93_Sub33_Sub1_20 = this.aClass115_3.method8198("WVPMatrix");
		this.aClass93_Sub33_Sub1_24 = this.aClass115_3.method8198("DiffuseSampler");
		this.aClass93_Sub33_Sub1_19 = this.aClass115_3.method8198("TexCoordMatrix");
		this.aClass93_Sub33_Sub1_21 = this.aClass115_3.method8198("DistanceFogPlane");
		this.aClass93_Sub33_Sub1_22 = this.aClass115_3.method8198("DistanceFogColour");
		this.aClass93_Sub33_Sub1_18 = this.aClass115_3.method8198("DistanceFogAmount");
		this.aClass93_Sub33_Sub1_23 = this.aClass115_3.method8198("DiffuseColour");
		this.aClass116_4 = this.aClass115_3.method8268("NoFog");
		this.aClass116_3 = this.aClass115_3.method8268("ParticleFog");
		this.aClass116_2 = this.aClass115_3.method8268("BillboardFog");
		if (!this.aClass116_4.method8438()) {
			return false;
		} else if (this.aClass116_3.method8438()) {
			return this.aClass116_2.method8438();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "e", descriptor = "(Lclient!pq;)V", line = 47)
	@Override
	public void method10032(@OriginalArg(0) Class489 arg0) {
		this.aClass489_38.method29837(arg0);
		this.aClass489_38.method29953(this.aClass104_Sub2_15.aClass489_84);
	}

	@OriginalMember(owner = "client!ahr", name = "k", descriptor = "(Lclient!pq;)V", line = 47)
	@Override
	public void method10036(@OriginalArg(0) Class489 arg0) {
		this.aClass489_38.method29837(arg0);
		this.aClass489_38.method29953(this.aClass104_Sub2_15.aClass489_84);
	}

	@OriginalMember(owner = "client!ahr", name = "f", descriptor = "(Lclient!pq;)V", line = 47)
	@Override
	public void method10035(@OriginalArg(0) Class489 arg0) {
		this.aClass489_38.method29837(arg0);
		this.aClass489_38.method29953(this.aClass104_Sub2_15.aClass489_84);
	}

	@OriginalMember(owner = "client!ahr", name = "w", descriptor = "(Lclient!pq;)V", line = 47)
	@Override
	public void method10039(@OriginalArg(0) Class489 arg0) {
		this.aClass489_38.method29837(arg0);
		this.aClass489_38.method29953(this.aClass104_Sub2_15.aClass489_84);
	}

	@OriginalMember(owner = "client!ahr", name = "n", descriptor = "(IZ)V", line = 52)
	@Override
	public void method10033(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8203(arg1 ? this.aClass116_3 : this.aClass116_4);
		this.aClass115_3.method8285();
		this.method10040(arg1, true);
		this.aClass104_Sub2_15.method21007(Class424.aClass424_3, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!ahr", name = "l", descriptor = "(IZ)V", line = 52)
	@Override
	public void method10037(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8203(arg1 ? this.aClass116_3 : this.aClass116_4);
		this.aClass115_3.method8285();
		this.method10040(arg1, true);
		this.aClass104_Sub2_15.method21007(Class424.aClass424_3, 0, arg0 * 4, 0, arg0 * 2);
	}

	@OriginalMember(owner = "client!ahr", name = "m", descriptor = "(Z)V", line = 59)
	@Override
	public void method10034(@OriginalArg(0) boolean arg0) {
		this.aClass115_3.method8203(arg0 ? this.aClass116_2 : this.aClass116_4);
		this.aClass115_3.method8285();
		this.method10040(arg0, false);
		this.aClass104_Sub2_15.method21003();
	}

	@OriginalMember(owner = "client!ahr", name = "u", descriptor = "(Z)V", line = 59)
	@Override
	public void method10038(@OriginalArg(0) boolean arg0) {
		this.aClass115_3.method8203(arg0 ? this.aClass116_2 : this.aClass116_4);
		this.aClass115_3.method8285();
		this.method10040(arg0, false);
		this.aClass104_Sub2_15.method21003();
	}

	@OriginalMember(owner = "client!ahr", name = "z", descriptor = "(Z)V", line = 59)
	@Override
	public void method10031(@OriginalArg(0) boolean arg0) {
		this.aClass115_3.method8203(arg0 ? this.aClass116_2 : this.aClass116_4);
		this.aClass115_3.method8285();
		this.method10040(arg0, false);
		this.aClass104_Sub2_15.method21003();
	}

	@OriginalMember(owner = "client!ahr", name = "d", descriptor = "(ZZB)V", line = 66)
	void method10040(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8293(this.aClass93_Sub33_Sub1_24, 0, this.anInterface38_13);
		this.aClass115_3.method8207(this.aClass93_Sub33_Sub1_20, this.aClass489_38);
		this.aClass115_3.method8242(this.aClass93_Sub33_Sub1_19, this.aClass489_37);
		this.aClass115_3.method8214(this.aClass93_Sub33_Sub1_23, this.anInt1118);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass115_3.method8210(this.aClass93_Sub33_Sub1_21, this.aClass460_7.aFloat293, this.aClass460_7.aFloat292, this.aClass460_7.aFloat291, this.aClass460_7.aFloat294);
		} else {
			this.aClass115_3.method8309(this.aClass93_Sub33_Sub1_18, Math.min(Math.max(this.aFloat121, 0.0F), 1.0F));
		}
		this.aClass115_3.method8259(this.aClass93_Sub33_Sub1_22, this.aClass472_37.aFloat317, this.aClass472_37.aFloat318, this.aClass472_37.aFloat319);
	}

	@OriginalMember(owner = "client!ahr", name = "y", descriptor = "(ZZ)V", line = 66)
	void method10045(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8293(this.aClass93_Sub33_Sub1_24, 0, this.anInterface38_13);
		this.aClass115_3.method8207(this.aClass93_Sub33_Sub1_20, this.aClass489_38);
		this.aClass115_3.method8242(this.aClass93_Sub33_Sub1_19, this.aClass489_37);
		this.aClass115_3.method8214(this.aClass93_Sub33_Sub1_23, this.anInt1118);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass115_3.method8210(this.aClass93_Sub33_Sub1_21, this.aClass460_7.aFloat293, this.aClass460_7.aFloat292, this.aClass460_7.aFloat291, this.aClass460_7.aFloat294);
		} else {
			this.aClass115_3.method8309(this.aClass93_Sub33_Sub1_18, Math.min(Math.max(this.aFloat121, 0.0F), 1.0F));
		}
		this.aClass115_3.method8259(this.aClass93_Sub33_Sub1_22, this.aClass472_37.aFloat317, this.aClass472_37.aFloat318, this.aClass472_37.aFloat319);
	}

	@OriginalMember(owner = "client!ahr", name = "o", descriptor = "(ZZ)V", line = 66)
	void method10046(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8293(this.aClass93_Sub33_Sub1_24, 0, this.anInterface38_13);
		this.aClass115_3.method8207(this.aClass93_Sub33_Sub1_20, this.aClass489_38);
		this.aClass115_3.method8242(this.aClass93_Sub33_Sub1_19, this.aClass489_37);
		this.aClass115_3.method8214(this.aClass93_Sub33_Sub1_23, this.anInt1118);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass115_3.method8210(this.aClass93_Sub33_Sub1_21, this.aClass460_7.aFloat293, this.aClass460_7.aFloat292, this.aClass460_7.aFloat291, this.aClass460_7.aFloat294);
		} else {
			this.aClass115_3.method8309(this.aClass93_Sub33_Sub1_18, Math.min(Math.max(this.aFloat121, 0.0F), 1.0F));
		}
		this.aClass115_3.method8259(this.aClass93_Sub33_Sub1_22, this.aClass472_37.aFloat317, this.aClass472_37.aFloat318, this.aClass472_37.aFloat319);
	}

	@OriginalMember(owner = "client!ahr", name = "s", descriptor = "(ZZ)V", line = 66)
	void method10047(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8293(this.aClass93_Sub33_Sub1_24, 0, this.anInterface38_13);
		this.aClass115_3.method8207(this.aClass93_Sub33_Sub1_20, this.aClass489_38);
		this.aClass115_3.method8242(this.aClass93_Sub33_Sub1_19, this.aClass489_37);
		this.aClass115_3.method8214(this.aClass93_Sub33_Sub1_23, this.anInt1118);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass115_3.method8210(this.aClass93_Sub33_Sub1_21, this.aClass460_7.aFloat293, this.aClass460_7.aFloat292, this.aClass460_7.aFloat291, this.aClass460_7.aFloat294);
		} else {
			this.aClass115_3.method8309(this.aClass93_Sub33_Sub1_18, Math.min(Math.max(this.aFloat121, 0.0F), 1.0F));
		}
		this.aClass115_3.method8259(this.aClass93_Sub33_Sub1_22, this.aClass472_37.aFloat317, this.aClass472_37.aFloat318, this.aClass472_37.aFloat319);
	}

	@OriginalMember(owner = "client!ahr", name = "q", descriptor = "(ZZ)V", line = 66)
	void method10048(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aClass115_3.method8293(this.aClass93_Sub33_Sub1_24, 0, this.anInterface38_13);
		this.aClass115_3.method8207(this.aClass93_Sub33_Sub1_20, this.aClass489_38);
		this.aClass115_3.method8242(this.aClass93_Sub33_Sub1_19, this.aClass489_37);
		this.aClass115_3.method8214(this.aClass93_Sub33_Sub1_23, this.anInt1118);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.aClass115_3.method8210(this.aClass93_Sub33_Sub1_21, this.aClass460_7.aFloat293, this.aClass460_7.aFloat292, this.aClass460_7.aFloat291, this.aClass460_7.aFloat294);
		} else {
			this.aClass115_3.method8309(this.aClass93_Sub33_Sub1_18, Math.min(Math.max(this.aFloat121, 0.0F), 1.0F));
		}
		this.aClass115_3.method8259(this.aClass93_Sub33_Sub1_22, this.aClass472_37.aFloat317, this.aClass472_37.aFloat318, this.aClass472_37.aFloat319);
	}

	@OriginalMember(owner = "client!ahr", name = "w", descriptor = "(Lclient!dn;[F[FI)V", line = 259)
	static void method10050(@OriginalArg(0) Class230 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2) {
		if (arg0 == null) {
			return;
		}
		arg0.aFloat275 = arg1[0];
		@Pc(16) float local16 = arg1[3] - arg1[0];
		@Pc(24) float local24 = arg2[3] - arg2[0];
		@Pc(32) float local32 = arg1[1] - arg1[0];
		@Pc(34) float local34 = 0.0F;
		@Pc(36) float local36 = 0.0F;
		if ((double) local32 != 0.0D) {
			local34 = (arg2[1] - arg2[0]) / local32;
		}
		local32 = arg1[3] - arg1[2];
		if ((double) local32 != 0.0D) {
			local36 = (arg2[3] - arg2[2]) / local32;
		}
		@Pc(80) float local80 = 1.0F / (local16 * local16);
		@Pc(84) float local84 = local34 * local16;
		@Pc(88) float local88 = local16 * local36;
		arg0.aFloatArray99[0] = local80 * (local88 + local84 - local24 - local24) / local16;
		arg0.aFloatArray99[1] = local80 * (local24 + local24 + local24 - local84 - local84 - local88);
		arg0.aFloatArray99[2] = local34;
		arg0.aFloatArray99[3] = arg2[0];
	}

	@OriginalMember(owner = "client!ahr", name = "l", descriptor = "(II)V", line = 322)
	static void method10051(@OriginalArg(0) int arg0) {
		if (-1 != arg0 && !Class9.aBooleanArray1[arg0]) {
			Class589.aClass497_132.method30064(arg0);
			Class166_Sub1.aClass320Array1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ahr", name = "lm", descriptor = "(Ljava/lang/String;I)V", line = 12039)
	public static final void method10049(@OriginalArg(0) String arg0) {
		if (Class93_Sub1_Sub2.aClass170Array1 == null) {
			return;
		}
		@Pc(5) Class175 local5 = Class330.method27372();
		@Pc(11) Class93_Sub22 local11 = Class102.method2592(Class446.aClass446_34, local5.aClass24_2);
		local11.aClass93_Sub41_Sub2_1.method22510(Class46.method894(arg0));
		local11.aClass93_Sub41_Sub2_1.method22402(arg0);
		local5.method24351(local11);
	}
}
