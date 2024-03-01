package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public class Class523 {

	@OriginalMember(owner = "client!vd", name = "jn", descriptor = "I")
	static int anInt5297;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	int anInt5296;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!ew;")
	final Class161 aClass161_59 = new Class161(64);

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!ew;")
	final Class161 aClass161_60 = new Class161(60);

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_96;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_95;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Lclient!ny;)V", line = 18)
	public Class523(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class359 arg3) {
		this.aClass359_96 = arg2;
		this.aClass359_95 = arg3;
		@Pc(26) int local26 = this.aClass359_96.method26683() - 1;
		Class185.aClass185_19.method23905();
		this.aClass359_96.method26682(local26);
	}

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "(II)Lclient!va;", line = 28)
	public Class520 method29823(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_59;
		@Pc(11) Class520 local11;
		synchronized (this.aClass161_59) {
			local11 = (Class520) this.aClass161_59.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_96;
		@Pc(41) byte[] local41;
		synchronized (this.aClass359_96) {
			local41 = this.aClass359_96.method26713(Class185.aClass185_19.method23906(arg0), Class185.aClass185_19.method23908(arg0));
		}
		local11 = new Class520();
		local11.aClass523_15 = this;
		local11.anInt5287 = arg0 * -73138039;
		if (local41 != null) {
			local11.method29760(new Class3_Sub41(local41));
		}
		@Pc(74) Class161 local74 = this.aClass161_59;
		synchronized (this.aClass161_59) {
			this.aClass161_59.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "(I)V", line = 47)
	public void method29821(@OriginalArg(0) int arg0) {
		this.anInt5296 = arg0 * -1344516133;
		@Pc(8) Class161 local8 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23224();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 47)
	public void method29829(@OriginalArg(0) int arg0) {
		this.anInt5296 = arg0 * -1344516133;
		@Pc(8) Class161 local8 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23224();
		}
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V", line = 54)
	public void method29822() {
		@Pc(3) Class161 local3 = this.aClass161_59;
		synchronized (this.aClass161_59) {
			this.aClass161_59.method23224();
		}
		local3 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23224();
		}
	}

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "()V", line = 54)
	public void method29826() {
		@Pc(3) Class161 local3 = this.aClass161_59;
		synchronized (this.aClass161_59) {
			this.aClass161_59.method23224();
		}
		local3 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23224();
		}
	}

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "()V", line = 54)
	public void method29827() {
		@Pc(3) Class161 local3 = this.aClass161_59;
		synchronized (this.aClass161_59) {
			this.aClass161_59.method23224();
		}
		local3 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23224();
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 63)
	public void method29820(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_59;
		synchronized (this.aClass161_59) {
			this.aClass161_59.method23240(arg0);
		}
		local3 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "(II)V", line = 63)
	public void method29824(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_59;
		synchronized (this.aClass161_59) {
			this.aClass161_59.method23240(arg0);
		}
		local3 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "(I)V", line = 63)
	public void method29828(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_59;
		synchronized (this.aClass161_59) {
			this.aClass161_59.method23240(arg0);
		}
		local3 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)Lclient!amq;", line = 66)
	static Class3_Sub1_Sub11 method29833() {
		@Pc(4) Class3_Sub1_Sub11 local4 = (Class3_Sub1_Sub11) Class3_Sub1_Sub11.aClass546_10.method32623();
		if (local4 != null) {
			local4.method33656();
			local4.method33669();
			return local4;
		}
		do {
			local4 = (Class3_Sub1_Sub11) Class3_Sub1_Sub11.aClass546_11.method32623();
			if (local4 == null) {
				return null;
			}
			if (local4.method19131() > Class176.method23413()) {
				return null;
			}
			local4.method33656();
			local4.method33669();
		} while ((local4.aLong297 * -2884094411549009029L & Long.MIN_VALUE) == 0L);
		return local4;
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "(B)V", line = 72)
	public void method29825() {
		@Pc(3) Class161 local3 = this.aClass161_59;
		synchronized (this.aClass161_59) {
			this.aClass161_59.method23245();
		}
		local3 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23245();
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()V", line = 72)
	public void method29830() {
		@Pc(3) Class161 local3 = this.aClass161_59;
		synchronized (this.aClass161_59) {
			this.aClass161_59.method23245();
		}
		local3 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23245();
		}
	}

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "()V", line = 72)
	public void method29831() {
		@Pc(3) Class161 local3 = this.aClass161_59;
		synchronized (this.aClass161_59) {
			this.aClass161_59.method23245();
		}
		local3 = this.aClass161_60;
		synchronized (this.aClass161_60) {
			this.aClass161_60.method23245();
		}
	}

	@OriginalMember(owner = "client!vd", name = "aly", descriptor = "(Lclient!vs;I)V", line = 11103)
	static final void method29832(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		Class273.method25349(local13);
	}
}
