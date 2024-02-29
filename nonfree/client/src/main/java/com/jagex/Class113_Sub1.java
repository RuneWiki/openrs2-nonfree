package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!aha", name = "v", descriptor = "J")
	long aLong37 = 0L;

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "Lclient!apn;")
	Class86_Sub1_Sub1 aClass86_Sub1_Sub1_3;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Lclient!apn;[Lclient!lz;)V", line = 18)
	Class113_Sub1(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class391[] arg1) {
		super(arg1);
		this.aClass86_Sub1_Sub1_3 = arg0;
		@Pc(10) byte local10 = 0;
		@Pc(14) ByteBuffer local14 = this.aClass86_Sub1_Sub1_3.aByteBuffer7;
		local14.clear();
		for (@Pc(19) short local19 = 0; local19 < this.aClass391Array3.length; local19++) {
			@Pc(26) short local26 = 0;
			@Pc(31) Class391 local31 = this.aClass391Array3[local19];
			for (@Pc(33) int local33 = 0; local33 < local31.method28364(); local33++) {
				@Pc(41) Class366 local41 = local31.method28367(local33);
				if (local41 == Class366.aClass366_12) {
					this.method9659(local14, local19, local26, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				} else if (local41 == Class366.aClass366_1) {
					this.method9659(local14, local19, local26, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				} else if (local41 == Class366.aClass366_2) {
					this.method9659(local14, local19, local26, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				} else if (local41 == Class366.aClass366_3) {
					this.method9659(local14, local19, local26, (byte) 0, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class366.aClass366_4) {
					this.method9659(local14, local19, local26, (byte) 1, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class366.aClass366_10) {
					this.method9659(local14, local19, local26, (byte) 2, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class366.aClass366_5) {
					this.method9659(local14, local19, local26, (byte) 3, (byte) 0, (byte) 5, local10++);
				}
				local26 = (short) (local26 + local41.anInt4542);
			}
		}
		this.method9659(local14, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		this.aLong37 = IDirect3DDevice.CreateVertexDeclaration(this.aClass86_Sub1_Sub1_3.aLong119, this.aClass86_Sub1_Sub1_3.aLong121);
		this.aClass86_Sub1_Sub1_3.method20382(this);
	}

	@OriginalMember(owner = "client!aha", name = "p", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V", line = 44)
	void method9659(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V", line = 44)
	void method9660(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!aha", name = "v", descriptor = "()V", line = 53)
	@Override
	public void method30322() {
		if (this.aLong37 != 0L) {
			IUnknown.Release(this.aLong37);
			this.aLong37 = 0L;
		}
		this.aClass86_Sub1_Sub1_3.method20385(this);
	}

	@OriginalMember(owner = "client!aha", name = "s", descriptor = "()V", line = 53)
	@Override
	public void method30320() {
		if (this.aLong37 != 0L) {
			IUnknown.Release(this.aLong37);
			this.aLong37 = 0L;
		}
		this.aClass86_Sub1_Sub1_3.method20385(this);
	}

	@OriginalMember(owner = "client!aha", name = "g", descriptor = "()V", line = 53)
	@Override
	public void method30319() {
		if (this.aLong37 != 0L) {
			IUnknown.Release(this.aLong37);
			this.aLong37 = 0L;
		}
		this.aClass86_Sub1_Sub1_3.method20385(this);
	}

	@OriginalMember(owner = "client!aha", name = "r", descriptor = "()V", line = 53)
	@Override
	public void method30321() {
		if (this.aLong37 != 0L) {
			IUnknown.Release(this.aLong37);
			this.aLong37 = 0L;
		}
		this.aClass86_Sub1_Sub1_3.method20385(this);
	}

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "()V", line = 61)
	void method9661() {
		if (this.aLong37 != 0L) {
			this.aClass86_Sub1_Sub1_3.method19590(this.aLong37);
			this.aLong37 = 0L;
		}
	}

	@OriginalMember(owner = "client!aha", name = "y", descriptor = "()V", line = 61)
	void method9662() {
		if (this.aLong37 != 0L) {
			this.aClass86_Sub1_Sub1_3.method19590(this.aLong37);
			this.aLong37 = 0L;
		}
	}

	@OriginalMember(owner = "client!aha", name = "w", descriptor = "()V", line = 61)
	void method9663() {
		if (this.aLong37 != 0L) {
			this.aClass86_Sub1_Sub1_3.method19590(this.aLong37);
			this.aLong37 = 0L;
		}
	}

	@OriginalMember(owner = "client!aha", name = "t", descriptor = "()V", line = 61)
	void method9664() {
		if (this.aLong37 != 0L) {
			this.aClass86_Sub1_Sub1_3.method19590(this.aLong37);
			this.aLong37 = 0L;
		}
	}

	@OriginalMember(owner = "client!aha", name = "hp", descriptor = "()V", line = 68)
	void method9665() {
		this.method9661();
	}

	@OriginalMember(owner = "client!aha", name = "finalize", descriptor = "()V", line = 68)
	@Override
	void finalize() {
		this.method9661();
	}

	@OriginalMember(owner = "client!aha", name = "hc", descriptor = "()V", line = 68)
	void method9666() {
		this.method9661();
	}

	@OriginalMember(owner = "client!aha", name = "hd", descriptor = "()V", line = 68)
	void method9667() {
		this.method9661();
	}
}
