package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahs")
public class Class116_Sub1 extends Class116 implements Interface37 {

	@OriginalMember(owner = "client!ahs", name = "d", descriptor = "Z")
	boolean aBoolean206;

	@OriginalMember(owner = "client!ahs", name = "t", descriptor = "I")
	final int anInt1132;

	@OriginalMember(owner = "client!ahs", name = "q", descriptor = "F")
	final float aFloat127;

	@OriginalMember(owner = "client!ahs", name = "x", descriptor = "F")
	final float aFloat128;

	@OriginalMember(owner = "client!ahs", name = "w", descriptor = "I")
	final int anInt1133;

	@OriginalMember(owner = "client!ahs", name = "s", descriptor = "Z")
	boolean aBoolean207;

	@OriginalMember(owner = "client!ahs", name = "<init>", descriptor = "(Lclient!apn;Lclient!dt;Lclient!dl;II)V", line = 22)
	Class116_Sub1(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, 0, 1);
	}

	@OriginalMember(owner = "client!ahs", name = "<init>", descriptor = "(Lclient!apn;Lclient!dt;Lclient!dl;IIII)V", line = 26)
	Class116_Sub1(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass86_Sub1_Sub1_8.aBoolean414) {
			this.anInt1133 = arg3;
			this.anInt1132 = arg4;
			this.aFloat127 = 1.0F;
			this.aFloat128 = 1.0F;
		} else {
			this.anInt1133 = Class199.method25492(arg3);
			this.anInt1132 = Class199.method25492(arg4);
			this.aFloat127 = (float) arg3 / (float) this.anInt1133;
			this.aFloat128 = (float) arg4 / (float) this.anInt1132;
		}
		this.aLong42 = IDirect3DDevice.CreateTexture(this.aClass86_Sub1_Sub1_8.aLong119, this.anInt1133, this.anInt1132, 0, arg5, Class86_Sub1_Sub1.method19578(this.aClass212_15, this.aClass206_15), arg6);
	}

	@OriginalMember(owner = "client!ahs", name = "<init>", descriptor = "(Lclient!apn;IIZ[III)V", line = 43)
	Class116_Sub1(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Class212.aClass212_18, Class206.aClass206_23, arg3 && arg0.aBoolean415, arg1 * arg2);
		if (this.aClass86_Sub1_Sub1_8.aBoolean414) {
			this.anInt1133 = arg1;
			this.anInt1132 = arg2;
			this.aFloat127 = 1.0F;
			this.aFloat128 = 1.0F;
		} else {
			this.anInt1133 = Class199.method25492(arg1);
			this.anInt1132 = Class199.method25492(arg2);
			this.aFloat127 = (float) arg1 / (float) this.anInt1133;
			this.aFloat128 = (float) arg2 / (float) this.anInt1132;
			if (arg1 != this.anInt1133 || arg2 != this.anInt1132) {
				arg4 = this.aClass86_Sub1_Sub1_8.method20032(arg1, arg2, this.anInt1133, this.anInt1132, arg4, arg5, arg6);
				arg5 = 0;
				arg6 = this.anInt1133;
			}
		}
		if (arg3) {
			this.aLong42 = IDirect3DDevice.CreateTexture(this.aClass86_Sub1_Sub1_8.aLong119, this.anInt1133, this.anInt1132, 0, 1024, 21, 1);
		} else {
			this.aLong42 = IDirect3DDevice.CreateTexture(this.aClass86_Sub1_Sub1_8.aLong119, this.anInt1133, this.anInt1132, 1, 0, 21, 1);
		}
		if (arg6 == 0) {
			arg6 = this.anInt1133;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg6 * this.anInt1132 * this.aClass212_15.anInt3679 * 1676120375);
		@Pc(138) ByteBuffer local138 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local138.clear();
		local138.asIntBuffer().put(arg4, arg5, arg6 * this.anInt1132);
		IDirect3DTexture.Upload(this.aLong42, 0, 0, 0, this.anInt1133, this.anInt1132, arg6 * this.aClass212_15.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahs", name = "<init>", descriptor = "(Lclient!apn;Lclient!dt;IIZ[BII)V", line = 74)
	Class116_Sub1(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Class206.aClass206_23, arg4 && arg0.aBoolean415, arg2 * arg3);
		if (this.aClass86_Sub1_Sub1_8.aBoolean414) {
			this.anInt1133 = arg2;
			this.anInt1132 = arg3;
			this.aFloat127 = 1.0F;
			this.aFloat128 = 1.0F;
		} else {
			this.anInt1133 = Class199.method25492(arg2);
			this.anInt1132 = Class199.method25492(arg3);
			this.aFloat127 = (float) arg2 / (float) this.anInt1133;
			this.aFloat128 = (float) arg3 / (float) this.anInt1132;
			if (arg2 != this.anInt1133 || arg3 != this.anInt1132) {
				arg5 = this.aClass86_Sub1_Sub1_8.method20039(arg2, arg3, this.anInt1133, this.anInt1132, arg5, arg6, arg7, arg1.anInt3679 * 1676120375);
				arg6 = 0;
				arg7 = this.anInt1133;
			}
		}
		if (arg4) {
			this.aLong42 = IDirect3DDevice.CreateTexture(this.aClass86_Sub1_Sub1_8.aLong119, this.anInt1133, this.anInt1132, 0, 1024, Class86_Sub1_Sub1.method19578(this.aClass212_15, Class206.aClass206_23), 1);
		} else {
			this.aLong42 = IDirect3DDevice.CreateTexture(this.aClass86_Sub1_Sub1_8.aLong119, this.anInt1133, this.anInt1132, 1, 0, Class86_Sub1_Sub1.method19578(this.aClass212_15, Class206.aClass206_23), 1);
		}
		if (arg7 == 0) {
			arg7 = this.anInt1133;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg7 * this.anInt1132 * this.aClass212_15.anInt3679 * 1676120375);
		@Pc(148) ByteBuffer local148 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local148.clear();
		if (this.aClass212_15 == Class212.aClass212_23) {
			local148.put(arg5, arg6, this.anInt1132 * this.anInt1133 / 2);
			IDirect3DTexture.Upload(this.aLong42, 0, 0, 0, this.anInt1133, this.anInt1132 / 4, this.anInt1133 / 4 * 8, 0, this.aClass86_Sub1_Sub1_8.aLong121);
		} else if (this.aClass212_15 == Class212.aClass212_25) {
			local148.put(arg5, arg6, this.anInt1132 * this.anInt1133);
			IDirect3DTexture.Upload(this.aLong42, 0, 0, 0, this.anInt1133, this.anInt1132 / 4, this.anInt1133 / 4 * 16, 0, this.aClass86_Sub1_Sub1_8.aLong121);
		} else {
			local148.put(arg5, arg6, arg7 * this.anInt1132);
			IDirect3DTexture.Upload(this.aLong42, 0, 0, 0, this.anInt1133, this.anInt1132, arg7 * this.aClass212_15.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
		}
	}

	@OriginalMember(owner = "client!ahs", name = "<init>", descriptor = "(Lclient!apn;Lclient!dt;IIZ[FII)V", line = 115)
	Class116_Sub1(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Class206.aClass206_23, arg4 && arg0.aBoolean415, arg2 * arg3);
		if (this.aClass86_Sub1_Sub1_8.aBoolean414) {
			this.anInt1133 = arg2;
			this.anInt1132 = arg3;
			this.aFloat127 = 1.0F;
			this.aFloat128 = 1.0F;
		} else {
			this.anInt1133 = Class199.method25492(arg2);
			this.anInt1132 = Class199.method25492(arg3);
			this.aFloat127 = (float) arg2 / (float) this.anInt1133;
			this.aFloat128 = (float) arg3 / (float) this.anInt1132;
			if (arg2 != this.anInt1133 || arg3 != this.anInt1132) {
				arg5 = this.aClass86_Sub1_Sub1_8.method20035(arg2, arg3, this.anInt1133, this.anInt1132, arg5, arg6, arg7, arg1.anInt3679 * 1676120375);
				arg6 = 0;
				arg7 = this.anInt1133;
			}
		}
		if (arg4) {
			this.aLong42 = IDirect3DDevice.CreateTexture(this.aClass86_Sub1_Sub1_8.aLong119, this.anInt1133, this.anInt1132, 0, 1024, Class86_Sub1_Sub1.method19578(this.aClass212_15, Class206.aClass206_19), 1);
		} else {
			this.aLong42 = IDirect3DDevice.CreateTexture(this.aClass86_Sub1_Sub1_8.aLong119, this.anInt1133, this.anInt1132, 1, 0, Class86_Sub1_Sub1.method19578(this.aClass212_15, Class206.aClass206_19), 1);
		}
		if (arg7 == 0) {
			arg7 = this.anInt1133;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg7 * this.anInt1132 * this.aClass212_15.anInt3679 * 1676120375 * 4);
		@Pc(150) ByteBuffer local150 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local150.clear();
		local150.asFloatBuffer().put(arg5, arg6, arg7 * this.anInt1132 * this.aClass212_15.anInt3679 * 1676120375);
		IDirect3DTexture.Upload(this.aLong42, 0, 0, 0, this.anInt1133, this.anInt1132, arg7 * this.aClass212_15.anInt3679 * 1676120375 * 4, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahs", name = "e", descriptor = "()I", line = 146)
	@Override
	public int method10612() {
		return this.anInt1133;
	}

	@OriginalMember(owner = "client!ahs", name = "f", descriptor = "()I", line = 146)
	@Override
	public int method10613() {
		return this.anInt1133;
	}

	@OriginalMember(owner = "client!ahs", name = "p", descriptor = "()I", line = 146)
	@Override
	public int method10631() {
		return this.anInt1133;
	}

	@OriginalMember(owner = "client!ahs", name = "o", descriptor = "()I", line = 150)
	@Override
	public int method10614() {
		return this.anInt1132;
	}

	@OriginalMember(owner = "client!ahs", name = "c", descriptor = "()I", line = 150)
	@Override
	public int method10603() {
		return this.anInt1132;
	}

	@OriginalMember(owner = "client!ahs", name = "b", descriptor = "()I", line = 150)
	@Override
	public int method10615() {
		return this.anInt1132;
	}

	@OriginalMember(owner = "client!ahs", name = "n", descriptor = "(F)F", line = 154)
	@Override
	public float method10616(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1133;
	}

	@OriginalMember(owner = "client!ahs", name = "l", descriptor = "(F)F", line = 154)
	@Override
	public float method10600(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1133;
	}

	@OriginalMember(owner = "client!ahs", name = "a", descriptor = "(F)F", line = 158)
	@Override
	public float method10617(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1132;
	}

	@OriginalMember(owner = "client!ahs", name = "y", descriptor = "(F)F", line = 158)
	@Override
	public float method10606(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1132;
	}

	@OriginalMember(owner = "client!ahs", name = "i", descriptor = "()F", line = 162)
	@Override
	public float method10611() {
		return this.aFloat127;
	}

	@OriginalMember(owner = "client!ahs", name = "at", descriptor = "()F", line = 162)
	@Override
	public float method10609() {
		return this.aFloat127;
	}

	@OriginalMember(owner = "client!ahs", name = "ah", descriptor = "()F", line = 166)
	@Override
	public float method10632() {
		return this.aFloat128;
	}

	@OriginalMember(owner = "client!ahs", name = "k", descriptor = "()F", line = 166)
	@Override
	public float method10610() {
		return this.aFloat128;
	}

	@OriginalMember(owner = "client!ahs", name = "ae", descriptor = "()F", line = 166)
	@Override
	public float method10598() {
		return this.aFloat128;
	}

	@OriginalMember(owner = "client!ahs", name = "m", descriptor = "()Z", line = 170)
	@Override
	public boolean method10621() {
		return true;
	}

	@OriginalMember(owner = "client!ahs", name = "w", descriptor = "()Z", line = 170)
	@Override
	public boolean method10602() {
		return true;
	}

	@OriginalMember(owner = "client!ahs", name = "ba", descriptor = "()J", line = 174)
	@Override
	long method10852() {
		return this.aLong42;
	}

	@OriginalMember(owner = "client!ahs", name = "bb", descriptor = "()J", line = 174)
	@Override
	long method10853() {
		return this.aLong42;
	}

	@OriginalMember(owner = "client!ahs", name = "af", descriptor = "(Lclient!lo;)V", line = 178)
	@Override
	public void method10856(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahs", name = "aw", descriptor = "(Lclient!lo;)V", line = 178)
	@Override
	public void method10854(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahs", name = "az", descriptor = "(Lclient!lo;)V", line = 178)
	@Override
	public void method10855(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahs", name = "t", descriptor = "(ZZ)V", line = 182)
	@Override
	public void method10618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean206 = arg0;
		this.aBoolean207 = arg1;
	}

	@OriginalMember(owner = "client!ahs", name = "h", descriptor = "(ZZ)V", line = 182)
	@Override
	public void method10601(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean206 = arg0;
		this.aBoolean207 = arg1;
	}

	@OriginalMember(owner = "client!ahs", name = "aj", descriptor = "(IIII[III)V", line = 187)
	@Override
	public void method10620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass212_15 != Class212.aClass212_18 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg6 * arg3 * this.aClass212_15.anInt3679 * 1676120375);
		@Pc(31) ByteBuffer local31 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong42, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass212_15.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahs", name = "q", descriptor = "(IIII[III)V", line = 187)
	@Override
	public void method10630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass212_15 != Class212.aClass212_18 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg6 * arg3 * this.aClass212_15.anInt3679 * 1676120375);
		@Pc(31) ByteBuffer local31 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong42, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass212_15.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahs", name = "ak", descriptor = "(IIII[BLclient!dt;II)V", line = 197)
	@Override
	public void method10625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass212_15 != arg5 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg7 * arg3 * this.aClass212_15.anInt3679 * 1676120375);
		@Pc(31) ByteBuffer local31 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong42, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass212_15.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahs", name = "ag", descriptor = "(IIII[BLclient!dt;II)V", line = 197)
	@Override
	public void method10622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass212_15 != arg5 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg7 * arg3 * this.aClass212_15.anInt3679 * 1676120375);
		@Pc(31) ByteBuffer local31 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong42, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass212_15.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahs", name = "x", descriptor = "(IIII[BLclient!dt;II)V", line = 197)
	@Override
	public void method10605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass212_15 != arg5 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg7 * arg3 * this.aClass212_15.anInt3679 * 1676120375);
		@Pc(31) ByteBuffer local31 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong42, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass212_15.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahs", name = "ai", descriptor = "(IIII[BLclient!dt;II)V", line = 197)
	@Override
	public void method10626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass212_15 != arg5 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg7 * arg3 * this.aClass212_15.anInt3679 * 1676120375);
		@Pc(31) ByteBuffer local31 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong42, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass212_15.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahs", name = "al", descriptor = "(IIII[BLclient!dt;II)V", line = 197)
	@Override
	public void method10619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass212_15 != arg5 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg7 * arg3 * this.aClass212_15.anInt3679 * 1676120375);
		@Pc(31) ByteBuffer local31 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong42, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass212_15.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahs", name = "ao", descriptor = "(IIII[BLclient!dt;II)V", line = 197)
	@Override
	public void method10624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass212_15 != arg5 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg7 * arg3 * this.aClass212_15.anInt3679 * 1676120375);
		@Pc(31) ByteBuffer local31 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong42, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass212_15.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahs", name = "d", descriptor = "(IIII[II)V", line = 207)
	@Override
	public void method10607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass212_15 != Class212.aClass212_18 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong42, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass86_Sub1_Sub1_8.aLong121);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!ahs", name = "au", descriptor = "(IIII[II)V", line = 207)
	@Override
	public void method10604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass212_15 != Class212.aClass212_18 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong42, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass86_Sub1_Sub1_8.aLong121);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!ahs", name = "ax", descriptor = "(IIII[II)V", line = 207)
	@Override
	public void method10627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass212_15 != Class212.aClass212_18 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong42, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass86_Sub1_Sub1_8.aLong121);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!ahs", name = "ar", descriptor = "(IIII[II)V", line = 207)
	@Override
	public void method10628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass212_15 != Class212.aClass212_18 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		this.aClass86_Sub1_Sub1_8.method20393(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong42, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass86_Sub1_Sub1_8.aLong121);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!ahs", name = "z", descriptor = "(IIII[I[II)V", line = 216)
	@Override
	public void method10623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass212_15 != Class212.aClass212_18 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		this.method10623(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@OriginalMember(owner = "client!ahs", name = "ad", descriptor = "(IIII[I[II)V", line = 216)
	@Override
	public void method10629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass212_15 != Class212.aClass212_18 || this.aClass206_15 != Class206.aClass206_23) {
			throw new RuntimeException();
		}
		this.method10623(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@OriginalMember(owner = "client!ahs", name = "j", descriptor = "(IIIIII)V", line = 221)
	@Override
	public void method10608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int[] local7 = this.aClass86_Sub1_Sub1_8.method20066(arg4, arg5, arg2, arg3);
		if (local7 != null) {
			for (@Pc(11) int local11 = 0; local11 < local7.length; local11++) {
				local7[local11] |= 0xFF000000;
			}
			this.method10630(arg0, arg1, arg2, arg3, local7, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ahs", name = "ac", descriptor = "(IIIIII)V", line = 221)
	@Override
	public void method10633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int[] local7 = this.aClass86_Sub1_Sub1_8.method20066(arg4, arg5, arg2, arg3);
		if (local7 != null) {
			for (@Pc(11) int local11 = 0; local11 < local7.length; local11++) {
				local7[local11] |= 0xFF000000;
			}
			this.method10630(arg0, arg1, arg2, arg3, local7, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ahs", name = "av", descriptor = "(IIIIII)V", line = 221)
	@Override
	public void method10599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int[] local7 = this.aClass86_Sub1_Sub1_8.method20066(arg4, arg5, arg2, arg3);
		if (local7 != null) {
			for (@Pc(11) int local11 = 0; local11 < local7.length; local11++) {
				local7[local11] |= 0xFF000000;
			}
			this.method10630(arg0, arg1, arg2, arg3, local7, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!ahs", name = "an", descriptor = "()V", line = 229)
	@Override
	public void method10867() {
		this.aClass86_Sub1_Sub1_8.method19557(this);
	}

	@OriginalMember(owner = "client!ahs", name = "ay", descriptor = "()V", line = 229)
	@Override
	public void method10865() {
		this.aClass86_Sub1_Sub1_8.method19557(this);
	}

	@OriginalMember(owner = "client!ahs", name = "ab", descriptor = "()V", line = 229)
	@Override
	public void method10864() {
		this.aClass86_Sub1_Sub1_8.method19557(this);
	}

	@OriginalMember(owner = "client!ahs", name = "aa", descriptor = "()V", line = 229)
	@Override
	public void method10868() {
		this.aClass86_Sub1_Sub1_8.method19557(this);
	}

	@OriginalMember(owner = "client!ahs", name = "ap", descriptor = "()V", line = 229)
	@Override
	public void method10866() {
		this.aClass86_Sub1_Sub1_8.method19557(this);
	}

	@OriginalMember(owner = "client!ahs", name = "u", descriptor = "()Z", line = 233)
	@Override
	public boolean method10572() {
		return false;
	}

	@OriginalMember(owner = "client!ahs", name = "aq", descriptor = "()Z", line = 233)
	@Override
	public boolean method10574() {
		return false;
	}

	@OriginalMember(owner = "client!ahs", name = "as", descriptor = "()Z", line = 233)
	@Override
	public boolean method10573() {
		return false;
	}

	@OriginalMember(owner = "client!ahs", name = "am", descriptor = "()Z", line = 233)
	@Override
	public boolean method10571() {
		return false;
	}

	@OriginalMember(owner = "client!ahs", name = "v", descriptor = "()V", line = 237)
	@Override
	public void method30322() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahs", name = "g", descriptor = "()V", line = 237)
	@Override
	public void method30319() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahs", name = "r", descriptor = "()V", line = 237)
	@Override
	public void method30321() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahs", name = "s", descriptor = "()V", line = 237)
	@Override
	public void method30320() {
		super.method30322();
	}
}
