package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajd")
public class Class70_Sub1_Sub1 extends Class70_Sub1 {

	@OriginalMember(owner = "client!ajd", name = "l", descriptor = "Lclient!ew;")
	final Class161 aClass161_11 = new Class161(64);

	@OriginalMember(owner = "client!ajd", name = "g", descriptor = "Lclient!ny;")
	final Class359 aClass359_21;

	@OriginalMember(owner = "client!ajd", name = "<init>", descriptor = "(Lclient!vz;Lclient!nw;Lclient!vk;Lclient!ny;)V", line = 16)
	public Class70_Sub1_Sub1(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class530 arg2, @OriginalArg(3) Class359 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method26682(arg1.method9491().anInt3631 * -1739932335));
		this.aClass359_21 = arg3;
	}

	@OriginalMember(owner = "client!ajd", name = "c", descriptor = "(I)Lclient!cy;", line = 22)
	@Override
	public Class11 method14720(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			@Pc(11) Class11_Sub1 local11 = (Class11_Sub1) this.aClass161_11.method23219((long) arg0);
			if (local11 == null) {
				@Pc(26) byte[] local26 = this.aClass359_21.method26713(this.aClass43_72.method9491().anInt3631 * -1739932335, arg0);
				local11 = new Class11_Sub1(this.aClass43_72, arg0);
				if (local26 != null) {
					local11.method1199(new Class3_Sub41(local26));
				}
				this.aClass161_11.method23222(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ajd", name = "b", descriptor = "(I)Lclient!cy;", line = 22)
	@Override
	public Class11 method14719(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			@Pc(11) Class11_Sub1 local11 = (Class11_Sub1) this.aClass161_11.method23219((long) arg0);
			if (local11 == null) {
				@Pc(26) byte[] local26 = this.aClass359_21.method26713(this.aClass43_72.method9491().anInt3631 * -1739932335, arg0);
				local11 = new Class11_Sub1(this.aClass43_72, arg0);
				if (local26 != null) {
					local11.method1199(new Class3_Sub41(local26));
				}
				this.aClass161_11.method23222(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ajd", name = "g", descriptor = "(II)Lclient!cy;", line = 22)
	@Override
	public Class11 method14717(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			@Pc(11) Class11_Sub1 local11 = (Class11_Sub1) this.aClass161_11.method23219((long) arg0);
			if (local11 == null) {
				@Pc(26) byte[] local26 = this.aClass359_21.method26713(this.aClass43_72.method9491().anInt3631 * -1739932335, arg0);
				local11 = new Class11_Sub1(this.aClass43_72, arg0);
				if (local26 != null) {
					local11.method1199(new Class3_Sub41(local26));
				}
				this.aClass161_11.method23222(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!ajd", name = "i", descriptor = "(I)V", line = 35)
	public void method14252() {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23224();
		}
	}

	@OriginalMember(owner = "client!ajd", name = "af", descriptor = "()V", line = 35)
	public void method14256() {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23224();
		}
	}

	@OriginalMember(owner = "client!ajd", name = "ak", descriptor = "()V", line = 35)
	public void method14257() {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23224();
		}
	}

	@OriginalMember(owner = "client!ajd", name = "at", descriptor = "()V", line = 35)
	public void method14260() {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23224();
		}
	}

	@OriginalMember(owner = "client!ajd", name = "f", descriptor = "(II)V", line = 41)
	public void method14253(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ajd", name = "aj", descriptor = "(I)V", line = 41)
	public void method14255(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ajd", name = "aa", descriptor = "(I)V", line = 41)
	public void method14258(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ajd", name = "ah", descriptor = "(I)V", line = 41)
	public void method14259(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ajd", name = "an", descriptor = "(I)V", line = 41)
	public void method14261(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!ajd", name = "k", descriptor = "(I)V", line = 47)
	public void method14254() {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23245();
		}
	}

	@OriginalMember(owner = "client!ajd", name = "as", descriptor = "()V", line = 47)
	public void method14262() {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23245();
		}
	}

	@OriginalMember(owner = "client!ajd", name = "ai", descriptor = "()V", line = 47)
	public void method14263() {
		@Pc(3) Class161 local3 = this.aClass161_11;
		synchronized (this.aClass161_11) {
			this.aClass161_11.method23245();
		}
	}

	@OriginalMember(owner = "client!ajd", name = "h", descriptor = "(B)V", line = 92)
	static void method14264() {
		if (Class67.aFileOutputStream1 != null) {
			try {
				Class67.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Class67.aFileOutputStream1 = null;
	}
}
