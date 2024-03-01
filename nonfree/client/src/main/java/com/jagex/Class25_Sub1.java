package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aci")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!aci", name = "z", descriptor = "I")
	static final int anInt622 = 0;

	@OriginalMember(owner = "client!aci", name = "j", descriptor = "I")
	static final int anInt623 = 1;

	@OriginalMember(owner = "client!aci", name = "y", descriptor = "[F")
	static final float[] aFloatArray42 = new float[16];

	@OriginalMember(owner = "client!aci", name = "x", descriptor = "Lclient!akw;")
	Class21_Sub3_Sub2 aClass21_Sub3_Sub2_2;

	@OriginalMember(owner = "client!aci", name = "u", descriptor = "J")
	long aLong15;

	@OriginalMember(owner = "client!aci", name = "l", descriptor = "Lclient!acd;")
	Class24_Sub1 aClass24_Sub1_1;

	@OriginalMember(owner = "client!aci", name = "s", descriptor = "J")
	long aLong16;

	@OriginalMember(owner = "client!aci", name = "h", descriptor = "Z")
	boolean aBoolean144;

	@OriginalMember(owner = "client!aci", name = "n", descriptor = "[[F")
	final float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!aci", name = "e", descriptor = "[Z")
	final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!aci", name = "b", descriptor = "[B")
	byte[] aByteArray12;

	@OriginalMember(owner = "client!aci", name = "c", descriptor = "[B")
	byte[] aByteArray13;

	@OriginalMember(owner = "client!aci", name = "<init>", descriptor = "(Lclient!akw;Lclient!acd;Lclient!ff;)V", line = 28)
	Class25_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class24_Sub1 arg1, @OriginalArg(2) Class170 arg2) {
		this(arg0, arg2);
		this.aClass21_Sub3_Sub2_2 = arg0;
		this.aClass24_Sub1_1 = arg1;
	}

	@OriginalMember(owner = "client!aci", name = "<init>", descriptor = "(Lclient!akw;Lclient!ff;)V", line = 33)
	Class25_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class170 arg1) {
		this.aBoolean144 = false;
		this.aFloatArrayArray12 = new float[2][];
		this.aBooleanArray8 = new boolean[2];
		this.aString34 = arg1.aString165;
		if (arg1.aString163 != null) {
			this.aString33 = arg1.aString163;
			this.aByteArray12 = arg0.method17832(this.aString33);
		}
		if (arg1.aString164 != null) {
			this.aString32 = arg1.aString164;
			this.aByteArray13 = arg0.method17832(this.aString32);
		}
		arg0.method17583(this);
	}

	@OriginalMember(owner = "client!aci", name = "a", descriptor = "()Z", line = 47)
	@Override
	public boolean method6418() {
		if (this.aBoolean144) {
			return true;
		}
		this.aLong16 = this.aByteArray12 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass21_Sub3_Sub2_2.aLong104, this.aByteArray12);
		this.aLong15 = this.aByteArray13 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass21_Sub3_Sub2_2.aLong104, this.aByteArray13);
		if (this.aLong16 == 0L && this.aLong15 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass24_Sub1_1.method6556(); local46++) {
			if (this.aClass24_Sub1_1.method6549(local46) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass24_Sub1_1.method6587();
		@Pc(74) int local74 = this.aClass24_Sub1_1.method6625();
		@Pc(76) int local76;
		@Pc(85) Class3_Sub19_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass24_Sub1_1.method6571(local76);
			local85.method20811(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass24_Sub1_1.method6663(local76);
			local85.method20811(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass24_Sub1_1.method6592(this);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class3_Sub19_Sub1_Sub1 local143 = (Class3_Sub19_Sub1_Sub1) (local120 < local46 ? this.aClass24_Sub1_1.method6571(local120) : this.aClass24_Sub1_1.method6663(local120 - local46));
			@Pc(147) Class166 local147 = local143.method20826();
			@Pc(149) int local149 = 1;
			if (local147 == Class166.aClass166_93) {
				local147 = local143.method20813();
				local149 = local143.method20822();
			}
			switch(local147.anInt3451 * -1183068599) {
				case 10:
				case 14:
				case 17:
				case 36:
				case 69:
					break;
				case 11:
				case 65:
				case 78:
				case 94:
					local149 *= 4;
					break;
				case 21:
				case 22:
				case 34:
				case 61:
					local149 *= 3;
					break;
				case 46:
				case 51:
				case 58:
				case 108:
					local149 *= 2;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray272[local118] >= 0) {
				local195 = local143.anIntArray272[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray273[local118] >= 0) {
				local195 = local143.anIntArray273[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray12[0] = new float[local76 * 4];
		this.aFloatArrayArray12[1] = new float[local112 * 4];
		this.aBoolean144 = true;
		return true;
	}

	@OriginalMember(owner = "client!aci", name = "w", descriptor = "()Z", line = 47)
	@Override
	public boolean method6452() {
		if (this.aBoolean144) {
			return true;
		}
		this.aLong16 = this.aByteArray12 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass21_Sub3_Sub2_2.aLong104, this.aByteArray12);
		this.aLong15 = this.aByteArray13 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass21_Sub3_Sub2_2.aLong104, this.aByteArray13);
		if (this.aLong16 == 0L && this.aLong15 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass24_Sub1_1.method6556(); local46++) {
			if (this.aClass24_Sub1_1.method6549(local46) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass24_Sub1_1.method6587();
		@Pc(74) int local74 = this.aClass24_Sub1_1.method6625();
		@Pc(76) int local76;
		@Pc(85) Class3_Sub19_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass24_Sub1_1.method6571(local76);
			local85.method20811(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass24_Sub1_1.method6663(local76);
			local85.method20811(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass24_Sub1_1.method6592(this);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class3_Sub19_Sub1_Sub1 local143 = (Class3_Sub19_Sub1_Sub1) (local120 < local46 ? this.aClass24_Sub1_1.method6571(local120) : this.aClass24_Sub1_1.method6663(local120 - local46));
			@Pc(147) Class166 local147 = local143.method20826();
			@Pc(149) int local149 = 1;
			if (local147 == Class166.aClass166_93) {
				local147 = local143.method20813();
				local149 = local143.method20822();
			}
			switch(local147.anInt3451 * -1183068599) {
				case 10:
				case 14:
				case 17:
				case 36:
				case 69:
					break;
				case 11:
				case 65:
				case 78:
				case 94:
					local149 *= 4;
					break;
				case 21:
				case 22:
				case 34:
				case 61:
					local149 *= 3;
					break;
				case 46:
				case 51:
				case 58:
				case 108:
					local149 *= 2;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray272[local118] >= 0) {
				local195 = local143.anIntArray272[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray273[local118] >= 0) {
				local195 = local143.anIntArray273[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray12[0] = new float[local76 * 4];
		this.aFloatArrayArray12[1] = new float[local112 * 4];
		this.aBoolean144 = true;
		return true;
	}

	@OriginalMember(owner = "client!aci", name = "o", descriptor = "()Z", line = 47)
	@Override
	public boolean method6436() {
		if (this.aBoolean144) {
			return true;
		}
		this.aLong16 = this.aByteArray12 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass21_Sub3_Sub2_2.aLong104, this.aByteArray12);
		this.aLong15 = this.aByteArray13 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass21_Sub3_Sub2_2.aLong104, this.aByteArray13);
		if (this.aLong16 == 0L && this.aLong15 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass24_Sub1_1.method6556(); local46++) {
			if (this.aClass24_Sub1_1.method6549(local46) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass24_Sub1_1.method6587();
		@Pc(74) int local74 = this.aClass24_Sub1_1.method6625();
		@Pc(76) int local76;
		@Pc(85) Class3_Sub19_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass24_Sub1_1.method6571(local76);
			local85.method20811(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass24_Sub1_1.method6663(local76);
			local85.method20811(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass24_Sub1_1.method6592(this);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class3_Sub19_Sub1_Sub1 local143 = (Class3_Sub19_Sub1_Sub1) (local120 < local46 ? this.aClass24_Sub1_1.method6571(local120) : this.aClass24_Sub1_1.method6663(local120 - local46));
			@Pc(147) Class166 local147 = local143.method20826();
			@Pc(149) int local149 = 1;
			if (local147 == Class166.aClass166_93) {
				local147 = local143.method20813();
				local149 = local143.method20822();
			}
			switch(local147.anInt3451 * -1183068599) {
				case 10:
				case 14:
				case 17:
				case 36:
				case 69:
					break;
				case 11:
				case 65:
				case 78:
				case 94:
					local149 *= 4;
					break;
				case 21:
				case 22:
				case 34:
				case 61:
					local149 *= 3;
					break;
				case 46:
				case 51:
				case 58:
				case 108:
					local149 *= 2;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray272[local118] >= 0) {
				local195 = local143.anIntArray272[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray273[local118] >= 0) {
				local195 = local143.anIntArray273[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray12[0] = new float[local76 * 4];
		this.aFloatArrayArray12[1] = new float[local112 * 4];
		this.aBoolean144 = true;
		return true;
	}

	@OriginalMember(owner = "client!aci", name = "i", descriptor = "()Z", line = 47)
	@Override
	public boolean method6437() {
		if (this.aBoolean144) {
			return true;
		}
		this.aLong16 = this.aByteArray12 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass21_Sub3_Sub2_2.aLong104, this.aByteArray12);
		this.aLong15 = this.aByteArray13 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass21_Sub3_Sub2_2.aLong104, this.aByteArray13);
		if (this.aLong16 == 0L && this.aLong15 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass24_Sub1_1.method6556(); local46++) {
			if (this.aClass24_Sub1_1.method6549(local46) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass24_Sub1_1.method6587();
		@Pc(74) int local74 = this.aClass24_Sub1_1.method6625();
		@Pc(76) int local76;
		@Pc(85) Class3_Sub19_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass24_Sub1_1.method6571(local76);
			local85.method20811(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass24_Sub1_1.method6663(local76);
			local85.method20811(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass24_Sub1_1.method6592(this);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class3_Sub19_Sub1_Sub1 local143 = (Class3_Sub19_Sub1_Sub1) (local120 < local46 ? this.aClass24_Sub1_1.method6571(local120) : this.aClass24_Sub1_1.method6663(local120 - local46));
			@Pc(147) Class166 local147 = local143.method20826();
			@Pc(149) int local149 = 1;
			if (local147 == Class166.aClass166_93) {
				local147 = local143.method20813();
				local149 = local143.method20822();
			}
			switch(local147.anInt3451 * -1183068599) {
				case 10:
				case 14:
				case 17:
				case 36:
				case 69:
					break;
				case 11:
				case 65:
				case 78:
				case 94:
					local149 *= 4;
					break;
				case 21:
				case 22:
				case 34:
				case 61:
					local149 *= 3;
					break;
				case 46:
				case 51:
				case 58:
				case 108:
					local149 *= 2;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray272[local118] >= 0) {
				local195 = local143.anIntArray272[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray273[local118] >= 0) {
				local195 = local143.anIntArray273[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray12[0] = new float[local76 * 4];
		this.aFloatArrayArray12[1] = new float[local112 * 4];
		this.aBoolean144 = true;
		return true;
	}

	@OriginalMember(owner = "client!aci", name = "f", descriptor = "()Z", line = 47)
	@Override
	public boolean method6438() {
		if (this.aBoolean144) {
			return true;
		}
		this.aLong16 = this.aByteArray12 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass21_Sub3_Sub2_2.aLong104, this.aByteArray12);
		this.aLong15 = this.aByteArray13 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass21_Sub3_Sub2_2.aLong104, this.aByteArray13);
		if (this.aLong16 == 0L && this.aLong15 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass24_Sub1_1.method6556(); local46++) {
			if (this.aClass24_Sub1_1.method6549(local46) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass24_Sub1_1.method6587();
		@Pc(74) int local74 = this.aClass24_Sub1_1.method6625();
		@Pc(76) int local76;
		@Pc(85) Class3_Sub19_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass24_Sub1_1.method6571(local76);
			local85.method20811(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass24_Sub1_1.method6663(local76);
			local85.method20811(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass24_Sub1_1.method6592(this);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class3_Sub19_Sub1_Sub1 local143 = (Class3_Sub19_Sub1_Sub1) (local120 < local46 ? this.aClass24_Sub1_1.method6571(local120) : this.aClass24_Sub1_1.method6663(local120 - local46));
			@Pc(147) Class166 local147 = local143.method20826();
			@Pc(149) int local149 = 1;
			if (local147 == Class166.aClass166_93) {
				local147 = local143.method20813();
				local149 = local143.method20822();
			}
			switch(local147.anInt3451 * -1183068599) {
				case 10:
				case 14:
				case 17:
				case 36:
				case 69:
					break;
				case 11:
				case 65:
				case 78:
				case 94:
					local149 *= 4;
					break;
				case 21:
				case 22:
				case 34:
				case 61:
					local149 *= 3;
					break;
				case 46:
				case 51:
				case 58:
				case 108:
					local149 *= 2;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray272[local118] >= 0) {
				local195 = local143.anIntArray272[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray273[local118] >= 0) {
				local195 = local143.anIntArray273[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray12[0] = new float[local76 * 4];
		this.aFloatArrayArray12[1] = new float[local112 * 4];
		this.aBoolean144 = true;
		return true;
	}

	@OriginalMember(owner = "client!aci", name = "l", descriptor = "(Lclient!alr;F)V", line = 124)
	@Override
	void method6419(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_30 && arg0.method20826() != Class166.aClass166_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!aci", name = "at", descriptor = "(Lclient!alr;F)V", line = 124)
	@Override
	void method6460(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_30 && arg0.method20826() != Class166.aClass166_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!aci", name = "af", descriptor = "(Lclient!alr;F)V", line = 124)
	@Override
	void method6441(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_30 && arg0.method20826() != Class166.aClass166_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!aci", name = "k", descriptor = "(Lclient!alr;F)V", line = 124)
	@Override
	void method6439(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_30 && arg0.method20826() != Class166.aClass166_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!aci", name = "ak", descriptor = "(Lclient!alr;FF)V", line = 140)
	@Override
	void method6472(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aFloatArrayArray12[1][local7 + 1] = arg2;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!aci", name = "aa", descriptor = "(Lclient!alr;FF)V", line = 140)
	@Override
	void method6443(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aFloatArrayArray12[1][local7 + 1] = arg2;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!aci", name = "h", descriptor = "(Lclient!alr;FF)V", line = 140)
	@Override
	void method6420(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aFloatArrayArray12[1][local7 + 1] = arg2;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!aci", name = "ah", descriptor = "(Lclient!alr;FFF)V", line = 158)
	@Override
	void method6446(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_28) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "x", descriptor = "(Lclient!alr;FFF)V", line = 158)
	@Override
	void method6421(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_28) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "s", descriptor = "(Lclient!alr;FFFF)V", line = 178)
	@Override
	void method6422(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aFloatArrayArray12[0][local3 + 3] = arg4;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aFloatArrayArray12[1][local7 + 3] = arg4;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bw", descriptor = "(Lclient!alr;FFFF)V", line = 178)
	@Override
	void method6466(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aFloatArrayArray12[0][local3 + 3] = arg4;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aFloatArrayArray12[1][local7 + 3] = arg4;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "ac", descriptor = "(Lclient!alr;FFFF)V", line = 178)
	@Override
	void method6416(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aFloatArrayArray12[0][local3 + 3] = arg4;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aFloatArrayArray12[1][local7 + 3] = arg4;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "ae", descriptor = "(Lclient!alr;FFFF)V", line = 178)
	@Override
	void method6462(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aFloatArrayArray12[0][local3 + 3] = arg4;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aFloatArrayArray12[1][local7 + 3] = arg4;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "ad", descriptor = "(Lclient!alr;FFFF)V", line = 178)
	@Override
	void method6463(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aFloatArrayArray12[0][local3 + 3] = arg4;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aFloatArrayArray12[1][local7 + 3] = arg4;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "aw", descriptor = "(Lclient!alr;FFFF)V", line = 178)
	@Override
	void method6464(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aFloatArrayArray12[0][local3 + 3] = arg4;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aFloatArrayArray12[1][local7 + 3] = arg4;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bp", descriptor = "(Lclient!alr;FFFF)V", line = 178)
	@Override
	void method6423(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aFloatArrayArray12[0][local3 + 3] = arg4;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aFloatArrayArray12[1][local7 + 3] = arg4;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "c", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 200)
	@Override
	void method6465(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_48) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method6403(local3, arg1.method26071(aFloatArray42), 8);
		}
		if (local7 >= 0) {
			this.method6402(local7, arg1.method26071(aFloatArray42), 8);
		}
	}

	@OriginalMember(owner = "client!aci", name = "aj", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 200)
	@Override
	void method6440(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_48) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method6403(local3, arg1.method26071(aFloatArray42), 8);
		}
		if (local7 >= 0) {
			this.method6402(local7, arg1.method26071(aFloatArray42), 8);
		}
	}

	@OriginalMember(owner = "client!aci", name = "ai", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 208)
	@Override
	void method6448(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_96) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method6403(local3, arg1.method26072(aFloatArray42), 16);
		}
		if (local7 >= 0) {
			this.method6402(local7, arg1.method26072(aFloatArray42), 16);
		}
	}

	@OriginalMember(owner = "client!aci", name = "z", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 208)
	@Override
	void method6429(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_96) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method6403(local3, arg1.method26072(aFloatArray42), 16);
		}
		if (local7 >= 0) {
			this.method6402(local7, arg1.method26072(aFloatArray42), 16);
		}
	}

	@OriginalMember(owner = "client!aci", name = "as", descriptor = "(Lclient!alr;Lclient!mq;)V", line = 208)
	@Override
	void method6447(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_96) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method6403(local3, arg1.method26072(aFloatArray42), 16);
		}
		if (local7 >= 0) {
			this.method6402(local7, arg1.method26072(aFloatArray42), 16);
		}
	}

	@OriginalMember(owner = "client!aci", name = "u", descriptor = "(Lclient!alr;[FI)V", line = 216)
	@Override
	void method6450(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_93) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method6403(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method6402(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aci", name = "an", descriptor = "(Lclient!alr;[FI)V", line = 216)
	@Override
	void method6470(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class3_Sub19_Sub1_Sub1) arg0).method20796();
		@Pc(7) int local7 = ((Class3_Sub19_Sub1_Sub1) arg0).method20795();
		if (arg0.method20826() != Class166.aClass166_93) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method6403(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method6402(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aci", name = "aq", descriptor = "(Lclient!alr;ILclient!jl;)V", line = 224)
	@Override
	void method6435(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass21_Sub3_Sub2_2.method17512(arg1);
		this.aClass21_Sub3_Sub2_2.method17513(arg2);
	}

	@OriginalMember(owner = "client!aci", name = "j", descriptor = "(Lclient!alr;ILclient!jl;)V", line = 224)
	@Override
	void method6426(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass21_Sub3_Sub2_2.method17512(arg1);
		this.aClass21_Sub3_Sub2_2.method17513(arg2);
	}

	@OriginalMember(owner = "client!aci", name = "n", descriptor = "(IFFF)V", line = 229)
	@Override
	void method6427(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "av", descriptor = "(IFFF)V", line = 229)
	@Override
	void method6442(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "ax", descriptor = "(IFFF)V", line = 229)
	@Override
	void method6425(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bt", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method6456(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bd", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method6468(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bm", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method6451(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bs", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method6469(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bf", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method6444(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "e", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method6428(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "az", descriptor = "(ILclient!mq;)V", line = 248)
	@Override
	void method6471(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26072(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "d", descriptor = "(ILclient!mq;)V", line = 248)
	@Override
	void method6430(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26072(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "al", descriptor = "(ILclient!mq;)V", line = 248)
	@Override
	void method6453(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26072(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "ao", descriptor = "(ILclient!mq;)V", line = 248)
	@Override
	void method6454(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26072(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "ap", descriptor = "(ILclient!mq;)V", line = 248)
	@Override
	void method6455(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26072(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "ab", descriptor = "(ILclient!mq;)V", line = 248)
	@Override
	void method6432(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26072(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "ay", descriptor = "(ILclient!mq;)V", line = 255)
	@Override
	void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26071(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 8);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "q", descriptor = "(ILclient!mq;)V", line = 255)
	@Override
	void method6431(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26071(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 8);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "au", descriptor = "(ILclient!mq;)V", line = 255)
	@Override
	void method6445(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26071(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 8);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "m", descriptor = "(ILclient!mq;)V", line = 262)
	@Override
	void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26072(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 16);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "ag", descriptor = "(ILclient!mq;)V", line = 262)
	@Override
	void method6459(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26072(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 16);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "am", descriptor = "(ILclient!mq;)V", line = 262)
	@Override
	void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method26072(aFloatArray42), 0, this.aFloatArrayArray12[local3], local9, 16);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "r", descriptor = "(I[FI)V", line = 269)
	@Override
	void method6461(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray12[local3], local9, arg2);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bk", descriptor = "(I[FI)V", line = 269)
	@Override
	void method6424(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray12[local3], local9, arg2);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bg", descriptor = "(I[FI)V", line = 269)
	@Override
	void method6473(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray12[local3], local9, arg2);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!aci", name = "br", descriptor = "(I[FI)V", line = 276)
	final void method6403(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class567.method32928(arg1, 0, this.aFloatArrayArray12[0], arg0 * 4, arg2);
		this.aBooleanArray8[0] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bi", descriptor = "(I[FI)V", line = 276)
	final void method6407(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class567.method32928(arg1, 0, this.aFloatArrayArray12[0], arg0 * 4, arg2);
		this.aBooleanArray8[0] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bo", descriptor = "(I[FI)V", line = 281)
	final void method6401(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class567.method32928(arg1, 0, this.aFloatArrayArray12[1], arg0 * 4, arg2);
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bb", descriptor = "(I[FI)V", line = 281)
	final void method6402(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class567.method32928(arg1, 0, this.aFloatArrayArray12[1], arg0 * 4, arg2);
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "bu", descriptor = "(I[FI)V", line = 281)
	final void method6408(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class567.method32928(arg1, 0, this.aFloatArrayArray12[1], arg0 * 4, arg2);
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "ba", descriptor = "(I[FI)V", line = 281)
	final void method6409(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class567.method32928(arg1, 0, this.aFloatArrayArray12[1], arg0 * 4, arg2);
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!aci", name = "v", descriptor = "(IILclient!jl;)V", line = 286)
	@Override
	void method6433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass21_Sub3_Sub2_2.method17512(arg1);
		this.aClass21_Sub3_Sub2_2.method17513(arg2);
	}

	@OriginalMember(owner = "client!aci", name = "ar", descriptor = "(IILclient!jl;)V", line = 286)
	@Override
	void method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2) {
		this.aClass21_Sub3_Sub2_2.method17512(arg1);
		this.aClass21_Sub3_Sub2_2.method17513(arg2);
	}

	@OriginalMember(owner = "client!aci", name = "by", descriptor = "()V", line = 291)
	void method6406() {
		@Pc(6) int local6;
		if (this.aBooleanArray8[0]) {
			for (local6 = 0; local6 < this.aFloatArrayArray12[0].length; local6++) {
				this.aClass21_Sub3_Sub2_2.anUnsafe3.putFloat(this.aClass21_Sub3_Sub2_2.aLong101 + (long) (local6 * 4), this.aFloatArrayArray12[0][local6]);
			}
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass21_Sub3_Sub2_2.aLong104, 0, this.aClass21_Sub3_Sub2_2.aLong101, this.aFloatArrayArray12[0].length / 4);
			this.aBooleanArray8[0] = false;
		}
		if (!this.aBooleanArray8[1]) {
			return;
		}
		for (local6 = 0; local6 < this.aFloatArrayArray12[1].length; local6++) {
			this.aClass21_Sub3_Sub2_2.anUnsafe3.putFloat(this.aClass21_Sub3_Sub2_2.aLong101 + (long) (local6 * 4), this.aFloatArrayArray12[1][local6]);
		}
		IDirect3DDevice.SetPixelShaderConstantF(this.aClass21_Sub3_Sub2_2.aLong104, 0, this.aClass21_Sub3_Sub2_2.aLong101, this.aFloatArrayArray12[1].length / 4);
		this.aBooleanArray8[1] = false;
	}

	@OriginalMember(owner = "client!aci", name = "bc", descriptor = "()V", line = 291)
	void method6410() {
		@Pc(6) int local6;
		if (this.aBooleanArray8[0]) {
			for (local6 = 0; local6 < this.aFloatArrayArray12[0].length; local6++) {
				this.aClass21_Sub3_Sub2_2.anUnsafe3.putFloat(this.aClass21_Sub3_Sub2_2.aLong101 + (long) (local6 * 4), this.aFloatArrayArray12[0][local6]);
			}
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass21_Sub3_Sub2_2.aLong104, 0, this.aClass21_Sub3_Sub2_2.aLong101, this.aFloatArrayArray12[0].length / 4);
			this.aBooleanArray8[0] = false;
		}
		if (!this.aBooleanArray8[1]) {
			return;
		}
		for (local6 = 0; local6 < this.aFloatArrayArray12[1].length; local6++) {
			this.aClass21_Sub3_Sub2_2.anUnsafe3.putFloat(this.aClass21_Sub3_Sub2_2.aLong101 + (long) (local6 * 4), this.aFloatArrayArray12[1][local6]);
		}
		IDirect3DDevice.SetPixelShaderConstantF(this.aClass21_Sub3_Sub2_2.aLong104, 0, this.aClass21_Sub3_Sub2_2.aLong101, this.aFloatArrayArray12[1].length / 4);
		this.aBooleanArray8[1] = false;
	}

	@OriginalMember(owner = "client!aci", name = "bn", descriptor = "()V", line = 291)
	void method6411() {
		@Pc(6) int local6;
		if (this.aBooleanArray8[0]) {
			for (local6 = 0; local6 < this.aFloatArrayArray12[0].length; local6++) {
				this.aClass21_Sub3_Sub2_2.anUnsafe3.putFloat(this.aClass21_Sub3_Sub2_2.aLong101 + (long) (local6 * 4), this.aFloatArrayArray12[0][local6]);
			}
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass21_Sub3_Sub2_2.aLong104, 0, this.aClass21_Sub3_Sub2_2.aLong101, this.aFloatArrayArray12[0].length / 4);
			this.aBooleanArray8[0] = false;
		}
		if (!this.aBooleanArray8[1]) {
			return;
		}
		for (local6 = 0; local6 < this.aFloatArrayArray12[1].length; local6++) {
			this.aClass21_Sub3_Sub2_2.anUnsafe3.putFloat(this.aClass21_Sub3_Sub2_2.aLong101 + (long) (local6 * 4), this.aFloatArrayArray12[1][local6]);
		}
		IDirect3DDevice.SetPixelShaderConstantF(this.aClass21_Sub3_Sub2_2.aLong104, 0, this.aClass21_Sub3_Sub2_2.aLong101, this.aFloatArrayArray12[1].length / 4);
		this.aBooleanArray8[1] = false;
	}

	@OriginalMember(owner = "client!aci", name = "be", descriptor = "()V", line = 291)
	void method6412() {
		@Pc(6) int local6;
		if (this.aBooleanArray8[0]) {
			for (local6 = 0; local6 < this.aFloatArrayArray12[0].length; local6++) {
				this.aClass21_Sub3_Sub2_2.anUnsafe3.putFloat(this.aClass21_Sub3_Sub2_2.aLong101 + (long) (local6 * 4), this.aFloatArrayArray12[0][local6]);
			}
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass21_Sub3_Sub2_2.aLong104, 0, this.aClass21_Sub3_Sub2_2.aLong101, this.aFloatArrayArray12[0].length / 4);
			this.aBooleanArray8[0] = false;
		}
		if (!this.aBooleanArray8[1]) {
			return;
		}
		for (local6 = 0; local6 < this.aFloatArrayArray12[1].length; local6++) {
			this.aClass21_Sub3_Sub2_2.anUnsafe3.putFloat(this.aClass21_Sub3_Sub2_2.aLong101 + (long) (local6 * 4), this.aFloatArrayArray12[1][local6]);
		}
		IDirect3DDevice.SetPixelShaderConstantF(this.aClass21_Sub3_Sub2_2.aLong104, 0, this.aClass21_Sub3_Sub2_2.aLong101, this.aFloatArrayArray12[1].length / 4);
		this.aBooleanArray8[1] = false;
	}

	@OriginalMember(owner = "client!aci", name = "g", descriptor = "()V", line = 304)
	@Override
	public void method27209() {
		if (this.aLong16 != 0L) {
			IUnknown.Release(this.aLong16);
			this.aLong16 = 0L;
		}
		if (this.aLong15 != 0L) {
			IUnknown.Release(this.aLong15);
			this.aLong15 = 0L;
		}
		this.aClass21_Sub3_Sub2_2.method17430(this);
	}

	@OriginalMember(owner = "client!aci", name = "y", descriptor = "()V", line = 304)
	@Override
	public void method27208() {
		if (this.aLong16 != 0L) {
			IUnknown.Release(this.aLong16);
			this.aLong16 = 0L;
		}
		if (this.aLong15 != 0L) {
			IUnknown.Release(this.aLong15);
			this.aLong15 = 0L;
		}
		this.aClass21_Sub3_Sub2_2.method17430(this);
	}

	@OriginalMember(owner = "client!aci", name = "b", descriptor = "()V", line = 304)
	@Override
	public void method27210() {
		if (this.aLong16 != 0L) {
			IUnknown.Release(this.aLong16);
			this.aLong16 = 0L;
		}
		if (this.aLong15 != 0L) {
			IUnknown.Release(this.aLong15);
			this.aLong15 = 0L;
		}
		this.aClass21_Sub3_Sub2_2.method17430(this);
	}

	@OriginalMember(owner = "client!aci", name = "bl", descriptor = "()V", line = 316)
	void method6404() {
		if (this.aLong16 != 0L) {
			this.aClass21_Sub3_Sub2_2.method17837(this.aLong16);
			this.aLong16 = 0L;
		}
		if (this.aLong15 != 0L) {
			this.aClass21_Sub3_Sub2_2.method17837(this.aLong15);
			this.aLong15 = 0L;
		}
	}

	@OriginalMember(owner = "client!aci", name = "finalize", descriptor = "()V", line = 327)
	@Override
	void finalize() {
		this.method6404();
	}

	@OriginalMember(owner = "client!aci", name = "hh", descriptor = "()V", line = 327)
	void method6405() {
		this.method6404();
	}
}
