package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import jagdx.p;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeg")
public class Class29_Sub1_Sub1 extends Class29_Sub1 implements Interface29 {

	@OriginalMember(owner = "client!aeg", name = "<init>", descriptor = "(Lclient!akw;Lclient!cw;Lclient!dj;II)V", line = 12)
	Class29_Sub1_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4, 1025, 0);
	}

	@OriginalMember(owner = "client!aeg", name = "ag", descriptor = "(I)Lclient!da;", line = 16)
	@Override
	public Interface10 method8963(@OriginalArg(0) int arg0) {
		return new Class297(this, arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "am", descriptor = "(I)Lclient!da;", line = 16)
	@Override
	public Interface10 method8964(@OriginalArg(0) int arg0) {
		return new Class297(this, arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "ar", descriptor = "(I)Lclient!da;", line = 16)
	@Override
	public Interface10 method8965(@OriginalArg(0) int arg0) {
		return new Class297(this, arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "ae", descriptor = "(I)Lclient!da;", line = 16)
	@Override
	public Interface10 method8966(@OriginalArg(0) int arg0) {
		return new Class297(this, arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "ad", descriptor = "(I)Lclient!da;", line = 16)
	@Override
	public Interface10 method8967(@OriginalArg(0) int arg0) {
		return new Class297(this, arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "z", descriptor = "(IIII[II)V", line = 20)
	@Override
	public void method8949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong27, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass21_Sub3_Sub2_8.aLong104, arg2, arg3, 21, 0, 0, true);
		if (p.method25092(IDirect3DDevice.StretchRect(this.aClass21_Sub3_Sub2_8.aLong104, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass21_Sub3_Sub2_8.aLong101);
			this.aClass21_Sub3_Sub2_8.aByteBuffer4.clear();
			this.aClass21_Sub3_Sub2_8.aByteBuffer4.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!aeg", name = "aj", descriptor = "(IIII[II)V", line = 20)
	@Override
	public void method8957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong27, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass21_Sub3_Sub2_8.aLong104, arg2, arg3, 21, 0, 0, true);
		if (p.method25092(IDirect3DDevice.StretchRect(this.aClass21_Sub3_Sub2_8.aLong104, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass21_Sub3_Sub2_8.aLong101);
			this.aClass21_Sub3_Sub2_8.aByteBuffer4.clear();
			this.aClass21_Sub3_Sub2_8.aByteBuffer4.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!aeg", name = "as", descriptor = "(IIII[II)V", line = 20)
	@Override
	public void method8958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong27, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass21_Sub3_Sub2_8.aLong104, arg2, arg3, 21, 0, 0, true);
		if (p.method25092(IDirect3DDevice.StretchRect(this.aClass21_Sub3_Sub2_8.aLong104, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass21_Sub3_Sub2_8.aLong101);
			this.aClass21_Sub3_Sub2_8.aByteBuffer4.clear();
			this.aClass21_Sub3_Sub2_8.aByteBuffer4.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!aeg", name = "p", descriptor = "()I", line = 32)
	@Override
	public int method8961() {
		return super.method8961();
	}

	@OriginalMember(owner = "client!aeg", name = "r", descriptor = "()I", line = 32)
	@Override
	public int method8941() {
		return super.method8961();
	}

	@OriginalMember(owner = "client!aeg", name = "d", descriptor = "()I", line = 32)
	@Override
	public int method8942() {
		return super.method8961();
	}

	@OriginalMember(owner = "client!aeg", name = "q", descriptor = "()I", line = 32)
	@Override
	public int method8943() {
		return super.method8961();
	}

	@OriginalMember(owner = "client!aeg", name = "m", descriptor = "()I", line = 32)
	@Override
	public int method8944() {
		return super.method8961();
	}

	@OriginalMember(owner = "client!aeg", name = "a", descriptor = "()I", line = 36)
	@Override
	public int method8931() {
		return super.method8931();
	}

	@OriginalMember(owner = "client!aeg", name = "t", descriptor = "()I", line = 36)
	@Override
	public int method8946() {
		return super.method8931();
	}

	@OriginalMember(owner = "client!aeg", name = "v", descriptor = "()I", line = 36)
	@Override
	public int method8945() {
		return super.method8931();
	}

	@OriginalMember(owner = "client!aeg", name = "l", descriptor = "(F)F", line = 40)
	@Override
	public float method8932(@OriginalArg(0) float arg0) {
		return super.method8932(arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "w", descriptor = "(F)F", line = 40)
	@Override
	public float method8954(@OriginalArg(0) float arg0) {
		return super.method8932(arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "o", descriptor = "(F)F", line = 44)
	@Override
	public float method8940(@OriginalArg(0) float arg0) {
		return super.method8933(arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "h", descriptor = "(F)F", line = 44)
	@Override
	public float method8933(@OriginalArg(0) float arg0) {
		return super.method8933(arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "i", descriptor = "(F)F", line = 44)
	@Override
	public float method8937(@OriginalArg(0) float arg0) {
		return super.method8933(arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "x", descriptor = "()Z", line = 48)
	@Override
	public boolean method8934() {
		return super.method8934();
	}

	@OriginalMember(owner = "client!aeg", name = "f", descriptor = "()Z", line = 48)
	@Override
	public boolean method8947() {
		return super.method8934();
	}

	@OriginalMember(owner = "client!aeg", name = "af", descriptor = "(ZZ)V", line = 52)
	@Override
	public void method8948(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method8951(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeg", name = "s", descriptor = "(ZZ)V", line = 52)
	@Override
	public void method8951(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method8951(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeg", name = "k", descriptor = "(ZZ)V", line = 52)
	@Override
	public void method8962(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method8951(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeg", name = "at", descriptor = "(ZZ)V", line = 52)
	@Override
	public void method8952(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method8951(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeg", name = "u", descriptor = "(IIII[III)V", line = 56)
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.method8935(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aeg", name = "ak", descriptor = "(IIII[III)V", line = 56)
	@Override
	public void method8950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.method8935(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aeg", name = "c", descriptor = "(IIII[BLclient!cw;II)V", line = 60)
	@Override
	public void method8936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method8936(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!aeg", name = "aa", descriptor = "(IIII[BLclient!cw;II)V", line = 60)
	@Override
	public void method8955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method8936(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!aeg", name = "an", descriptor = "(IIII[BLclient!cw;II)V", line = 60)
	@Override
	public void method8960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method8936(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!aeg", name = "ah", descriptor = "(IIII[BLclient!cw;II)V", line = 60)
	@Override
	public void method8956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method8936(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!aeg", name = "j", descriptor = "()F", line = 64)
	@Override
	public float method8938() {
		return super.method8938();
	}

	@OriginalMember(owner = "client!aeg", name = "ai", descriptor = "()F", line = 64)
	@Override
	public float method8959() {
		return super.method8938();
	}

	@OriginalMember(owner = "client!aeg", name = "n", descriptor = "()F", line = 68)
	@Override
	public float method8939() {
		return super.method8939();
	}

	@OriginalMember(owner = "client!aeg", name = "aq", descriptor = "()F", line = 68)
	@Override
	public float method8930() {
		return super.method8939();
	}

	@OriginalMember(owner = "client!aeg", name = "av", descriptor = "()F", line = 68)
	@Override
	public float method8953() {
		return super.method8939();
	}

	@OriginalMember(owner = "client!aeg", name = "e", descriptor = "()Z", line = 72)
	@Override
	public boolean method9883() {
		return super.method9883();
	}

	@OriginalMember(owner = "client!aeg", name = "ax", descriptor = "()Z", line = 72)
	@Override
	public boolean method9886() {
		return super.method9883();
	}

	@OriginalMember(owner = "client!aeg", name = "az", descriptor = "()Z", line = 72)
	@Override
	public boolean method9887() {
		return super.method9883();
	}

	@OriginalMember(owner = "client!aeg", name = "al", descriptor = "()Z", line = 72)
	@Override
	public boolean method9882() {
		return super.method9883();
	}

	@OriginalMember(owner = "client!aeg", name = "ao", descriptor = "()V", line = 76)
	@Override
	public void method9872() {
		super.method9872();
	}

	@OriginalMember(owner = "client!aeg", name = "ab", descriptor = "()V", line = 76)
	@Override
	public void method9868() {
		super.method9872();
	}

	@OriginalMember(owner = "client!aeg", name = "au", descriptor = "()V", line = 76)
	@Override
	public void method9873() {
		super.method9872();
	}

	@OriginalMember(owner = "client!aeg", name = "ay", descriptor = "(Lclient!jn;)V", line = 80)
	@Override
	public void method9874(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "ap", descriptor = "(Lclient!jn;)V", line = 80)
	@Override
	public void method9867(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!aeg", name = "g", descriptor = "()V", line = 84)
	@Override
	public void method27209() {
		super.method27209();
	}

	@OriginalMember(owner = "client!aeg", name = "y", descriptor = "()V", line = 84)
	@Override
	public void method27208() {
		super.method27209();
	}

	@OriginalMember(owner = "client!aeg", name = "b", descriptor = "()V", line = 84)
	@Override
	public void method27210() {
		super.method27209();
	}
}
