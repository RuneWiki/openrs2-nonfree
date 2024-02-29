package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahr")
public class Class116_Sub2 extends Class116 implements Interface34 {

	@OriginalMember(owner = "client!ahr", name = "w", descriptor = "I")
	final int anInt1236;

	@OriginalMember(owner = "client!ahr", name = "t", descriptor = "I")
	final int anInt1235;

	@OriginalMember(owner = "client!ahr", name = "q", descriptor = "I")
	final int anInt1237;

	@OriginalMember(owner = "client!ahr", name = "<init>", descriptor = "(Lclient!apn;Lclient!dt;IIIZ[B)V", line = 17)
	Class116_Sub2(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6) {
		super(arg0, arg1, Class206.aClass206_23, false, arg2 * arg3 * arg4);
		this.anInt1236 = arg2;
		this.anInt1235 = arg3;
		this.anInt1237 = arg4;
		this.aLong42 = IDirect3DDevice.CreateVolumeTexture(this.aClass86_Sub1_Sub1_8.aLong119, arg2, arg3, arg4, 1, 0, Class86_Sub1_Sub1.method19578(arg1, this.aClass206_15), 1);
		this.aClass86_Sub1_Sub1_8.method20393(this.anInt1236 * this.anInt1235 * arg1.anInt3679 * 1676120375);
		@Pc(52) ByteBuffer local52 = this.aClass86_Sub1_Sub1_8.aByteBuffer7;
		local52.clear();
		local52.put(arg6);
		IDirect3DVolumeTexture.Upload(this.aLong42, 0, 0, 0, 0, this.anInt1236, this.anInt1235, this.anInt1237, this.anInt1236 * arg1.anInt3679 * 1676120375, 0, this.aClass86_Sub1_Sub1_8.aLong121);
	}

	@OriginalMember(owner = "client!ahr", name = "ba", descriptor = "()J", line = 30)
	@Override
	long method10852() {
		return this.aLong42;
	}

	@OriginalMember(owner = "client!ahr", name = "bb", descriptor = "()J", line = 30)
	@Override
	long method10853() {
		return this.aLong42;
	}

	@OriginalMember(owner = "client!ahr", name = "aa", descriptor = "()V", line = 34)
	@Override
	public void method10868() {
		this.aClass86_Sub1_Sub1_8.method19558(this);
	}

	@OriginalMember(owner = "client!ahr", name = "ay", descriptor = "()V", line = 34)
	@Override
	public void method10865() {
		this.aClass86_Sub1_Sub1_8.method19558(this);
	}

	@OriginalMember(owner = "client!ahr", name = "an", descriptor = "()V", line = 34)
	@Override
	public void method10867() {
		this.aClass86_Sub1_Sub1_8.method19558(this);
	}

	@OriginalMember(owner = "client!ahr", name = "ab", descriptor = "()V", line = 34)
	@Override
	public void method10864() {
		this.aClass86_Sub1_Sub1_8.method19558(this);
	}

	@OriginalMember(owner = "client!ahr", name = "ap", descriptor = "()V", line = 34)
	@Override
	public void method10866() {
		this.aClass86_Sub1_Sub1_8.method19558(this);
	}

	@OriginalMember(owner = "client!ahr", name = "af", descriptor = "(Lclient!lo;)V", line = 38)
	@Override
	public void method10856(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahr", name = "az", descriptor = "(Lclient!lo;)V", line = 38)
	@Override
	public void method10855(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahr", name = "aw", descriptor = "(Lclient!lo;)V", line = 38)
	@Override
	public void method10854(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahr", name = "s", descriptor = "()V", line = 42)
	@Override
	public void method30320() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahr", name = "v", descriptor = "()V", line = 42)
	@Override
	public void method30322() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahr", name = "r", descriptor = "()V", line = 42)
	@Override
	public void method30321() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahr", name = "g", descriptor = "()V", line = 42)
	@Override
	public void method30319() {
		super.method30322();
	}
}
