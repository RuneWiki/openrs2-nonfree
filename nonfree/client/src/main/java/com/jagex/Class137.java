package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public abstract class Class137 {

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "Lclient!er;")
	final Class232 aClass232_28 = new Class232(20);

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_41;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "([BI)[B", line = 9)
	public static byte[] method14101(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) byte[] local7 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "(Ljava/lang/Object;III)[B", line = 43)
	public static byte[] method14102(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return Arrays.copyOfRange(local11, arg1, arg1 + arg2);
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(24) ByteBuffer local24 = (ByteBuffer) arg0;
			@Pc(27) byte[] local27 = new byte[arg2];
			local24.position(arg1);
			local24.get(local27, 0, arg2);
			return local27;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!pw;)V", line = 214)
	Class137(@OriginalArg(0) Class478 arg0) {
		this.aClass478_41 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "()V", line = 219)
	void method14103() {
		@Pc(3) Class232 local3 = this.aClass232_28;
		synchronized (this.aClass232_28) {
			this.aClass232_28.method25850();
		}
	}

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "()V", line = 219)
	void method14104() {
		@Pc(3) Class232 local3 = this.aClass232_28;
		synchronized (this.aClass232_28) {
			this.aClass232_28.method25850();
		}
	}

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "()V", line = 219)
	void method14105() {
		@Pc(3) Class232 local3 = this.aClass232_28;
		synchronized (this.aClass232_28) {
			this.aClass232_28.method25850();
		}
	}

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "(I)V", line = 219)
	void method14106() {
		@Pc(3) Class232 local3 = this.aClass232_28;
		synchronized (this.aClass232_28) {
			this.aClass232_28.method25850();
		}
	}

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "(I)V", line = 225)
	void method14107(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_28;
		synchronized (this.aClass232_28) {
			this.aClass232_28.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(II)V", line = 225)
	void method14108(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_28;
		synchronized (this.aClass232_28) {
			this.aClass232_28.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "()V", line = 231)
	void method14109() {
		@Pc(3) Class232 local3 = this.aClass232_28;
		synchronized (this.aClass232_28) {
			this.aClass232_28.method25857();
		}
	}

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "(S)V", line = 231)
	void method14110() {
		@Pc(3) Class232 local3 = this.aClass232_28;
		synchronized (this.aClass232_28) {
			this.aClass232_28.method25857();
		}
	}

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "()V", line = 231)
	void method14111() {
		@Pc(3) Class232 local3 = this.aClass232_28;
		synchronized (this.aClass232_28) {
			this.aClass232_28.method25857();
		}
	}

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "()V", line = 231)
	void method14112() {
		@Pc(3) Class232 local3 = this.aClass232_28;
		synchronized (this.aClass232_28) {
			this.aClass232_28.method25857();
		}
	}

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "(S)V", line = 515)
	public static void method14113() {
		@Pc(2) Class232 local2 = Class628.aClass232_90;
		synchronized (Class628.aClass232_90) {
			Class628.aClass232_90.method25857();
		}
		local2 = Class628.aClass232_91;
		synchronized (Class628.aClass232_91) {
			Class628.aClass232_91.method25857();
		}
	}

	@OriginalMember(owner = "client!ut", name = "nc", descriptor = "(Lclient!yf;I)V", line = 7017)
	static final void method14114(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class131.method23062(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ut", name = "sp", descriptor = "(Lclient!yf;I)V", line = 7906)
	static final void method14115(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3891 * -495767299;
	}
}
