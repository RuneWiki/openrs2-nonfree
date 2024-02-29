package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agz")
public final class Class105_Sub2 extends Class105 {

	@OriginalMember(owner = "client!agz", name = "g", descriptor = "I")
	static final int anInt1107 = 1;

	@OriginalMember(owner = "client!agz", name = "r", descriptor = "I")
	static final int anInt1108 = 0;

	@OriginalMember(owner = "client!agz", name = "x", descriptor = "[F")
	static final float[] aFloatArray49 = new float[16];

	@OriginalMember(owner = "client!agz", name = "j", descriptor = "[Z")
	final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!agz", name = "y", descriptor = "Z")
	boolean aBoolean197;

	@OriginalMember(owner = "client!agz", name = "t", descriptor = "J")
	long aLong35;

	@OriginalMember(owner = "client!agz", name = "q", descriptor = "J")
	long aLong36;

	@OriginalMember(owner = "client!agz", name = "d", descriptor = "[B")
	byte[] aByteArray21;

	@OriginalMember(owner = "client!agz", name = "z", descriptor = "[[F")
	final float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!agz", name = "s", descriptor = "[B")
	byte[] aByteArray22;

	@OriginalMember(owner = "client!agz", name = "w", descriptor = "Lclient!apn;")
	Class86_Sub1_Sub1 aClass86_Sub1_Sub1_2;

	@OriginalMember(owner = "client!agz", name = "l", descriptor = "Lclient!agx;")
	Class112_Sub1 aClass112_Sub1_1;

	@OriginalMember(owner = "client!agz", name = "<init>", descriptor = "(Lclient!apn;Lclient!agx;Lclient!hq;)V", line = 28)
	Class105_Sub2(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Class307 arg2) {
		this(arg0, arg2);
		this.aClass86_Sub1_Sub1_2 = arg0;
		this.aClass112_Sub1_1 = arg1;
	}

	@OriginalMember(owner = "client!agz", name = "<init>", descriptor = "(Lclient!apn;Lclient!hq;)V", line = 33)
	Class105_Sub2(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class307 arg1) {
		this.aBoolean197 = false;
		this.aFloatArrayArray12 = new float[2][];
		this.aBooleanArray5 = new boolean[2];
		this.aString41 = arg1.aString195;
		if (arg1.aString197 != null) {
			this.aString40 = arg1.aString197;
			this.aByteArray21 = arg0.method19575(this.aString40);
		}
		if (arg1.aString196 != null) {
			this.aString39 = arg1.aString196;
			this.aByteArray22 = arg0.method19575(this.aString39);
		}
		arg0.method20382(this);
	}

	@OriginalMember(owner = "client!agz", name = "n", descriptor = "()Z", line = 47)
	@Override
	public boolean method9598() {
		if (this.aBoolean197) {
			return true;
		}
		this.aLong35 = this.aByteArray21 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass86_Sub1_Sub1_2.aLong119, this.aByteArray21);
		this.aLong36 = this.aByteArray22 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass86_Sub1_Sub1_2.aLong119, this.aByteArray22);
		if (this.aLong35 == 0L && this.aLong36 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass112_Sub1_1.method9460(); local46++) {
			if (this.aClass112_Sub1_1.method9461(local46) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass112_Sub1_1.method9534();
		@Pc(74) int local74 = this.aClass112_Sub1_1.method9526();
		@Pc(76) int local76;
		@Pc(85) Class77_Sub12_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass112_Sub1_1.method9536(local76);
			local85.method23564(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass112_Sub1_1.method9528(local76);
			local85.method23564(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass112_Sub1_1.method9463(this);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class77_Sub12_Sub1_Sub2 local143 = (Class77_Sub12_Sub1_Sub2) (local120 < local46 ? this.aClass112_Sub1_1.method9536(local120) : this.aClass112_Sub1_1.method9528(local120 - local46));
			@Pc(147) Class295 local147 = local143.method23555();
			@Pc(149) int local149 = 1;
			if (local147 == Class295.aClass295_9) {
				local147 = local143.method23558();
				local149 = local143.method23559();
			}
			switch(local147.anInt4012 * 2142101689) {
				case 0:
				case 17:
				case 33:
				case 76:
					local149 *= 4;
					break;
				case 21:
				case 91:
				case 93:
				case 104:
					local149 *= 3;
				case 35:
				case 52:
				case 60:
				case 74:
				case 92:
					break;
				case 37:
				case 55:
				case 73:
				case 106:
					local149 *= 2;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray295[local118] >= 0) {
				local195 = local143.anIntArray295[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray294[local118] >= 0) {
				local195 = local143.anIntArray294[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray12[0] = new float[local76 * 4];
		this.aFloatArrayArray12[1] = new float[local112 * 4];
		this.aBoolean197 = true;
		return true;
	}

	@OriginalMember(owner = "client!agz", name = "a", descriptor = "()Z", line = 47)
	@Override
	public boolean method9599() {
		if (this.aBoolean197) {
			return true;
		}
		this.aLong35 = this.aByteArray21 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass86_Sub1_Sub1_2.aLong119, this.aByteArray21);
		this.aLong36 = this.aByteArray22 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass86_Sub1_Sub1_2.aLong119, this.aByteArray22);
		if (this.aLong35 == 0L && this.aLong36 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass112_Sub1_1.method9460(); local46++) {
			if (this.aClass112_Sub1_1.method9461(local46) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass112_Sub1_1.method9534();
		@Pc(74) int local74 = this.aClass112_Sub1_1.method9526();
		@Pc(76) int local76;
		@Pc(85) Class77_Sub12_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass112_Sub1_1.method9536(local76);
			local85.method23564(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass112_Sub1_1.method9528(local76);
			local85.method23564(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass112_Sub1_1.method9463(this);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class77_Sub12_Sub1_Sub2 local143 = (Class77_Sub12_Sub1_Sub2) (local120 < local46 ? this.aClass112_Sub1_1.method9536(local120) : this.aClass112_Sub1_1.method9528(local120 - local46));
			@Pc(147) Class295 local147 = local143.method23555();
			@Pc(149) int local149 = 1;
			if (local147 == Class295.aClass295_9) {
				local147 = local143.method23558();
				local149 = local143.method23559();
			}
			switch(local147.anInt4012 * 2142101689) {
				case 0:
				case 17:
				case 33:
				case 76:
					local149 *= 4;
					break;
				case 21:
				case 91:
				case 93:
				case 104:
					local149 *= 3;
				case 35:
				case 52:
				case 60:
				case 74:
				case 92:
					break;
				case 37:
				case 55:
				case 73:
				case 106:
					local149 *= 2;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray295[local118] >= 0) {
				local195 = local143.anIntArray295[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray294[local118] >= 0) {
				local195 = local143.anIntArray294[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray12[0] = new float[local76 * 4];
		this.aFloatArrayArray12[1] = new float[local112 * 4];
		this.aBoolean197 = true;
		return true;
	}

	@OriginalMember(owner = "client!agz", name = "c", descriptor = "()Z", line = 47)
	@Override
	public boolean method9595() {
		if (this.aBoolean197) {
			return true;
		}
		this.aLong35 = this.aByteArray21 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass86_Sub1_Sub1_2.aLong119, this.aByteArray21);
		this.aLong36 = this.aByteArray22 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass86_Sub1_Sub1_2.aLong119, this.aByteArray22);
		if (this.aLong35 == 0L && this.aLong36 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass112_Sub1_1.method9460(); local46++) {
			if (this.aClass112_Sub1_1.method9461(local46) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass112_Sub1_1.method9534();
		@Pc(74) int local74 = this.aClass112_Sub1_1.method9526();
		@Pc(76) int local76;
		@Pc(85) Class77_Sub12_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass112_Sub1_1.method9536(local76);
			local85.method23564(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass112_Sub1_1.method9528(local76);
			local85.method23564(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass112_Sub1_1.method9463(this);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class77_Sub12_Sub1_Sub2 local143 = (Class77_Sub12_Sub1_Sub2) (local120 < local46 ? this.aClass112_Sub1_1.method9536(local120) : this.aClass112_Sub1_1.method9528(local120 - local46));
			@Pc(147) Class295 local147 = local143.method23555();
			@Pc(149) int local149 = 1;
			if (local147 == Class295.aClass295_9) {
				local147 = local143.method23558();
				local149 = local143.method23559();
			}
			switch(local147.anInt4012 * 2142101689) {
				case 0:
				case 17:
				case 33:
				case 76:
					local149 *= 4;
					break;
				case 21:
				case 91:
				case 93:
				case 104:
					local149 *= 3;
				case 35:
				case 52:
				case 60:
				case 74:
				case 92:
					break;
				case 37:
				case 55:
				case 73:
				case 106:
					local149 *= 2;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray295[local118] >= 0) {
				local195 = local143.anIntArray295[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray294[local118] >= 0) {
				local195 = local143.anIntArray294[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray12[0] = new float[local76 * 4];
		this.aFloatArrayArray12[1] = new float[local112 * 4];
		this.aBoolean197 = true;
		return true;
	}

	@OriginalMember(owner = "client!agz", name = "l", descriptor = "(Lclient!aqz;F)V", line = 124)
	@Override
	void method9583(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_129 && arg0.method23555() != Class295.aClass295_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aBooleanArray5[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aBooleanArray5[1] = true;
		}
	}

	@OriginalMember(owner = "client!agz", name = "m", descriptor = "(Lclient!aqz;F)V", line = 124)
	@Override
	void method9634(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_129 && arg0.method23555() != Class295.aClass295_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aBooleanArray5[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aBooleanArray5[1] = true;
		}
	}

	@OriginalMember(owner = "client!agz", name = "h", descriptor = "(Lclient!aqz;F)V", line = 124)
	@Override
	void method9584(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_129 && arg0.method23555() != Class295.aClass295_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aBooleanArray5[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aBooleanArray5[1] = true;
		}
	}

	@OriginalMember(owner = "client!agz", name = "aj", descriptor = "(Lclient!aqz;F)V", line = 124)
	@Override
	void method9602(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_129 && arg0.method23555() != Class295.aClass295_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aBooleanArray5[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aBooleanArray5[1] = true;
		}
	}

	@OriginalMember(owner = "client!agz", name = "y", descriptor = "(Lclient!aqz;FF)V", line = 140)
	@Override
	void method9625(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aBooleanArray5[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aFloatArrayArray12[1][local7 + 1] = arg2;
			this.aBooleanArray5[1] = true;
		}
	}

	@OriginalMember(owner = "client!agz", name = "ai", descriptor = "(Lclient!aqz;FF)V", line = 140)
	@Override
	void method9603(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aBooleanArray5[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aFloatArrayArray12[1][local7 + 1] = arg2;
			this.aBooleanArray5[1] = true;
		}
	}

	@OriginalMember(owner = "client!agz", name = "ag", descriptor = "(Lclient!aqz;FF)V", line = 140)
	@Override
	void method9604(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_32) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aBooleanArray5[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray12[1][local7] = arg1;
			this.aFloatArrayArray12[1][local7 + 1] = arg2;
			this.aBooleanArray5[1] = true;
		}
	}

	@OriginalMember(owner = "client!agz", name = "ab", descriptor = "(Lclient!aqz;FFF)V", line = 158)
	@Override
	void method9623(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aBooleanArray5[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aBooleanArray5[1] = true;
	}

	@OriginalMember(owner = "client!agz", name = "aa", descriptor = "(Lclient!aqz;FFF)V", line = 158)
	@Override
	void method9624(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aBooleanArray5[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aBooleanArray5[1] = true;
	}

	@OriginalMember(owner = "client!agz", name = "w", descriptor = "(Lclient!aqz;FFF)V", line = 158)
	@Override
	void method9585(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_18) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aBooleanArray5[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aBooleanArray5[1] = true;
	}

	@OriginalMember(owner = "client!agz", name = "t", descriptor = "(Lclient!aqz;FFFF)V", line = 178)
	@Override
	void method9586(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aFloatArrayArray12[0][local3 + 3] = arg4;
			this.aBooleanArray5[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aFloatArrayArray12[1][local7 + 3] = arg4;
		this.aBooleanArray5[1] = true;
	}

	@OriginalMember(owner = "client!agz", name = "al", descriptor = "(Lclient!aqz;FFFF)V", line = 178)
	@Override
	void method9605(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray12[0][local3] = arg1;
			this.aFloatArrayArray12[0][local3 + 1] = arg2;
			this.aFloatArrayArray12[0][local3 + 2] = arg3;
			this.aFloatArrayArray12[0][local3 + 3] = arg4;
			this.aBooleanArray5[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray12[1][local7] = arg1;
		this.aFloatArrayArray12[1][local7 + 1] = arg2;
		this.aFloatArrayArray12[1][local7 + 2] = arg3;
		this.aFloatArrayArray12[1][local7 + 3] = arg4;
		this.aBooleanArray5[1] = true;
	}

	@OriginalMember(owner = "client!agz", name = "x", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 200)
	@Override
	void method9588(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_48) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1.method29052(aFloatArray49), 8);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1.method29052(aFloatArray49), 8);
		}
	}

	@OriginalMember(owner = "client!agz", name = "ap", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 200)
	@Override
	void method9627(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_48) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1.method29052(aFloatArray49), 8);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1.method29052(aFloatArray49), 8);
		}
	}

	@OriginalMember(owner = "client!agz", name = "aw", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 200)
	@Override
	void method9626(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_48) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1.method29052(aFloatArray49), 8);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1.method29052(aFloatArray49), 8);
		}
	}

	@OriginalMember(owner = "client!agz", name = "az", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 200)
	@Override
	void method9619(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_48) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1.method29052(aFloatArray49), 8);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1.method29052(aFloatArray49), 8);
		}
	}

	@OriginalMember(owner = "client!agz", name = "d", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 208)
	@Override
	void method9589(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_41) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1.method29046(aFloatArray49), 16);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1.method29046(aFloatArray49), 16);
		}
	}

	@OriginalMember(owner = "client!agz", name = "ao", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 208)
	@Override
	void method9606(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_41) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1.method29046(aFloatArray49), 16);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1.method29046(aFloatArray49), 16);
		}
	}

	@OriginalMember(owner = "client!agz", name = "ak", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 208)
	@Override
	void method9633(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_41) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1.method29046(aFloatArray49), 16);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1.method29046(aFloatArray49), 16);
		}
	}

	@OriginalMember(owner = "client!agz", name = "q", descriptor = "(Lclient!aqz;[FI)V", line = 216)
	@Override
	void method9614(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_9) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agz", name = "bc", descriptor = "(Lclient!aqz;[FI)V", line = 216)
	@Override
	void method9628(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_9) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agz", name = "bv", descriptor = "(Lclient!aqz;[FI)V", line = 216)
	@Override
	void method9608(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_9) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agz", name = "bj", descriptor = "(Lclient!aqz;[FI)V", line = 216)
	@Override
	void method9630(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class77_Sub12_Sub1_Sub2) arg0).method23570();
		@Pc(7) int local7 = ((Class77_Sub12_Sub1_Sub2) arg0).method23571();
		if (arg0.method23555() != Class295.aClass295_9) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method9637(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method9640(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agz", name = "z", descriptor = "(Lclient!aqz;ILclient!ls;)V", line = 224)
	@Override
	void method9590(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass86_Sub1_Sub1_2.method20540(arg1);
		this.aClass86_Sub1_Sub1_2.method20542(arg2);
	}

	@OriginalMember(owner = "client!agz", name = "bb", descriptor = "(Lclient!aqz;ILclient!ls;)V", line = 224)
	@Override
	void method9632(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass86_Sub1_Sub1_2.method20540(arg1);
		this.aClass86_Sub1_Sub1_2.method20542(arg2);
	}

	@OriginalMember(owner = "client!agz", name = "ba", descriptor = "(Lclient!aqz;ILclient!ls;)V", line = 224)
	@Override
	void method9601(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass86_Sub1_Sub1_2.method20540(arg1);
		this.aClass86_Sub1_Sub1_2.method20542(arg2);
	}

	@OriginalMember(owner = "client!agz", name = "bl", descriptor = "(Lclient!aqz;ILclient!ls;)V", line = 224)
	@Override
	void method9631(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass86_Sub1_Sub1_2.method20540(arg1);
		this.aClass86_Sub1_Sub1_2.method20542(arg2);
	}

	@OriginalMember(owner = "client!agz", name = "bw", descriptor = "(IFFF)V", line = 229)
	@Override
	void method9636(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "bx", descriptor = "(IFFF)V", line = 229)
	@Override
	void method9635(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "bd", descriptor = "(IFFF)V", line = 229)
	@Override
	void method9622(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "by", descriptor = "(IFFF)V", line = 229)
	@Override
	void method9582(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "j", descriptor = "(IFFF)V", line = 229)
	@Override
	void method9591(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "au", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method9581(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "i", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method9592(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "ax", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method9609(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "ar", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method9610(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "ad", descriptor = "(IFFFF)V", line = 238)
	@Override
	void method9611(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray12[local3][local9] = arg1;
		this.aFloatArrayArray12[local3][local9 + 1] = arg2;
		this.aFloatArrayArray12[local3][local9 + 2] = arg3;
		this.aFloatArrayArray12[local3][local9 + 3] = arg4;
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "ah", descriptor = "(ILclient!oi;)V", line = 248)
	@Override
	void method9600(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method29046(aFloatArray49), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "aq", descriptor = "(ILclient!oi;)V", line = 248)
	@Override
	void method9618(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method29046(aFloatArray49), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "u", descriptor = "(ILclient!oi;)V", line = 248)
	@Override
	void method9593(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method29046(aFloatArray49), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "ae", descriptor = "(ILclient!oi;)V", line = 248)
	@Override
	void method9615(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method29046(aFloatArray49), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "as", descriptor = "(ILclient!oi;)V", line = 248)
	@Override
	void method9617(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method29046(aFloatArray49), 0, this.aFloatArrayArray12[local3], local9, 12);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "e", descriptor = "(ILclient!oi;)V", line = 255)
	@Override
	void method9594(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method29052(aFloatArray49), 0, this.aFloatArrayArray12[local3], local9, 8);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "am", descriptor = "(ILclient!oi;)V", line = 255)
	@Override
	void method9616(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method29052(aFloatArray49), 0, this.aFloatArrayArray12[local3], local9, 8);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "f", descriptor = "(ILclient!oi;)V", line = 262)
	@Override
	void method9597(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method29046(aFloatArray49), 0, this.aFloatArrayArray12[local3], local9, 16);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "ay", descriptor = "(ILclient!oi;)V", line = 262)
	@Override
	void method9620(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method29046(aFloatArray49), 0, this.aFloatArrayArray12[local3], local9, 16);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "ac", descriptor = "(I[FI)V", line = 269)
	@Override
	void method9612(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray12[local3], local9, arg2);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "av", descriptor = "(I[FI)V", line = 269)
	@Override
	void method9613(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray12[local3], local9, arg2);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "k", descriptor = "(I[FI)V", line = 269)
	@Override
	void method9607(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray12[local3], local9, arg2);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "at", descriptor = "(I[FI)V", line = 269)
	@Override
	void method9629(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray12[local3], local9, arg2);
		this.aBooleanArray5[local3] = true;
	}

	@OriginalMember(owner = "client!agz", name = "bi", descriptor = "(I[FI)V", line = 276)
	final void method9637(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class684.method36258(arg1, 0, this.aFloatArrayArray12[0], arg0 * 4, arg2);
		this.aBooleanArray5[0] = true;
	}

	@OriginalMember(owner = "client!agz", name = "bz", descriptor = "(I[FI)V", line = 276)
	final void method9638(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class684.method36258(arg1, 0, this.aFloatArrayArray12[0], arg0 * 4, arg2);
		this.aBooleanArray5[0] = true;
	}

	@OriginalMember(owner = "client!agz", name = "bu", descriptor = "(I[FI)V", line = 281)
	final void method9639(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class684.method36258(arg1, 0, this.aFloatArrayArray12[1], arg0 * 4, arg2);
		this.aBooleanArray5[1] = true;
	}

	@OriginalMember(owner = "client!agz", name = "bg", descriptor = "(I[FI)V", line = 281)
	final void method9640(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class684.method36258(arg1, 0, this.aFloatArrayArray12[1], arg0 * 4, arg2);
		this.aBooleanArray5[1] = true;
	}

	@OriginalMember(owner = "client!agz", name = "o", descriptor = "(IILclient!ls;)V", line = 286)
	@Override
	void method9596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass86_Sub1_Sub1_2.method20540(arg1);
		this.aClass86_Sub1_Sub1_2.method20542(arg2);
	}

	@OriginalMember(owner = "client!agz", name = "an", descriptor = "(IILclient!ls;)V", line = 286)
	@Override
	void method9587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass86_Sub1_Sub1_2.method20540(arg1);
		this.aClass86_Sub1_Sub1_2.method20542(arg2);
	}

	@OriginalMember(owner = "client!agz", name = "af", descriptor = "(IILclient!ls;)V", line = 286)
	@Override
	void method9621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass86_Sub1_Sub1_2.method20540(arg1);
		this.aClass86_Sub1_Sub1_2.method20542(arg2);
	}

	@OriginalMember(owner = "client!agz", name = "bs", descriptor = "()V", line = 291)
	void method9641() {
		if (this.aBooleanArray5[0]) {
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.clear();
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray12[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass86_Sub1_Sub1_2.aLong119, 0, this.aClass86_Sub1_Sub1_2.aLong121, this.aFloatArrayArray12[0].length / 4);
			this.aBooleanArray5[0] = false;
		}
		if (this.aBooleanArray5[1]) {
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.clear();
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray12[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.aClass86_Sub1_Sub1_2.aLong119, 0, this.aClass86_Sub1_Sub1_2.aLong121, this.aFloatArrayArray12[1].length / 4);
			this.aBooleanArray5[1] = false;
		}
	}

	@OriginalMember(owner = "client!agz", name = "bn", descriptor = "()V", line = 291)
	void method9642() {
		if (this.aBooleanArray5[0]) {
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.clear();
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray12[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass86_Sub1_Sub1_2.aLong119, 0, this.aClass86_Sub1_Sub1_2.aLong121, this.aFloatArrayArray12[0].length / 4);
			this.aBooleanArray5[0] = false;
		}
		if (this.aBooleanArray5[1]) {
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.clear();
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray12[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.aClass86_Sub1_Sub1_2.aLong119, 0, this.aClass86_Sub1_Sub1_2.aLong121, this.aFloatArrayArray12[1].length / 4);
			this.aBooleanArray5[1] = false;
		}
	}

	@OriginalMember(owner = "client!agz", name = "bf", descriptor = "()V", line = 291)
	void method9643() {
		if (this.aBooleanArray5[0]) {
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.clear();
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray12[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass86_Sub1_Sub1_2.aLong119, 0, this.aClass86_Sub1_Sub1_2.aLong121, this.aFloatArrayArray12[0].length / 4);
			this.aBooleanArray5[0] = false;
		}
		if (this.aBooleanArray5[1]) {
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.clear();
			this.aClass86_Sub1_Sub1_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray12[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.aClass86_Sub1_Sub1_2.aLong119, 0, this.aClass86_Sub1_Sub1_2.aLong121, this.aFloatArrayArray12[1].length / 4);
			this.aBooleanArray5[1] = false;
		}
	}

	@OriginalMember(owner = "client!agz", name = "s", descriptor = "()V", line = 306)
	@Override
	public void method30320() {
		if (this.aLong35 != 0L) {
			IUnknown.Release(this.aLong35);
			this.aLong35 = 0L;
		}
		if (this.aLong36 != 0L) {
			IUnknown.Release(this.aLong36);
			this.aLong36 = 0L;
		}
		this.aClass86_Sub1_Sub1_2.method20385(this);
	}

	@OriginalMember(owner = "client!agz", name = "r", descriptor = "()V", line = 306)
	@Override
	public void method30321() {
		if (this.aLong35 != 0L) {
			IUnknown.Release(this.aLong35);
			this.aLong35 = 0L;
		}
		if (this.aLong36 != 0L) {
			IUnknown.Release(this.aLong36);
			this.aLong36 = 0L;
		}
		this.aClass86_Sub1_Sub1_2.method20385(this);
	}

	@OriginalMember(owner = "client!agz", name = "g", descriptor = "()V", line = 306)
	@Override
	public void method30319() {
		if (this.aLong35 != 0L) {
			IUnknown.Release(this.aLong35);
			this.aLong35 = 0L;
		}
		if (this.aLong36 != 0L) {
			IUnknown.Release(this.aLong36);
			this.aLong36 = 0L;
		}
		this.aClass86_Sub1_Sub1_2.method20385(this);
	}

	@OriginalMember(owner = "client!agz", name = "v", descriptor = "()V", line = 306)
	@Override
	public void method30322() {
		if (this.aLong35 != 0L) {
			IUnknown.Release(this.aLong35);
			this.aLong35 = 0L;
		}
		if (this.aLong36 != 0L) {
			IUnknown.Release(this.aLong36);
			this.aLong36 = 0L;
		}
		this.aClass86_Sub1_Sub1_2.method20385(this);
	}

	@OriginalMember(owner = "client!agz", name = "bt", descriptor = "()V", line = 318)
	void method9644() {
		if (this.aLong35 != 0L) {
			this.aClass86_Sub1_Sub1_2.method19590(this.aLong35);
			this.aLong35 = 0L;
		}
		if (this.aLong36 != 0L) {
			this.aClass86_Sub1_Sub1_2.method19590(this.aLong36);
			this.aLong36 = 0L;
		}
	}

	@OriginalMember(owner = "client!agz", name = "bp", descriptor = "()V", line = 318)
	void method9645() {
		if (this.aLong35 != 0L) {
			this.aClass86_Sub1_Sub1_2.method19590(this.aLong35);
			this.aLong35 = 0L;
		}
		if (this.aLong36 != 0L) {
			this.aClass86_Sub1_Sub1_2.method19590(this.aLong36);
			this.aLong36 = 0L;
		}
	}

	@OriginalMember(owner = "client!agz", name = "bm", descriptor = "()V", line = 318)
	void method9646() {
		if (this.aLong35 != 0L) {
			this.aClass86_Sub1_Sub1_2.method19590(this.aLong35);
			this.aLong35 = 0L;
		}
		if (this.aLong36 != 0L) {
			this.aClass86_Sub1_Sub1_2.method19590(this.aLong36);
			this.aLong36 = 0L;
		}
	}

	@OriginalMember(owner = "client!agz", name = "bo", descriptor = "()V", line = 318)
	void method9647() {
		if (this.aLong35 != 0L) {
			this.aClass86_Sub1_Sub1_2.method19590(this.aLong35);
			this.aLong35 = 0L;
		}
		if (this.aLong36 != 0L) {
			this.aClass86_Sub1_Sub1_2.method19590(this.aLong36);
			this.aLong36 = 0L;
		}
	}

	@OriginalMember(owner = "client!agz", name = "finalize", descriptor = "()V", line = 329)
	@Override
	void finalize() {
		this.method9644();
	}

	@OriginalMember(owner = "client!agz", name = "hc", descriptor = "()V", line = 329)
	void method9648() {
		this.method9644();
	}

	@OriginalMember(owner = "client!agz", name = "hd", descriptor = "()V", line = 329)
	void method9649() {
		this.method9644();
	}

	@OriginalMember(owner = "client!agz", name = "hp", descriptor = "()V", line = 329)
	void method9650() {
		this.method9644();
	}
}
