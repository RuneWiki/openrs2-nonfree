package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public class Class29_Sub1 extends Class29 implements Interface20 {

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "Z")
	boolean aBoolean192;

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "Z")
	boolean aBoolean193;

	@OriginalMember(owner = "client!ada", name = "x", descriptor = "I")
	final int anInt966;

	@OriginalMember(owner = "client!ada", name = "s", descriptor = "I")
	final int anInt965;

	@OriginalMember(owner = "client!ada", name = "u", descriptor = "F")
	final float aFloat135;

	@OriginalMember(owner = "client!ada", name = "y", descriptor = "F")
	final float aFloat136;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!akw;Lclient!cw;Lclient!dj;II)V", line = 22)
	Class29_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, 0, 1);
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!akw;Lclient!cw;Lclient!dj;IIII)V", line = 26)
	Class29_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass21_Sub3_Sub2_8.aBoolean452) {
			this.anInt966 = arg3;
			this.anInt965 = arg4;
			this.aFloat135 = 1.0F;
			this.aFloat136 = 1.0F;
		} else {
			this.anInt966 = Class302.method25670(arg3);
			this.anInt965 = Class302.method25670(arg4);
			this.aFloat135 = (float) arg3 / (float) this.anInt966;
			this.aFloat136 = (float) arg4 / (float) this.anInt965;
		}
		this.aLong27 = IDirect3DDevice.CreateTexture(this.aClass21_Sub3_Sub2_8.aLong104, this.anInt966, this.anInt965, 0, arg5, Class21_Sub3_Sub2.method17833(this.aClass121_12, this.aClass127_13), arg6);
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!akw;IIZ[III)V", line = 43)
	Class29_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Class121.aClass121_17, Class127.aClass127_23, arg3 && arg0.aBoolean453, arg1 * arg2);
		if (this.aClass21_Sub3_Sub2_8.aBoolean452) {
			this.anInt966 = arg1;
			this.anInt965 = arg2;
			this.aFloat135 = 1.0F;
			this.aFloat136 = 1.0F;
		} else {
			this.anInt966 = Class302.method25670(arg1);
			this.anInt965 = Class302.method25670(arg2);
			this.aFloat135 = (float) arg1 / (float) this.anInt966;
			this.aFloat136 = (float) arg2 / (float) this.anInt965;
			if (arg1 != this.anInt966 || arg2 != this.anInt965) {
				arg4 = this.aClass21_Sub3_Sub2_8.method17139(arg1, arg2, this.anInt966, this.anInt965, arg4, arg5, arg6);
				arg5 = 0;
				arg6 = this.anInt966;
			}
		}
		if (arg3) {
			this.aLong27 = IDirect3DDevice.CreateTexture(this.aClass21_Sub3_Sub2_8.aLong104, this.anInt966, this.anInt965, 0, 1024, 21, 1);
		} else {
			this.aLong27 = IDirect3DDevice.CreateTexture(this.aClass21_Sub3_Sub2_8.aLong104, this.anInt966, this.anInt965, 1, 0, 21, 1);
		}
		if (arg6 == 0) {
			arg6 = this.anInt966;
		}
		@Pc(125) ByteBuffer local125 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local125.clear();
		local125.asIntBuffer().put(arg4, arg5, arg6 * this.anInt965);
		IDirect3DTexture.Upload(this.aLong27, 0, 0, 0, this.anInt966, this.anInt965, arg6 * this.aClass121_12.anInt3211 * 1629489977, 0, this.aClass21_Sub3_Sub2_8.aLong101);
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!akw;Lclient!cw;IIZ[BII)V", line = 73)
	Class29_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Class127.aClass127_23, arg4 && arg0.aBoolean453, arg2 * arg3);
		if (this.aClass21_Sub3_Sub2_8.aBoolean452) {
			this.anInt966 = arg2;
			this.anInt965 = arg3;
			this.aFloat135 = 1.0F;
			this.aFloat136 = 1.0F;
		} else {
			this.anInt966 = Class302.method25670(arg2);
			this.anInt965 = Class302.method25670(arg3);
			this.aFloat135 = (float) arg2 / (float) this.anInt966;
			this.aFloat136 = (float) arg3 / (float) this.anInt965;
			if (arg2 != this.anInt966 || arg3 != this.anInt965) {
				arg5 = this.aClass21_Sub3_Sub2_8.method17297(arg2, arg3, this.anInt966, this.anInt965, arg5, arg6, arg7, arg1.anInt3211 * 1629489977);
				arg6 = 0;
				arg7 = this.anInt966;
			}
		}
		if (arg4) {
			this.aLong27 = IDirect3DDevice.CreateTexture(this.aClass21_Sub3_Sub2_8.aLong104, this.anInt966, this.anInt965, 0, 1024, Class21_Sub3_Sub2.method17833(this.aClass121_12, Class127.aClass127_23), 1);
		} else {
			this.aLong27 = IDirect3DDevice.CreateTexture(this.aClass21_Sub3_Sub2_8.aLong104, this.anInt966, this.anInt965, 1, 0, Class21_Sub3_Sub2.method17833(this.aClass121_12, Class127.aClass127_23), 1);
		}
		if (arg7 == 0) {
			arg7 = this.anInt966;
		}
		@Pc(135) ByteBuffer local135 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local135.clear();
		if (this.aClass121_12 == Class121.aClass121_24) {
			local135.put(arg5, arg6, this.anInt965 * this.anInt966 / 2);
			IDirect3DTexture.Upload(this.aLong27, 0, 0, 0, this.anInt966, this.anInt965 / 4, this.anInt966 / 4 * 8, 0, this.aClass21_Sub3_Sub2_8.aLong101);
		} else if (this.aClass121_12 == Class121.aClass121_25) {
			local135.put(arg5, arg6, this.anInt965 * this.anInt966);
			IDirect3DTexture.Upload(this.aLong27, 0, 0, 0, this.anInt966, this.anInt965 / 4, this.anInt966 / 4 * 16, 0, this.aClass21_Sub3_Sub2_8.aLong101);
		} else {
			local135.put(arg5, arg6, arg7 * this.anInt965);
			IDirect3DTexture.Upload(this.aLong27, 0, 0, 0, this.anInt966, this.anInt965, arg7 * this.aClass121_12.anInt3211 * 1629489977, 0, this.aClass21_Sub3_Sub2_8.aLong101);
		}
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!akw;Lclient!cw;IIZ[FII)V", line = 113)
	Class29_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Class127.aClass127_23, arg4 && arg0.aBoolean453, arg2 * arg3);
		if (this.aClass21_Sub3_Sub2_8.aBoolean452) {
			this.anInt966 = arg2;
			this.anInt965 = arg3;
			this.aFloat135 = 1.0F;
			this.aFloat136 = 1.0F;
		} else {
			this.anInt966 = Class302.method25670(arg2);
			this.anInt965 = Class302.method25670(arg3);
			this.aFloat135 = (float) arg2 / (float) this.anInt966;
			this.aFloat136 = (float) arg3 / (float) this.anInt965;
			if (arg2 != this.anInt966 || arg3 != this.anInt965) {
				arg5 = this.aClass21_Sub3_Sub2_8.method17140(arg2, arg3, this.anInt966, this.anInt965, arg5, arg6, arg7, arg1.anInt3211 * 1629489977);
				arg6 = 0;
				arg7 = this.anInt966;
			}
		}
		if (arg4) {
			this.aLong27 = IDirect3DDevice.CreateTexture(this.aClass21_Sub3_Sub2_8.aLong104, this.anInt966, this.anInt965, 0, 1024, Class21_Sub3_Sub2.method17833(this.aClass121_12, Class127.aClass127_20), 1);
		} else {
			this.aLong27 = IDirect3DDevice.CreateTexture(this.aClass21_Sub3_Sub2_8.aLong104, this.anInt966, this.anInt965, 1, 0, Class21_Sub3_Sub2.method17833(this.aClass121_12, Class127.aClass127_20), 1);
		}
		if (arg7 == 0) {
			arg7 = this.anInt966;
		}
		@Pc(135) ByteBuffer local135 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local135.clear();
		local135.asFloatBuffer().put(arg5, arg6, arg7 * this.anInt965 * this.aClass121_12.anInt3211 * 1629489977);
		IDirect3DTexture.Upload(this.aLong27, 0, 0, 0, this.anInt966, this.anInt965, arg7 * this.aClass121_12.anInt3211 * 1629489977 * 4, 0, this.aClass21_Sub3_Sub2_8.aLong101);
	}

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "()I", line = 143)
	@Override
	public int method8961() {
		return this.anInt966;
	}

	@OriginalMember(owner = "client!ada", name = "r", descriptor = "()I", line = 143)
	@Override
	public int method8941() {
		return this.anInt966;
	}

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "()I", line = 143)
	@Override
	public int method8944() {
		return this.anInt966;
	}

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "()I", line = 143)
	@Override
	public int method8942() {
		return this.anInt966;
	}

	@OriginalMember(owner = "client!ada", name = "q", descriptor = "()I", line = 143)
	@Override
	public int method8943() {
		return this.anInt966;
	}

	@OriginalMember(owner = "client!ada", name = "v", descriptor = "()I", line = 147)
	@Override
	public int method8945() {
		return this.anInt965;
	}

	@OriginalMember(owner = "client!ada", name = "t", descriptor = "()I", line = 147)
	@Override
	public int method8946() {
		return this.anInt965;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "()I", line = 147)
	@Override
	public int method8931() {
		return this.anInt965;
	}

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "(F)F", line = 151)
	@Override
	public float method8932(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt966;
	}

	@OriginalMember(owner = "client!ada", name = "w", descriptor = "(F)F", line = 151)
	@Override
	public float method8954(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt966;
	}

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "(F)F", line = 155)
	@Override
	public float method8933(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt965;
	}

	@OriginalMember(owner = "client!ada", name = "o", descriptor = "(F)F", line = 155)
	@Override
	public float method8940(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt965;
	}

	@OriginalMember(owner = "client!ada", name = "i", descriptor = "(F)F", line = 155)
	@Override
	public float method8937(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt965;
	}

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "()F", line = 159)
	@Override
	public float method8938() {
		return this.aFloat135;
	}

	@OriginalMember(owner = "client!ada", name = "ai", descriptor = "()F", line = 159)
	@Override
	public float method8959() {
		return this.aFloat135;
	}

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "()F", line = 163)
	@Override
	public float method8939() {
		return this.aFloat136;
	}

	@OriginalMember(owner = "client!ada", name = "av", descriptor = "()F", line = 163)
	@Override
	public float method8953() {
		return this.aFloat136;
	}

	@OriginalMember(owner = "client!ada", name = "aq", descriptor = "()F", line = 163)
	@Override
	public float method8930() {
		return this.aFloat136;
	}

	@OriginalMember(owner = "client!ada", name = "x", descriptor = "()Z", line = 167)
	@Override
	public boolean method8934() {
		return true;
	}

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "()Z", line = 167)
	@Override
	public boolean method8947() {
		return true;
	}

	@OriginalMember(owner = "client!ada", name = "bs", descriptor = "()J", line = 171)
	@Override
	long method8727() {
		return this.aLong27;
	}

	@OriginalMember(owner = "client!ada", name = "aw", descriptor = "()J", line = 171)
	@Override
	long method8720() {
		return this.aLong27;
	}

	@OriginalMember(owner = "client!ada", name = "ay", descriptor = "(Lclient!jn;)V", line = 175)
	@Override
	public void method9874(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!ada", name = "ap", descriptor = "(Lclient!jn;)V", line = 175)
	@Override
	public void method9867(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!ada", name = "s", descriptor = "(ZZ)V", line = 179)
	@Override
	public void method8951(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean192 = arg0;
		this.aBoolean193 = arg1;
	}

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "(ZZ)V", line = 179)
	@Override
	public void method8962(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean192 = arg0;
		this.aBoolean193 = arg1;
	}

	@OriginalMember(owner = "client!ada", name = "at", descriptor = "(ZZ)V", line = 179)
	@Override
	public void method8952(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean192 = arg0;
		this.aBoolean193 = arg1;
	}

	@OriginalMember(owner = "client!ada", name = "af", descriptor = "(ZZ)V", line = 179)
	@Override
	public void method8948(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean192 = arg0;
		this.aBoolean193 = arg1;
	}

	@OriginalMember(owner = "client!ada", name = "u", descriptor = "(IIII[III)V", line = 184)
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass121_12 != Class121.aClass121_17 || this.aClass127_13 != Class127.aClass127_23) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		@Pc(19) ByteBuffer local19 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local19.clear();
		local19.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong27, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass121_12.anInt3211 * 1629489977, 0, this.aClass21_Sub3_Sub2_8.aLong101);
	}

	@OriginalMember(owner = "client!ada", name = "ak", descriptor = "(IIII[III)V", line = 184)
	@Override
	public void method8950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass121_12 != Class121.aClass121_17 || this.aClass127_13 != Class127.aClass127_23) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		@Pc(19) ByteBuffer local19 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local19.clear();
		local19.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong27, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass121_12.anInt3211 * 1629489977, 0, this.aClass21_Sub3_Sub2_8.aLong101);
	}

	@OriginalMember(owner = "client!ada", name = "ah", descriptor = "(IIII[BLclient!cw;II)V", line = 193)
	@Override
	public void method8956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass121_12 != arg5 || this.aClass127_13 != Class127.aClass127_23) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		@Pc(19) ByteBuffer local19 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local19.clear();
		local19.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong27, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass121_12.anInt3211 * 1629489977, 0, this.aClass21_Sub3_Sub2_8.aLong101);
	}

	@OriginalMember(owner = "client!ada", name = "aa", descriptor = "(IIII[BLclient!cw;II)V", line = 193)
	@Override
	public void method8955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass121_12 != arg5 || this.aClass127_13 != Class127.aClass127_23) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		@Pc(19) ByteBuffer local19 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local19.clear();
		local19.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong27, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass121_12.anInt3211 * 1629489977, 0, this.aClass21_Sub3_Sub2_8.aLong101);
	}

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "(IIII[BLclient!cw;II)V", line = 193)
	@Override
	public void method8936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass121_12 != arg5 || this.aClass127_13 != Class127.aClass127_23) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		@Pc(19) ByteBuffer local19 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local19.clear();
		local19.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong27, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass121_12.anInt3211 * 1629489977, 0, this.aClass21_Sub3_Sub2_8.aLong101);
	}

	@OriginalMember(owner = "client!ada", name = "an", descriptor = "(IIII[BLclient!cw;II)V", line = 193)
	@Override
	public void method8960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass121_12 != arg5 || this.aClass127_13 != Class127.aClass127_23) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		@Pc(19) ByteBuffer local19 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local19.clear();
		local19.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong27, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass121_12.anInt3211 * 1629489977, 0, this.aClass21_Sub3_Sub2_8.aLong101);
	}

	@OriginalMember(owner = "client!ada", name = "z", descriptor = "(IIII[II)V", line = 202)
	@Override
	public void method8949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass121_12 != Class121.aClass121_17 || this.aClass127_13 != Class127.aClass127_23) {
			throw new RuntimeException();
		}
		@Pc(15) ByteBuffer local15 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local15.clear();
		IDirect3DTexture.Download(this.aLong27, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass21_Sub3_Sub2_8.aLong101);
		local15.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!ada", name = "aj", descriptor = "(IIII[II)V", line = 202)
	@Override
	public void method8957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass121_12 != Class121.aClass121_17 || this.aClass127_13 != Class127.aClass127_23) {
			throw new RuntimeException();
		}
		@Pc(15) ByteBuffer local15 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local15.clear();
		IDirect3DTexture.Download(this.aLong27, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass21_Sub3_Sub2_8.aLong101);
		local15.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!ada", name = "as", descriptor = "(IIII[II)V", line = 202)
	@Override
	public void method8958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass121_12 != Class121.aClass121_17 || this.aClass127_13 != Class127.aClass127_23) {
			throw new RuntimeException();
		}
		@Pc(15) ByteBuffer local15 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local15.clear();
		IDirect3DTexture.Download(this.aLong27, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass21_Sub3_Sub2_8.aLong101);
		local15.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!ada", name = "ao", descriptor = "()V", line = 210)
	@Override
	public void method9872() {
		this.aClass21_Sub3_Sub2_8.method17845(this);
	}

	@OriginalMember(owner = "client!ada", name = "ab", descriptor = "()V", line = 210)
	@Override
	public void method9868() {
		this.aClass21_Sub3_Sub2_8.method17845(this);
	}

	@OriginalMember(owner = "client!ada", name = "au", descriptor = "()V", line = 210)
	@Override
	public void method9873() {
		this.aClass21_Sub3_Sub2_8.method17845(this);
	}

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "()Z", line = 214)
	@Override
	public boolean method9883() {
		return false;
	}

	@OriginalMember(owner = "client!ada", name = "ax", descriptor = "()Z", line = 214)
	@Override
	public boolean method9886() {
		return false;
	}

	@OriginalMember(owner = "client!ada", name = "az", descriptor = "()Z", line = 214)
	@Override
	public boolean method9887() {
		return false;
	}

	@OriginalMember(owner = "client!ada", name = "al", descriptor = "()Z", line = 214)
	@Override
	public boolean method9882() {
		return false;
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "()V", line = 218)
	@Override
	public void method27210() {
		super.method27209();
	}

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "()V", line = 218)
	@Override
	public void method27209() {
		super.method27209();
	}

	@OriginalMember(owner = "client!ada", name = "y", descriptor = "()V", line = 218)
	@Override
	public void method27208() {
		super.method27209();
	}
}
