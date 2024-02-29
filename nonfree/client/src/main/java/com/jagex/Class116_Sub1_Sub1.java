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

@OriginalClass("client!ahd")
public class Class116_Sub1_Sub1 extends Class116_Sub1 implements Interface43 {

	@OriginalMember(owner = "client!ahd", name = "<init>", descriptor = "(Lclient!apn;Lclient!dt;Lclient!dl;II)V", line = 12)
	Class116_Sub1_Sub1(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4, 1025, 0);
	}

	@OriginalMember(owner = "client!ahd", name = "bj", descriptor = "(I)Lclient!df;", line = 16)
	@Override
	public Interface21 method10635(@OriginalArg(0) int arg0) {
		return new Class432(this, arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "bv", descriptor = "(I)Lclient!df;", line = 16)
	@Override
	public Interface21 method10634(@OriginalArg(0) int arg0) {
		return new Class432(this, arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "bc", descriptor = "(I)Lclient!df;", line = 16)
	@Override
	public Interface21 method10636(@OriginalArg(0) int arg0) {
		return new Class432(this, arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "d", descriptor = "(IIII[II)V", line = 20)
	@Override
	public void method10607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong42, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass86_Sub1_Sub1_8.aLong119, arg2, arg3, 21, 0, 0, true);
		this.aClass86_Sub1_Sub1_8.method20393(arg3 * arg2 * 4);
		if (p.method27710(IDirect3DDevice.StretchRect(this.aClass86_Sub1_Sub1_8.aLong119, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass86_Sub1_Sub1_8.aLong121);
			this.aClass86_Sub1_Sub1_8.aByteBuffer7.clear();
			this.aClass86_Sub1_Sub1_8.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!ahd", name = "ar", descriptor = "(IIII[II)V", line = 20)
	@Override
	public void method10628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong42, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass86_Sub1_Sub1_8.aLong119, arg2, arg3, 21, 0, 0, true);
		this.aClass86_Sub1_Sub1_8.method20393(arg3 * arg2 * 4);
		if (p.method27710(IDirect3DDevice.StretchRect(this.aClass86_Sub1_Sub1_8.aLong119, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass86_Sub1_Sub1_8.aLong121);
			this.aClass86_Sub1_Sub1_8.aByteBuffer7.clear();
			this.aClass86_Sub1_Sub1_8.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!ahd", name = "au", descriptor = "(IIII[II)V", line = 20)
	@Override
	public void method10604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong42, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass86_Sub1_Sub1_8.aLong119, arg2, arg3, 21, 0, 0, true);
		this.aClass86_Sub1_Sub1_8.method20393(arg3 * arg2 * 4);
		if (p.method27710(IDirect3DDevice.StretchRect(this.aClass86_Sub1_Sub1_8.aLong119, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass86_Sub1_Sub1_8.aLong121);
			this.aClass86_Sub1_Sub1_8.aByteBuffer7.clear();
			this.aClass86_Sub1_Sub1_8.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!ahd", name = "ax", descriptor = "(IIII[II)V", line = 20)
	@Override
	public void method10627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong42, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass86_Sub1_Sub1_8.aLong119, arg2, arg3, 21, 0, 0, true);
		this.aClass86_Sub1_Sub1_8.method20393(arg3 * arg2 * 4);
		if (p.method27710(IDirect3DDevice.StretchRect(this.aClass86_Sub1_Sub1_8.aLong119, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass86_Sub1_Sub1_8.aLong121);
			this.aClass86_Sub1_Sub1_8.aByteBuffer7.clear();
			this.aClass86_Sub1_Sub1_8.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!ahd", name = "s", descriptor = "()V", line = 33)
	@Override
	public void method30320() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahd", name = "r", descriptor = "()V", line = 33)
	@Override
	public void method30321() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahd", name = "v", descriptor = "()V", line = 33)
	@Override
	public void method30322() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahd", name = "g", descriptor = "()V", line = 33)
	@Override
	public void method30319() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahd", name = "p", descriptor = "()I", line = 37)
	@Override
	public int method10631() {
		return super.method10631();
	}

	@OriginalMember(owner = "client!ahd", name = "e", descriptor = "()I", line = 37)
	@Override
	public int method10612() {
		return super.method10631();
	}

	@OriginalMember(owner = "client!ahd", name = "f", descriptor = "()I", line = 37)
	@Override
	public int method10613() {
		return super.method10631();
	}

	@OriginalMember(owner = "client!ahd", name = "c", descriptor = "()I", line = 41)
	@Override
	public int method10603() {
		return super.method10603();
	}

	@OriginalMember(owner = "client!ahd", name = "o", descriptor = "()I", line = 41)
	@Override
	public int method10614() {
		return super.method10603();
	}

	@OriginalMember(owner = "client!ahd", name = "b", descriptor = "()I", line = 41)
	@Override
	public int method10615() {
		return super.method10603();
	}

	@OriginalMember(owner = "client!ahd", name = "l", descriptor = "(F)F", line = 45)
	@Override
	public float method10600(@OriginalArg(0) float arg0) {
		return super.method10600(arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "n", descriptor = "(F)F", line = 45)
	@Override
	public float method10616(@OriginalArg(0) float arg0) {
		return super.method10600(arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "y", descriptor = "(F)F", line = 49)
	@Override
	public float method10606(@OriginalArg(0) float arg0) {
		return super.method10606(arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "a", descriptor = "(F)F", line = 49)
	@Override
	public float method10617(@OriginalArg(0) float arg0) {
		return super.method10606(arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "w", descriptor = "()Z", line = 53)
	@Override
	public boolean method10602() {
		return super.method10602();
	}

	@OriginalMember(owner = "client!ahd", name = "m", descriptor = "()Z", line = 53)
	@Override
	public boolean method10621() {
		return super.method10602();
	}

	@OriginalMember(owner = "client!ahd", name = "t", descriptor = "(ZZ)V", line = 57)
	@Override
	public void method10618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method10618(arg0, arg1);
	}

	@OriginalMember(owner = "client!ahd", name = "h", descriptor = "(ZZ)V", line = 57)
	@Override
	public void method10601(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method10618(arg0, arg1);
	}

	@OriginalMember(owner = "client!ahd", name = "aj", descriptor = "(IIII[III)V", line = 61)
	@Override
	public void method10620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.method10630(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ahd", name = "q", descriptor = "(IIII[III)V", line = 61)
	@Override
	public void method10630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.method10630(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ahd", name = "x", descriptor = "(IIII[BLclient!dt;II)V", line = 65)
	@Override
	public void method10605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method10605(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ahd", name = "ag", descriptor = "(IIII[BLclient!dt;II)V", line = 65)
	@Override
	public void method10622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method10605(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ahd", name = "ai", descriptor = "(IIII[BLclient!dt;II)V", line = 65)
	@Override
	public void method10626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method10605(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ahd", name = "al", descriptor = "(IIII[BLclient!dt;II)V", line = 65)
	@Override
	public void method10619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method10605(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ahd", name = "ao", descriptor = "(IIII[BLclient!dt;II)V", line = 65)
	@Override
	public void method10624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method10605(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ahd", name = "ak", descriptor = "(IIII[BLclient!dt;II)V", line = 65)
	@Override
	public void method10625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method10605(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ahd", name = "z", descriptor = "(IIII[I[II)V", line = 69)
	@Override
	public void method10623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		super.method10623(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ahd", name = "ad", descriptor = "(IIII[I[II)V", line = 69)
	@Override
	public void method10629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		super.method10623(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ahd", name = "av", descriptor = "(IIIIII)V", line = 73)
	@Override
	public void method10599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.method10608(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ahd", name = "ac", descriptor = "(IIIIII)V", line = 73)
	@Override
	public void method10633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.method10608(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ahd", name = "j", descriptor = "(IIIIII)V", line = 73)
	@Override
	public void method10608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.method10608(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ahd", name = "i", descriptor = "()F", line = 77)
	@Override
	public float method10611() {
		return super.method10611();
	}

	@OriginalMember(owner = "client!ahd", name = "at", descriptor = "()F", line = 77)
	@Override
	public float method10609() {
		return super.method10611();
	}

	@OriginalMember(owner = "client!ahd", name = "k", descriptor = "()F", line = 81)
	@Override
	public float method10610() {
		return super.method10610();
	}

	@OriginalMember(owner = "client!ahd", name = "ae", descriptor = "()F", line = 81)
	@Override
	public float method10598() {
		return super.method10610();
	}

	@OriginalMember(owner = "client!ahd", name = "ah", descriptor = "()F", line = 81)
	@Override
	public float method10632() {
		return super.method10610();
	}

	@OriginalMember(owner = "client!ahd", name = "as", descriptor = "()Z", line = 85)
	@Override
	public boolean method10573() {
		return super.method10572();
	}

	@OriginalMember(owner = "client!ahd", name = "u", descriptor = "()Z", line = 85)
	@Override
	public boolean method10572() {
		return super.method10572();
	}

	@OriginalMember(owner = "client!ahd", name = "aq", descriptor = "()Z", line = 85)
	@Override
	public boolean method10574() {
		return super.method10572();
	}

	@OriginalMember(owner = "client!ahd", name = "am", descriptor = "()Z", line = 85)
	@Override
	public boolean method10571() {
		return super.method10572();
	}

	@OriginalMember(owner = "client!ahd", name = "ay", descriptor = "()V", line = 89)
	@Override
	public void method10865() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahd", name = "an", descriptor = "()V", line = 89)
	@Override
	public void method10867() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahd", name = "ab", descriptor = "()V", line = 89)
	@Override
	public void method10864() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahd", name = "aa", descriptor = "()V", line = 89)
	@Override
	public void method10868() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahd", name = "ap", descriptor = "()V", line = 89)
	@Override
	public void method10866() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahd", name = "af", descriptor = "(Lclient!lo;)V", line = 93)
	@Override
	public void method10856(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "aw", descriptor = "(Lclient!lo;)V", line = 93)
	@Override
	public void method10854(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "az", descriptor = "(Lclient!lo;)V", line = 93)
	@Override
	public void method10855(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}
}
