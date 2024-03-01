package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public class Class428 {

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!dx;")
	static Class15 aClass15_2;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!rx;")
	public static final Class445 aClass445_1 = new Class445();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!ew;")
	final Class161 aClass161_39 = new Class161(64);

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_72;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Lclient!tr;")
	final Class489 aClass489_1;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Lclient!tr;)V", line = 17)
	public Class428(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class489 arg3) {
		this.aClass359_72 = arg2;
		this.aClass359_72.method26682(Class185.aClass185_38.anInt3631 * -1739932335);
		this.aClass489_1 = arg3;
	}

	@OriginalMember(owner = "client!re", name = "p", descriptor = "(II)Lclient!rx;", line = 25)
	public Class445 method27917(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_39;
		@Pc(11) Class445 local11;
		synchronized (this.aClass161_39) {
			local11 = (Class445) this.aClass161_39.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_72;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_72) {
			local38 = this.aClass359_72.method26713(Class185.aClass185_38.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class445();
		local11.aClass428_2 = this;
		if (local38 != null) {
			local11.method28321(new Class3_Sub41(local38));
		}
		@Pc(66) Class161 local66 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(I)Lclient!rx;", line = 25)
	public Class445 method27919(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_39;
		@Pc(11) Class445 local11;
		synchronized (this.aClass161_39) {
			local11 = (Class445) this.aClass161_39.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_72;
		@Pc(38) byte[] local38;
		synchronized (this.aClass359_72) {
			local38 = this.aClass359_72.method26713(Class185.aClass185_38.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class445();
		local11.aClass428_2 = this;
		if (local38 != null) {
			local11.method28321(new Class3_Sub41(local38));
		}
		@Pc(66) Class161 local66 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 43)
	public void method27916() {
		@Pc(3) Class161 local3 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23224();
		}
	}

	@OriginalMember(owner = "client!re", name = "x", descriptor = "()V", line = 43)
	public void method27920() {
		@Pc(3) Class161 local3 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23224();
		}
	}

	@OriginalMember(owner = "client!re", name = "s", descriptor = "()V", line = 43)
	public void method27921() {
		@Pc(3) Class161 local3 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23224();
		}
	}

	@OriginalMember(owner = "client!re", name = "u", descriptor = "()V", line = 43)
	public void method27923() {
		@Pc(3) Class161 local3 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23224();
		}
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(II)V", line = 49)
	public void method27915(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "y", descriptor = "(I)V", line = 49)
	public void method27922(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()V", line = 55)
	public void method27914() {
		@Pc(3) Class161 local3 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23245();
		}
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(I)V", line = 55)
	public void method27918() {
		@Pc(3) Class161 local3 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23245();
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()V", line = 55)
	public void method27924() {
		@Pc(3) Class161 local3 = this.aClass161_39;
		synchronized (this.aClass161_39) {
			this.aClass161_39.method23245();
		}
	}

	@OriginalMember(owner = "client!re", name = "amv", descriptor = "(Lclient!vs;B)V", line = 11340)
	static final void method27925(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1 ? 1 : 0);
		client.aClass370_1.method26968();
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
