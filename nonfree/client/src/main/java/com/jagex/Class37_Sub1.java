package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adm")
public class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!adm", name = "g", descriptor = "J")
	long aLong21 = 0L;

	@OriginalMember(owner = "client!adm", name = "a", descriptor = "Lclient!akw;")
	Class21_Sub3_Sub2 aClass21_Sub3_Sub2_5;

	@OriginalMember(owner = "client!adm", name = "<init>", descriptor = "(Lclient!akw;[Lclient!jb;)V", line = 18)
	Class37_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class252[] arg1) {
		super(arg1);
		this.aClass21_Sub3_Sub2_5 = arg0;
		@Pc(10) byte local10 = 0;
		@Pc(14) ByteBuffer local14 = this.aClass21_Sub3_Sub2_5.aByteBuffer4;
		local14.clear();
		for (@Pc(19) short local19 = 0; local19 < this.aClass252Array3.length; local19++) {
			@Pc(26) short local26 = 0;
			@Pc(31) Class252 local31 = this.aClass252Array3[local19];
			for (@Pc(33) int local33 = 0; local33 < local31.method25198(); local33++) {
				@Pc(41) Class240 local41 = local31.method25199(local33);
				if (local41 == Class240.aClass240_11) {
					this.method7863(local14, local19, local26, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				} else if (local41 == Class240.aClass240_2) {
					this.method7863(local14, local19, local26, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				} else if (local41 == Class240.aClass240_5) {
					this.method7863(local14, local19, local26, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				} else if (local41 == Class240.aClass240_3) {
					this.method7863(local14, local19, local26, (byte) 0, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class240.aClass240_7) {
					this.method7863(local14, local19, local26, (byte) 1, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class240.aClass240_1) {
					this.method7863(local14, local19, local26, (byte) 2, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class240.aClass240_6) {
					this.method7863(local14, local19, local26, (byte) 3, (byte) 0, (byte) 5, local10++);
				}
				local26 = (short) (local26 + local41.anInt3760);
			}
		}
		this.method7863(local14, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		this.aLong21 = IDirect3DDevice.CreateVertexDeclaration(this.aClass21_Sub3_Sub2_5.aLong104, this.aClass21_Sub3_Sub2_5.aLong101);
		this.aClass21_Sub3_Sub2_5.method17583(this);
	}

	@OriginalMember(owner = "client!adm", name = "p", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V", line = 44)
	void method7863(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!adm", name = "l", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V", line = 44)
	void method7865(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!adm", name = "b", descriptor = "()V", line = 53)
	@Override
	public void method27210() {
		if (this.aLong21 != 0L) {
			IUnknown.Release(this.aLong21);
			this.aLong21 = 0L;
		}
		this.aClass21_Sub3_Sub2_5.method17430(this);
	}

	@OriginalMember(owner = "client!adm", name = "g", descriptor = "()V", line = 53)
	@Override
	public void method27209() {
		if (this.aLong21 != 0L) {
			IUnknown.Release(this.aLong21);
			this.aLong21 = 0L;
		}
		this.aClass21_Sub3_Sub2_5.method17430(this);
	}

	@OriginalMember(owner = "client!adm", name = "y", descriptor = "()V", line = 53)
	@Override
	public void method27208() {
		if (this.aLong21 != 0L) {
			IUnknown.Release(this.aLong21);
			this.aLong21 = 0L;
		}
		this.aClass21_Sub3_Sub2_5.method17430(this);
	}

	@OriginalMember(owner = "client!adm", name = "a", descriptor = "()V", line = 61)
	void method7862() {
		if (this.aLong21 != 0L) {
			this.aClass21_Sub3_Sub2_5.method17837(this.aLong21);
			this.aLong21 = 0L;
		}
	}

	@OriginalMember(owner = "client!adm", name = "h", descriptor = "()V", line = 61)
	void method7864() {
		if (this.aLong21 != 0L) {
			this.aClass21_Sub3_Sub2_5.method17837(this.aLong21);
			this.aLong21 = 0L;
		}
	}

	@OriginalMember(owner = "client!adm", name = "x", descriptor = "()V", line = 61)
	void method7866() {
		if (this.aLong21 != 0L) {
			this.aClass21_Sub3_Sub2_5.method17837(this.aLong21);
			this.aLong21 = 0L;
		}
	}

	@OriginalMember(owner = "client!adm", name = "s", descriptor = "()V", line = 61)
	void method7867() {
		if (this.aLong21 != 0L) {
			this.aClass21_Sub3_Sub2_5.method17837(this.aLong21);
			this.aLong21 = 0L;
		}
	}

	@OriginalMember(owner = "client!adm", name = "hh", descriptor = "()V", line = 68)
	void method7861() {
		this.method7862();
	}

	@OriginalMember(owner = "client!adm", name = "finalize", descriptor = "()V", line = 68)
	@Override
	void finalize() {
		this.method7862();
	}
}
