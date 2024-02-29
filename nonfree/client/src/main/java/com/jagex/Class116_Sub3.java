package com.jagex;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahw")
public class Class116_Sub3 extends Class116 implements Interface40 {

	@OriginalMember(owner = "client!ahw", name = "w", descriptor = "I")
	final int anInt1251;

	@OriginalMember(owner = "client!ahw", name = "<init>", descriptor = "(Lclient!apn;IZ[[I)V", line = 16)
	Class116_Sub3(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Class212.aClass212_18, Class206.aClass206_23, arg2 && arg0.aBoolean416, arg1 * arg1 * 6);
		this.anInt1251 = arg1;
		if (this.aBoolean220) {
			this.aLong42 = IDirect3DDevice.CreateCubeTexture(this.aClass86_Sub1_Sub1_8.aLong119, this.anInt1251, 0, 1024, 21, 1);
		} else {
			this.aLong42 = IDirect3DDevice.CreateCubeTexture(this.aClass86_Sub1_Sub1_8.aLong119, this.anInt1251, 1, 0, 21, 1);
		}
		@Pc(52) ByteBuffer local52 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		this.aClass86_Sub1_Sub1_8.method20393(this.anInt1251 * this.anInt1251 * 4);
		for (@Pc(64) int local64 = 0; local64 < 6; local64++) {
			local52.clear();
			local52.asIntBuffer().put(arg3[local64]);
			IDirect3DCubeTexture.Upload(this.aLong42, local64, 0, 0, 0, this.anInt1251, this.anInt1251, this.anInt1251 * 4, 0, this.aClass86_Sub1_Sub1_8.aLong121);
		}
	}

	@OriginalMember(owner = "client!ahw", name = "ab", descriptor = "()V", line = 32)
	@Override
	public void method10864() {
		this.aClass86_Sub1_Sub1_8.method19554(this);
	}

	@OriginalMember(owner = "client!ahw", name = "ay", descriptor = "()V", line = 32)
	@Override
	public void method10865() {
		this.aClass86_Sub1_Sub1_8.method19554(this);
	}

	@OriginalMember(owner = "client!ahw", name = "an", descriptor = "()V", line = 32)
	@Override
	public void method10867() {
		this.aClass86_Sub1_Sub1_8.method19554(this);
	}

	@OriginalMember(owner = "client!ahw", name = "aa", descriptor = "()V", line = 32)
	@Override
	public void method10868() {
		this.aClass86_Sub1_Sub1_8.method19554(this);
	}

	@OriginalMember(owner = "client!ahw", name = "ap", descriptor = "()V", line = 32)
	@Override
	public void method10866() {
		this.aClass86_Sub1_Sub1_8.method19554(this);
	}

	@OriginalMember(owner = "client!ahw", name = "g", descriptor = "()V", line = 36)
	@Override
	public void method30319() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahw", name = "r", descriptor = "()V", line = 36)
	@Override
	public void method30321() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahw", name = "s", descriptor = "()V", line = 36)
	@Override
	public void method30320() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahw", name = "v", descriptor = "()V", line = 36)
	@Override
	public void method30322() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahw", name = "af", descriptor = "(Lclient!lo;)V", line = 40)
	@Override
	public void method10856(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahw", name = "az", descriptor = "(Lclient!lo;)V", line = 40)
	@Override
	public void method10855(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahw", name = "aw", descriptor = "(Lclient!lo;)V", line = 40)
	@Override
	public void method10854(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}
}
