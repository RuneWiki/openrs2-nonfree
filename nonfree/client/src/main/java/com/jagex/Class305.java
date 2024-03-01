package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.p;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public class Class305 implements Interface30 {

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
	int anInt4429;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
	int anInt4430;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "J")
	long aLong260 = 0L;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "Lclient!akw;")
	final Class21_Sub3_Sub2 aClass21_Sub3_Sub2_12;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "Lclient!dj;")
	final Class127 aClass127_29;

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "Z")
	final boolean aBoolean712;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!akw;Lclient!dj;Z)V", line = 18)
	Class305(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass21_Sub3_Sub2_12 = arg0;
		this.aClass127_29 = arg1;
		this.aBoolean712 = arg2;
		this.aClass21_Sub3_Sub2_12.method17583(this);
	}

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "()I", line = 26)
	@Override
	public int method25704() {
		return this.anInt4430;
	}

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "()I", line = 26)
	@Override
	public int method25706() {
		return this.anInt4430;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "()I", line = 26)
	@Override
	public int method25714() {
		return this.anInt4430;
	}

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "()I", line = 26)
	@Override
	public int method25709() {
		return this.anInt4430;
	}

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "()Lclient!dj;", line = 30)
	@Override
	public Class127 method25721() {
		return this.aClass127_29;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()Lclient!dj;", line = 30)
	@Override
	public Class127 method25722() {
		return this.aClass127_29;
	}

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "(I)V", line = 34)
	@Override
	public void method25720(@OriginalArg(0) int arg0) {
		this.anInt4430 = this.aClass127_29.anInt3315 * -1246993659 * arg0;
		if (this.anInt4430 <= this.anInt4429) {
			return;
		}
		if (this.aLong260 != 0L) {
			IUnknown.Release(this.aLong260);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean712) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong260 = IDirect3DDevice.CreateIndexBuffer(this.aClass21_Sub3_Sub2_12.aLong104, this.anInt4430, local24, this.aClass127_29 == Class127.aClass127_21 ? 101 : 102, local29);
		this.anInt4429 = this.anInt4430;
	}

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "(I)V", line = 34)
	@Override
	public void method25724(@OriginalArg(0) int arg0) {
		this.anInt4430 = this.aClass127_29.anInt3315 * -1246993659 * arg0;
		if (this.anInt4430 <= this.anInt4429) {
			return;
		}
		if (this.aLong260 != 0L) {
			IUnknown.Release(this.aLong260);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean712) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong260 = IDirect3DDevice.CreateIndexBuffer(this.aClass21_Sub3_Sub2_12.aLong104, this.anInt4430, local24, this.aClass127_29 == Class127.aClass127_21 ? 101 : 102, local29);
		this.anInt4429 = this.anInt4430;
	}

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "(I)V", line = 34)
	@Override
	public void method25723(@OriginalArg(0) int arg0) {
		this.anInt4430 = this.aClass127_29.anInt3315 * -1246993659 * arg0;
		if (this.anInt4430 <= this.anInt4429) {
			return;
		}
		if (this.aLong260 != 0L) {
			IUnknown.Release(this.aLong260);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean712) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong260 = IDirect3DDevice.CreateIndexBuffer(this.aClass21_Sub3_Sub2_12.aLong104, this.anInt4430, local24, this.aClass127_29 == Class127.aClass127_21 ? 101 : 102, local29);
		this.anInt4429 = this.anInt4430;
	}

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "(I)V", line = 34)
	@Override
	public void method25725(@OriginalArg(0) int arg0) {
		this.anInt4430 = this.aClass127_29.anInt3315 * -1246993659 * arg0;
		if (this.anInt4430 <= this.anInt4429) {
			return;
		}
		if (this.aLong260 != 0L) {
			IUnknown.Release(this.aLong260);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean712) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong260 = IDirect3DDevice.CreateIndexBuffer(this.aClass21_Sub3_Sub2_12.aLong104, this.anInt4430, local24, this.aClass127_29 == Class127.aClass127_21 ? 101 : 102, local29);
		this.anInt4429 = this.anInt4430;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(II)J", line = 52)
	@Override
	public long method25713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong260, arg0, arg1, this.aBoolean712 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "(II)J", line = 52)
	@Override
	public long method25710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong260, arg0, arg1, this.aBoolean712 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "(II)J", line = 52)
	@Override
	public long method25708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong260, arg0, arg1, this.aBoolean712 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "()V", line = 56)
	@Override
	public void method25707() {
		IDirect3DIndexBuffer.Unlock(this.aLong260);
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "()V", line = 56)
	@Override
	public void method25715() {
		IDirect3DIndexBuffer.Unlock(this.aLong260);
	}

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "()V", line = 56)
	@Override
	public void method25716() {
		IDirect3DIndexBuffer.Unlock(this.aLong260);
	}

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "(IIJ)Z", line = 60)
	@Override
	public boolean method25705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method25092(IDirect3DIndexBuffer.Upload(this.aLong260, arg0, arg1, this.aBoolean712 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "(IIJ)Z", line = 60)
	@Override
	public boolean method25711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method25092(IDirect3DIndexBuffer.Upload(this.aLong260, arg0, arg1, this.aBoolean712 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "(IIJ)Z", line = 60)
	@Override
	public boolean method25712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method25092(IDirect3DIndexBuffer.Upload(this.aLong260, arg0, arg1, this.aBoolean712 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "()V", line = 64)
	@Override
	public void method27209() {
		if (this.aLong260 != 0L) {
			IUnknown.Release(this.aLong260);
			this.aLong260 = 0L;
		}
		this.anInt4429 = 0;
		this.anInt4430 = 0;
		this.aClass21_Sub3_Sub2_12.method17430(this);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "()V", line = 64)
	@Override
	public void method27210() {
		if (this.aLong260 != 0L) {
			IUnknown.Release(this.aLong260);
			this.aLong260 = 0L;
		}
		this.anInt4429 = 0;
		this.anInt4430 = 0;
		this.aClass21_Sub3_Sub2_12.method17430(this);
	}

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "()V", line = 64)
	@Override
	public void method27208() {
		if (this.aLong260 != 0L) {
			IUnknown.Release(this.aLong260);
			this.aLong260 = 0L;
		}
		this.anInt4429 = 0;
		this.anInt4430 = 0;
		this.aClass21_Sub3_Sub2_12.method17430(this);
	}

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "()V", line = 74)
	void method25726() {
		if (this.aLong260 != 0L) {
			this.aClass21_Sub3_Sub2_12.method17837(this.aLong260);
			this.aLong260 = 0L;
		}
		this.anInt4429 = 0;
		this.anInt4430 = 0;
	}

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "()V", line = 74)
	void method25728() {
		if (this.aLong260 != 0L) {
			this.aClass21_Sub3_Sub2_12.method17837(this.aLong260);
			this.aLong260 = 0L;
		}
		this.anInt4429 = 0;
		this.anInt4430 = 0;
	}

	@OriginalMember(owner = "client!lr", name = "finalize", descriptor = "()V", line = 83)
	@Override
	void finalize() {
		this.method25726();
	}

	@OriginalMember(owner = "client!lr", name = "hh", descriptor = "()V", line = 83)
	void method25727() {
		this.method25726();
	}
}
