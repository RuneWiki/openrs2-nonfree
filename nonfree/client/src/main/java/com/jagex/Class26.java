package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public class Class26 {

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Lclient!mj;")
	Class322 aClass322_64 = new Class322();

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "Lclient!mj;")
	Class322 aClass322_66 = new Class322();

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Z")
	boolean aBoolean525 = true;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Lclient!mj;")
	Class322 aClass322_65 = new Class322();

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Z")
	boolean aBoolean522 = true;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "Lclient!mu;")
	Class332 aClass332_50;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "Z")
	boolean aBoolean523;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "Z")
	protected boolean aBoolean524;

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "Lclient!uk;")
	Class26 aClass26_64;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "Lclient!uk;")
	Class26 aClass26_65;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "Lclient!uk;")
	Class26 aClass26_66;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 27)
	Class26() {
		new Class328();
		new Class328();
		this.aClass332_50 = new Class332();
		this.aBoolean523 = true;
		this.aBoolean524 = true;
		this.aClass26_64 = null;
		this.aClass26_65 = null;
		this.aClass26_66 = null;
	}

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "()Lclient!mj;", line = 30)
	public final Class322 method21430() {
		return this.aClass322_64;
	}

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "()Lclient!mj;", line = 34)
	public final Class322 method21431() {
		if (this.aBoolean525) {
			this.aBoolean525 = false;
			this.aClass322_66.method25982(this.aClass322_64);
			if (this.aClass26_64 != null) {
				this.aClass322_66.method25984(this.aClass26_64.method21431());
			}
		}
		return this.aClass322_66;
	}

	@OriginalMember(owner = "client!uk", name = "as", descriptor = "()Lclient!mj;", line = 43)
	final Class322 method21442() {
		if (this.aBoolean522) {
			this.aBoolean522 = false;
			this.aClass322_65.method25982(this.method21431());
			this.aClass322_65.method25983();
		}
		return this.aClass322_66;
	}

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "()Lclient!mj;", line = 43)
	final Class322 method21448() {
		if (this.aBoolean522) {
			this.aBoolean522 = false;
			this.aClass322_65.method25982(this.method21431());
			this.aClass322_65.method25983();
		}
		return this.aClass322_66;
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "()Lclient!mu;", line = 52)
	final Class332 method21433() {
		if (this.aBoolean523) {
			this.aBoolean523 = false;
			this.aClass332_50.method26188(this.method21431());
		}
		return this.aClass332_50;
	}

	@OriginalMember(owner = "client!uk", name = "ai", descriptor = "()Lclient!mu;", line = 52)
	final Class332 method21443() {
		if (this.aBoolean523) {
			this.aBoolean523 = false;
			this.aClass332_50.method26188(this.method21431());
		}
		return this.aClass332_50;
	}

	@OriginalMember(owner = "client!uk", name = "aq", descriptor = "()Lclient!mu;", line = 52)
	final Class332 method21444() {
		if (this.aBoolean523) {
			this.aBoolean523 = false;
			this.aClass332_50.method26188(this.method21431());
		}
		return this.aClass332_50;
	}

	@OriginalMember(owner = "client!uk", name = "av", descriptor = "()Lclient!mu;", line = 52)
	final Class332 method21445() {
		if (this.aBoolean523) {
			this.aBoolean523 = false;
			this.aClass332_50.method26188(this.method21431());
		}
		return this.aClass332_50;
	}

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "(Lclient!mj;)V", line = 60)
	final void method21434(@OriginalArg(0) Class322 arg0) {
		this.aClass322_64.method25982(arg0);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "ax", descriptor = "(Lclient!mj;)V", line = 60)
	final void method21446(@OriginalArg(0) Class322 arg0) {
		this.aClass322_64.method25982(arg0);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "az", descriptor = "(Lclient!mj;)V", line = 60)
	final void method21447(@OriginalArg(0) Class322 arg0) {
		this.aClass322_64.method25982(arg0);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "al", descriptor = "(Lclient!mj;)V", line = 60)
	final void method21458(@OriginalArg(0) Class322 arg0) {
		this.aClass322_64.method25982(arg0);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "at", descriptor = "(Lclient!mx;)V", line = 66)
	public final void method21435(@OriginalArg(0) Class335 arg0) {
		this.aClass322_64.aClass335_5.method26315(arg0);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "ao", descriptor = "(Lclient!mx;)V", line = 66)
	public final void method21449(@OriginalArg(0) Class335 arg0) {
		this.aClass322_64.aClass335_5.method26315(arg0);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "ap", descriptor = "(Lclient!mx;)V", line = 66)
	public final void method21459(@OriginalArg(0) Class335 arg0) {
		this.aClass322_64.aClass335_5.method26315(arg0);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "af", descriptor = "(Lclient!mh;)V", line = 72)
	public final void method21436(@OriginalArg(0) Class320 arg0) {
		this.aClass322_64.aClass320_61.method25893(arg0);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "ab", descriptor = "(Lclient!mh;)V", line = 72)
	public final void method21453(@OriginalArg(0) Class320 arg0) {
		this.aClass322_64.aClass320_61.method25893(arg0);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "ak", descriptor = "(FFF)V", line = 78)
	public final void method21437(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass322_64.aClass320_61.method25863(arg0, arg1, arg2);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "au", descriptor = "(FFF)V", line = 78)
	public final void method21451(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass322_64.aClass320_61.method25863(arg0, arg1, arg2);
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "aa", descriptor = "(Lclient!mj;)V", line = 84)
	final void method21438(@OriginalArg(0) Class322 arg0) {
		if (this.aClass26_64 == null) {
			this.method21434(arg0);
		} else {
			@Pc(7) Class322 local7 = new Class322(arg0);
			local7.method25984(this.aClass26_64.method21448());
			this.method21434(local7);
		}
	}

	@OriginalMember(owner = "client!uk", name = "ay", descriptor = "(Lclient!mj;)V", line = 84)
	final void method21440(@OriginalArg(0) Class322 arg0) {
		if (this.aClass26_64 == null) {
			this.method21434(arg0);
		} else {
			@Pc(7) Class322 local7 = new Class322(arg0);
			local7.method25984(this.aClass26_64.method21448());
			this.method21434(local7);
		}
	}

	@OriginalMember(owner = "client!uk", name = "ag", descriptor = "(Lclient!mj;)V", line = 84)
	final void method21452(@OriginalArg(0) Class322 arg0) {
		if (this.aClass26_64 == null) {
			this.method21434(arg0);
		} else {
			@Pc(7) Class322 local7 = new Class322(arg0);
			local7.method25984(this.aClass26_64.method21448());
			this.method21434(local7);
		}
	}

	@OriginalMember(owner = "client!uk", name = "ah", descriptor = "()V", line = 93)
	final void method21439() {
		this.aBoolean525 = true;
		this.aBoolean522 = true;
		this.aBoolean523 = true;
		this.aBoolean524 = true;
	}

	@OriginalMember(owner = "client!uk", name = "am", descriptor = "()V", line = 93)
	final void method21454() {
		this.aBoolean525 = true;
		this.aBoolean522 = true;
		this.aBoolean523 = true;
		this.aBoolean524 = true;
	}

	@OriginalMember(owner = "client!uk", name = "ar", descriptor = "()V", line = 93)
	final void method21455() {
		this.aBoolean525 = true;
		this.aBoolean522 = true;
		this.aBoolean523 = true;
		this.aBoolean524 = true;
	}

	@OriginalMember(owner = "client!uk", name = "ae", descriptor = "()V", line = 93)
	final void method21456() {
		this.aBoolean525 = true;
		this.aBoolean522 = true;
		this.aBoolean523 = true;
		this.aBoolean524 = true;
	}

	@OriginalMember(owner = "client!uk", name = "aw", descriptor = "()V", line = 100)
	final void method21429() {
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
		if (this.aClass26_66 != null) {
			this.aClass26_66.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "an", descriptor = "()V", line = 100)
	final void method21432() {
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
		if (this.aClass26_66 != null) {
			this.aClass26_66.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "ad", descriptor = "()V", line = 100)
	final void method21457() {
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
		}
		if (this.aClass26_66 != null) {
			this.aClass26_66.method21432();
		}
	}

	@OriginalMember(owner = "client!uk", name = "aj", descriptor = "()V", line = 106)
	public final void method21441() {
		@Pc(6) Class26 local6;
		if (this.aClass26_64 != null) {
			local6 = this.aClass26_64.aClass26_65;
			if (local6 == this) {
				this.aClass26_64.aClass26_65 = this.aClass26_66;
			} else {
				while (local6.aClass26_66 != this) {
					local6 = local6.aClass26_66;
				}
				local6.aClass26_66 = this.aClass26_66;
			}
		}
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
			local6 = this.aClass26_65;
			while (true) {
				local6.aClass322_64.method25984(this.aClass322_64);
				local6.aClass26_64 = this.aClass26_64;
				if (local6.aClass26_66 == null) {
					local6.aClass26_66 = this.aClass26_64.aClass26_65;
					this.aClass26_64.aClass26_65 = this.aClass26_65;
					break;
				}
				local6 = local6.aClass26_66;
			}
		}
		this.aClass26_64 = null;
		this.aClass26_66 = null;
		this.aClass26_65 = null;
	}

	@OriginalMember(owner = "client!uk", name = "ac", descriptor = "()V", line = 106)
	public final void method21450() {
		@Pc(6) Class26 local6;
		if (this.aClass26_64 != null) {
			local6 = this.aClass26_64.aClass26_65;
			if (local6 == this) {
				this.aClass26_64.aClass26_65 = this.aClass26_66;
			} else {
				while (local6.aClass26_66 != this) {
					local6 = local6.aClass26_66;
				}
				local6.aClass26_66 = this.aClass26_66;
			}
		}
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
			local6 = this.aClass26_65;
			while (true) {
				local6.aClass322_64.method25984(this.aClass322_64);
				local6.aClass26_64 = this.aClass26_64;
				if (local6.aClass26_66 == null) {
					local6.aClass26_66 = this.aClass26_64.aClass26_65;
					this.aClass26_64.aClass26_65 = this.aClass26_65;
					break;
				}
				local6 = local6.aClass26_66;
			}
		}
		this.aClass26_64 = null;
		this.aClass26_66 = null;
		this.aClass26_65 = null;
	}

	@OriginalMember(owner = "client!uk", name = "bw", descriptor = "()V", line = 106)
	public final void method21460() {
		@Pc(6) Class26 local6;
		if (this.aClass26_64 != null) {
			local6 = this.aClass26_64.aClass26_65;
			if (local6 == this) {
				this.aClass26_64.aClass26_65 = this.aClass26_66;
			} else {
				while (local6.aClass26_66 != this) {
					local6 = local6.aClass26_66;
				}
				local6.aClass26_66 = this.aClass26_66;
			}
		}
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
			local6 = this.aClass26_65;
			while (true) {
				local6.aClass322_64.method25984(this.aClass322_64);
				local6.aClass26_64 = this.aClass26_64;
				if (local6.aClass26_66 == null) {
					local6.aClass26_66 = this.aClass26_64.aClass26_65;
					this.aClass26_64.aClass26_65 = this.aClass26_65;
					break;
				}
				local6 = local6.aClass26_66;
			}
		}
		this.aClass26_64 = null;
		this.aClass26_66 = null;
		this.aClass26_65 = null;
	}

	@OriginalMember(owner = "client!uk", name = "bp", descriptor = "()V", line = 106)
	public final void method21461() {
		@Pc(6) Class26 local6;
		if (this.aClass26_64 != null) {
			local6 = this.aClass26_64.aClass26_65;
			if (local6 == this) {
				this.aClass26_64.aClass26_65 = this.aClass26_66;
			} else {
				while (local6.aClass26_66 != this) {
					local6 = local6.aClass26_66;
				}
				local6.aClass26_66 = this.aClass26_66;
			}
		}
		this.method21439();
		if (this.aClass26_65 != null) {
			this.aClass26_65.method21432();
			local6 = this.aClass26_65;
			while (true) {
				local6.aClass322_64.method25984(this.aClass322_64);
				local6.aClass26_64 = this.aClass26_64;
				if (local6.aClass26_66 == null) {
					local6.aClass26_66 = this.aClass26_64.aClass26_65;
					this.aClass26_64.aClass26_65 = this.aClass26_65;
					break;
				}
				local6 = local6.aClass26_66;
			}
		}
		this.aClass26_64 = null;
		this.aClass26_66 = null;
		this.aClass26_65 = null;
	}
}
