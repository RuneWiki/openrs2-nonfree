package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public class Class200 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Lclient!ew;")
	final Class161 aClass161_25 = new Class161(16);

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_37;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;)V", line = 14)
	public Class200(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_37 = arg2;
		this.aClass359_37.method26682(Class185.aClass185_36.anInt3631 * -1739932335);
	}

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "(II)Lclient!gx;", line = 21)
	public Class213 method24136(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_25;
		@Pc(11) Class213 local11;
		synchronized (this.aClass161_25) {
			local11 = (Class213) this.aClass161_25.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_37;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_37) {
			local38 = this.aClass359_37.method26713(Class185.aClass185_36.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class213();
		if (local38 != null) {
			local11.method24257(new Class3_Sub41(local38));
		}
		@Pc(63) Class161 local63 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)Lclient!gx;", line = 21)
	public Class213 method24139(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_25;
		@Pc(11) Class213 local11;
		synchronized (this.aClass161_25) {
			local11 = (Class213) this.aClass161_25.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_37;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_37) {
			local38 = this.aClass359_37.method26713(Class185.aClass185_36.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class213();
		if (local38 != null) {
			local11.method24257(new Class3_Sub41(local38));
		}
		@Pc(63) Class161 local63 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "(I)Lclient!gx;", line = 21)
	public Class213 method24140(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_25;
		@Pc(11) Class213 local11;
		synchronized (this.aClass161_25) {
			local11 = (Class213) this.aClass161_25.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_37;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_37) {
			local38 = this.aClass359_37.method26713(Class185.aClass185_36.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class213();
		if (local38 != null) {
			local11.method24257(new Class3_Sub41(local38));
		}
		@Pc(63) Class161 local63 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "(I)Lclient!gx;", line = 21)
	public Class213 method24141(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_25;
		@Pc(11) Class213 local11;
		synchronized (this.aClass161_25) {
			local11 = (Class213) this.aClass161_25.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_37;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_37) {
			local38 = this.aClass359_37.method26713(Class185.aClass185_36.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class213();
		if (local38 != null) {
			local11.method24257(new Class3_Sub41(local38));
		}
		@Pc(63) Class161 local63 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "(II)Lclient!ahu;", line = 22)
	public static Class63_Sub1 method24148(@OriginalArg(0) int arg0) {
		return Class490.aBoolean806 && arg0 >= Class400.anInt4803 * -812257991 && arg0 <= Class490.anInt5198 * -830555485 ? Class410.aClass63_Sub1Array1[arg0 - Class400.anInt4803 * -812257991] : null;
	}

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "()V", line = 38)
	public void method24135() {
		@Pc(3) Class161 local3 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23224();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 38)
	public void method24142() {
		@Pc(3) Class161 local3 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23224();
		}
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(IB)V", line = 44)
	public void method24137(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "(I)V", line = 44)
	public void method24143(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 44)
	public void method24144(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 44)
	public void method24145(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "(B)V", line = 50)
	public void method24138() {
		@Pc(3) Class161 local3 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23245();
		}
	}

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "()V", line = 50)
	public void method24146() {
		@Pc(3) Class161 local3 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23245();
		}
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "()V", line = 50)
	public void method24147() {
		@Pc(3) Class161 local3 = this.aClass161_25;
		synchronized (this.aClass161_25) {
			this.aClass161_25.method23245();
		}
	}

	@OriginalMember(owner = "client!gk", name = "gl", descriptor = "(I)Z", line = 3552)
	static boolean method24151() {
		return client.aBoolean587;
	}

	@OriginalMember(owner = "client!gk", name = "ack", descriptor = "(Lclient!vs;I)V", line = 9107)
	static final void method24149(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class44_Sub3.aClass596_1.method33435(local12).aString243;
	}

	@OriginalMember(owner = "client!gk", name = "aud", descriptor = "(Lclient!vs;I)V", line = 12515)
	static final void method24150(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(29) Class534 local29;
		if (arg0.aBoolean822) {
			local29 = arg0.aClass534_2;
		} else {
			local29 = arg0.aClass534_1;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local29.method32521(arg0.aClass26_Sub1_Sub1_Sub1_4.aClass186_3, local13, local23) ? 1 : 0;
	}
}
