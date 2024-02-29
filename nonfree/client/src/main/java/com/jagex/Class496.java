package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public class Class496 {

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "Ljava/lang/Object;")
	Object anObject24;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "Lclient!vg;")
	Interface69 anInterface69_1;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Lclient!oo;")
	Class447 aClass447_62;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
	int anInt5055;

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "Z")
	boolean aBoolean767;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	int anInt5056;

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "Lclient!qx;")
	Interface57 anInterface57_6;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "F")
	float aFloat305;

	@OriginalMember(owner = "client!qs", name = "z", descriptor = "F")
	float aFloat306;

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
	int anInt5057;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "Z")
	boolean aBoolean769;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "Ljava/lang/Object;")
	Object anObject25;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "F")
	float aFloat307;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "F")
	float aFloat308;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "Lclient!qg;")
	Class486 aClass486_11 = Class486.aClass486_2;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Z")
	boolean aBoolean768 = false;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
	int anInt5054 = 0;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "Lclient!lj;")
	Class117 aClass117_3;

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "Ljava/util/List;")
	List aList21;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!lj;)V", line = 33)
	public Class496(@OriginalArg(0) Class117 arg0) {
		this.aClass117_3 = arg0;
		this.aList21 = new ArrayList();
	}

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "(B)V", line = 39)
	void method30089() {
		this.anInterface69_1 = null;
		this.aClass486_11 = Class486.aClass486_2;
		this.aBoolean768 = false;
		this.aList21.clear();
		this.anObject24 = null;
		this.aClass447_62 = null;
		this.anInt5055 = -1589381643;
		this.aBoolean767 = false;
		this.anInt5056 = 0;
		this.aFloat307 = 0.0F;
		this.anInterface57_6 = null;
		this.aFloat305 = 0.0F;
		this.aFloat306 = 0.0F;
		this.anInt5057 = 0;
		this.aBoolean769 = false;
		this.anObject25 = null;
		this.anInt5054 = 0;
		this.aFloat308 = 1.0F;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(Lclient!vg;I)V", line = 60)
	public void method30090(@OriginalArg(0) Interface69 arg0) {
		this.anInterface69_1 = arg0;
		this.aFloat307 = 0.0F;
		this.aClass486_11 = Class486.aClass486_6;
	}

	@OriginalMember(owner = "client!qs", name = "ak", descriptor = "(Lclient!vg;)V", line = 60)
	public void method30091(@OriginalArg(0) Interface69 arg0) {
		this.anInterface69_1 = arg0;
		this.aFloat307 = 0.0F;
		this.aClass486_11 = Class486.aClass486_6;
	}

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "(B)V", line = 66)
	public void method30092() {
		if (this.aClass486_11 != Class486.aClass486_7 && Class486.aClass486_3 != this.aClass486_11) {
			this.method30100(0);
		}
		@Pc(15) Iterator local15 = this.aList21.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class485 local22 = (Class485) local15.next();
			if (local22.method29965() == this) {
				local22.method29871();
			} else {
				local15.remove();
			}
		}
		this.method30089();
		this.aClass486_11 = Class486.aClass486_10;
	}

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "(I)V", line = 83)
	public void method30093() {
		if (!this.aBoolean768 && (this.aClass486_11 != Class486.aClass486_9 && this.aClass486_11 != Class486.aClass486_10 && this.aClass486_11 != Class486.aClass486_2 && Class486.aClass486_8 != this.aClass486_11 && (this.aClass486_11.anInt5039 * 112577419 <= Class486.aClass486_6.anInt5039 * 112577419 || this.aClass486_11.anInt5039 * 112577419 >= Class486.aClass486_7.anInt5039 * 112577419))) {
			this.aClass486_11 = Class486.aClass486_1;
		}
	}

	@OriginalMember(owner = "client!qs", name = "ax", descriptor = "()V", line = 83)
	public void method30094() {
		if (!this.aBoolean768 && (this.aClass486_11 != Class486.aClass486_9 && this.aClass486_11 != Class486.aClass486_10 && this.aClass486_11 != Class486.aClass486_2 && Class486.aClass486_8 != this.aClass486_11 && (this.aClass486_11.anInt5039 * 112577419 <= Class486.aClass486_6.anInt5039 * 112577419 || this.aClass486_11.anInt5039 * 112577419 >= Class486.aClass486_7.anInt5039 * 112577419))) {
			this.aClass486_11 = Class486.aClass486_1;
		}
	}

	@OriginalMember(owner = "client!qs", name = "ar", descriptor = "()V", line = 83)
	public void method30095() {
		if (!this.aBoolean768 && (this.aClass486_11 != Class486.aClass486_9 && this.aClass486_11 != Class486.aClass486_10 && this.aClass486_11 != Class486.aClass486_2 && Class486.aClass486_8 != this.aClass486_11 && (this.aClass486_11.anInt5039 * 112577419 <= Class486.aClass486_6.anInt5039 * 112577419 || this.aClass486_11.anInt5039 * 112577419 >= Class486.aClass486_7.anInt5039 * 112577419))) {
			this.aClass486_11 = Class486.aClass486_1;
		}
	}

	@OriginalMember(owner = "client!qs", name = "au", descriptor = "()V", line = 83)
	public void method30096() {
		if (!this.aBoolean768 && (this.aClass486_11 != Class486.aClass486_9 && this.aClass486_11 != Class486.aClass486_10 && this.aClass486_11 != Class486.aClass486_2 && Class486.aClass486_8 != this.aClass486_11 && (this.aClass486_11.anInt5039 * 112577419 <= Class486.aClass486_6.anInt5039 * 112577419 || this.aClass486_11.anInt5039 * 112577419 >= Class486.aClass486_7.anInt5039 * 112577419))) {
			this.aClass486_11 = Class486.aClass486_1;
		}
	}

	@OriginalMember(owner = "client!qs", name = "ad", descriptor = "()V", line = 83)
	public void method30097() {
		if (!this.aBoolean768 && (this.aClass486_11 != Class486.aClass486_9 && this.aClass486_11 != Class486.aClass486_10 && this.aClass486_11 != Class486.aClass486_2 && Class486.aClass486_8 != this.aClass486_11 && (this.aClass486_11.anInt5039 * 112577419 <= Class486.aClass486_6.anInt5039 * 112577419 || this.aClass486_11.anInt5039 * 112577419 >= Class486.aClass486_7.anInt5039 * 112577419))) {
			this.aClass486_11 = Class486.aClass486_1;
		}
	}

	@OriginalMember(owner = "client!qs", name = "ac", descriptor = "()V", line = 94)
	public void method30098() {
		if (Class486.aClass486_9 == this.aClass486_11 || Class486.aClass486_10 == this.aClass486_11 || this.aClass486_11 == Class486.aClass486_2 || this.aClass486_11 == Class486.aClass486_8) {
			return;
		}
		if ((Class486.aClass486_1 == this.aClass486_11 || Class486.aClass486_4 == this.aClass486_11) && !this.aBoolean768) {
			this.aBoolean768 = true;
		} else if (this.aClass486_11.anInt5039 * 112577419 < Class486.aClass486_1.anInt5039 * 112577419 || this.aClass486_11.anInt5039 * 112577419 >= Class486.aClass486_7.anInt5039 * 112577419) {
			this.aClass486_11 = Class486.aClass486_1;
			this.aBoolean768 = true;
		}
	}

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "(I)V", line = 94)
	public void method30099() {
		if (Class486.aClass486_9 == this.aClass486_11 || Class486.aClass486_10 == this.aClass486_11 || this.aClass486_11 == Class486.aClass486_2 || this.aClass486_11 == Class486.aClass486_8) {
			return;
		}
		if ((Class486.aClass486_1 == this.aClass486_11 || Class486.aClass486_4 == this.aClass486_11) && !this.aBoolean768) {
			this.aBoolean768 = true;
		} else if (this.aClass486_11.anInt5039 * 112577419 < Class486.aClass486_1.anInt5039 * 112577419 || this.aClass486_11.anInt5039 * 112577419 >= Class486.aClass486_7.anInt5039 * 112577419) {
			this.aClass486_11 = Class486.aClass486_1;
			this.aBoolean768 = true;
		}
	}

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "(II)V", line = 109)
	public void method30100(@OriginalArg(0) int arg0) {
		if (this.aClass486_11.anInt5039 * 112577419 >= Class486.aClass486_7.anInt5039 * 112577419) {
			return;
		}
		if (this.aClass486_11.anInt5039 * 112577419 < Class486.aClass486_5.anInt5039 * 112577419) {
			this.aClass486_11 = Class486.aClass486_7;
			this.aBoolean768 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class485 local40;
		if (arg0 > 0) {
			this.aClass486_11 = Class486.aClass486_8;
			local33 = this.aList21.iterator();
			while (local33.hasNext()) {
				local40 = (Class485) local33.next();
				if (local40.method29965() == this) {
					local40.method29874(0.0F, arg0);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList21.iterator();
		while (local33.hasNext()) {
			local40 = (Class485) local33.next();
			if (local40.method29965() == this) {
				local40.method29887();
			} else {
				local33.remove();
			}
		}
		this.aClass486_11 = Class486.aClass486_7;
		this.aBoolean768 = false;
	}

	@OriginalMember(owner = "client!qs", name = "av", descriptor = "(I)V", line = 109)
	public void method30101(@OriginalArg(0) int arg0) {
		if (this.aClass486_11.anInt5039 * 112577419 >= Class486.aClass486_7.anInt5039 * 112577419) {
			return;
		}
		if (this.aClass486_11.anInt5039 * 112577419 < Class486.aClass486_5.anInt5039 * 112577419) {
			this.aClass486_11 = Class486.aClass486_7;
			this.aBoolean768 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class485 local40;
		if (arg0 > 0) {
			this.aClass486_11 = Class486.aClass486_8;
			local33 = this.aList21.iterator();
			while (local33.hasNext()) {
				local40 = (Class485) local33.next();
				if (local40.method29965() == this) {
					local40.method29874(0.0F, arg0);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList21.iterator();
		while (local33.hasNext()) {
			local40 = (Class485) local33.next();
			if (local40.method29965() == this) {
				local40.method29887();
			} else {
				local33.remove();
			}
		}
		this.aClass486_11 = Class486.aClass486_7;
		this.aBoolean768 = false;
	}

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "(B)V", line = 145)
	public void method30102() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass486_11 = Class486.aClass486_7;
		while (local3.hasNext()) {
			@Pc(13) Class485 local13 = (Class485) local3.next();
			if (local13.method29965() == this) {
				local13.method29928();
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "at", descriptor = "()V", line = 145)
	public void method30103() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass486_11 = Class486.aClass486_7;
		while (local3.hasNext()) {
			@Pc(13) Class485 local13 = (Class485) local3.next();
			if (local13.method29965() == this) {
				local13.method29928();
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "ae", descriptor = "()V", line = 145)
	public void method30104() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass486_11 = Class486.aClass486_7;
		while (local3.hasNext()) {
			@Pc(13) Class485 local13 = (Class485) local3.next();
			if (local13.method29965() == this) {
				local13.method29928();
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "(I)V", line = 154)
	public void method30105() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass486_11 = Class486.aClass486_1;
		while (local3.hasNext()) {
			@Pc(13) Class485 local13 = (Class485) local3.next();
			if (local13.method29965() == this) {
				local13.method29932();
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "ah", descriptor = "(Lclient!qx;)V", line = 163)
	public void method30106(@OriginalArg(0) Interface57 arg0) {
		this.anInterface57_6 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "(Lclient!qx;I)V", line = 163)
	public void method30107(@OriginalArg(0) Interface57 arg0) {
		this.anInterface57_6 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "as", descriptor = "(Lclient!qx;)V", line = 163)
	public void method30108(@OriginalArg(0) Interface57 arg0) {
		this.anInterface57_6 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V", line = 167)
	public void method30109() {
		if (Class486.aClass486_1 == this.aClass486_11) {
			@Pc(8) Class590 local8 = this.anInterface69_1.method32180();
			if (Class590.aClass590_1 == local8) {
				this.aClass486_11 = Class486.aClass486_4;
			}
		}
		@Pc(38) boolean local38;
		if (Class486.aClass486_4 == this.aClass486_11 && this.aBoolean768) {
			@Pc(31) Class485 local31 = this.aClass117_3.method10878(this.anInterface69_1.method32170());
			if (local31 != null) {
				local38 = this.anInterface69_1.method32149();
				@Pc(43) Class490 local43 = new Class490(this);
				@Pc(84) boolean local84 = local31.method29880(local38 ? null : this.anInterface69_1.method32151(0), local38 ? local43 : null, this.anInt5055 * 712815011, this.anInt5054 * 1654063797 > 0 ? 0.0F : this.aFloat307, this.aBoolean767, this.anInt5056 * 130814741, this.aFloat308, this);
				if (local84) {
					this.aClass486_11 = Class486.aClass486_5;
					local31.method29889(this.anInterface57_6);
					local31.method29874(this.aFloat307, this.anInt5054 * 1654063797);
					local31.method29883();
					this.aList21.add(local31);
					this.aBoolean768 = false;
				} else {
					if (local31.method29861() == Class491.aClass491_8) {
						this.aClass486_11 = Class486.aClass486_3;
					}
					local31.method29871();
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList21.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class485 local140 = (Class485) local131.next();
				if (local140.method29965() == this) {
					if (this.aClass486_11 == Class486.aClass486_8) {
						if (local140.method29878() == 0.0F) {
							local140.method29887();
						} else {
							local38 = false;
						}
					}
					if (local140.method29866() || local140.method29863()) {
						local140.method29871();
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass486_11.anInt5039 * 112577419 >= Class486.aClass486_5.anInt5039 * 112577419 && this.aClass486_11.anInt5039 * 112577419 < Class486.aClass486_7.anInt5039 * 112577419) {
				if (this.aClass486_11 == Class486.aClass486_8) {
					this.aClass486_11 = Class486.aClass486_7;
				} else {
					this.aClass486_11 = Class486.aClass486_3;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "(B)Lclient!qg;", line = 230)
	public Class486 method30110() {
		return this.aClass486_11;
	}

	@OriginalMember(owner = "client!qs", name = "aq", descriptor = "()Lclient!qg;", line = 230)
	public Class486 method30111() {
		return this.aClass486_11;
	}

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "(Ljava/lang/Object;I)V", line = 234)
	public void method30112(@OriginalArg(0) Object arg0) {
		this.anObject24 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "am", descriptor = "(Ljava/lang/Object;)V", line = 234)
	public void method30113(@OriginalArg(0) Object arg0) {
		this.anObject24 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 238)
	public Object method30114() {
		return this.anObject24;
	}

	@OriginalMember(owner = "client!qs", name = "ay", descriptor = "()Ljava/lang/Object;", line = 238)
	public Object method30115() {
		return this.anObject24;
	}

	@OriginalMember(owner = "client!qs", name = "af", descriptor = "()Ljava/lang/Object;", line = 238)
	public Object method30116() {
		return this.anObject24;
	}

	@OriginalMember(owner = "client!qs", name = "z", descriptor = "(Ljava/lang/Object;B)V", line = 242)
	public void method30117(@OriginalArg(0) Object arg0) {
		this.anObject25 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "(B)Ljava/lang/Object;", line = 246)
	public Object method30118() {
		return this.anObject25;
	}

	@OriginalMember(owner = "client!qs", name = "an", descriptor = "()Ljava/lang/Object;", line = 246)
	public Object method30119() {
		return this.anObject25;
	}

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "(I)I", line = 250)
	public int method30120() {
		return this.anInt5055 * 712815011;
	}

	@OriginalMember(owner = "client!qs", name = "aa", descriptor = "()I", line = 250)
	public int method30121() {
		return this.anInt5055 * 712815011;
	}

	@OriginalMember(owner = "client!qs", name = "ab", descriptor = "()I", line = 250)
	public int method30122() {
		return this.anInt5055 * 712815011;
	}

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "(IB)V", line = 254)
	public void method30123(@OriginalArg(0) int arg0) {
		this.anInt5055 = arg0 * 1589381643;
	}

	@OriginalMember(owner = "client!qs", name = "ap", descriptor = "(I)V", line = 254)
	public void method30124(@OriginalArg(0) int arg0) {
		this.anInt5055 = arg0 * 1589381643;
	}

	@OriginalMember(owner = "client!qs", name = "aw", descriptor = "(I)V", line = 254)
	public void method30125(@OriginalArg(0) int arg0) {
		this.anInt5055 = arg0 * 1589381643;
	}

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "(ZB)V", line = 257)
	public void method30126() {
	}

	@OriginalMember(owner = "client!qs", name = "az", descriptor = "(Z)V", line = 257)
	public void method30127() {
	}

	@OriginalMember(owner = "client!qs", name = "bj", descriptor = "()Lclient!vg;", line = 260)
	public Interface69 method30128() {
		return this.anInterface69_1;
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(B)Lclient!vg;", line = 260)
	public Interface69 method30129() {
		return this.anInterface69_1;
	}

	@OriginalMember(owner = "client!qs", name = "bc", descriptor = "()Lclient!vg;", line = 260)
	public Interface69 method30130() {
		return this.anInterface69_1;
	}

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "(Lclient!oo;B)V", line = 264)
	public void method30131(@OriginalArg(0) Class447 arg0) {
		this.aClass447_62 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "ba", descriptor = "(Lclient!oo;)V", line = 264)
	public void method30132(@OriginalArg(0) Class447 arg0) {
		this.aClass447_62 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "bv", descriptor = "(Lclient!oo;)V", line = 264)
	public void method30133(@OriginalArg(0) Class447 arg0) {
		this.aClass447_62 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "bl", descriptor = "()Lclient!oo;", line = 268)
	public Class447 method30134() {
		return this.aClass447_62;
	}

	@OriginalMember(owner = "client!qs", name = "bd", descriptor = "()Lclient!oo;", line = 268)
	public Class447 method30135() {
		return this.aClass447_62;
	}

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "(B)Lclient!oo;", line = 268)
	public Class447 method30136() {
		return this.aClass447_62;
	}

	@OriginalMember(owner = "client!qs", name = "bb", descriptor = "()Lclient!oo;", line = 268)
	public Class447 method30137() {
		return this.aClass447_62;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(S)F", line = 272)
	public float method30138() {
		return this.aFloat305;
	}

	@OriginalMember(owner = "client!qs", name = "by", descriptor = "()F", line = 272)
	public float method30139() {
		return this.aFloat305;
	}

	@OriginalMember(owner = "client!qs", name = "bx", descriptor = "()F", line = 272)
	public float method30140() {
		return this.aFloat305;
	}

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "(I)F", line = 276)
	public float method30141() {
		return this.aFloat306;
	}

	@OriginalMember(owner = "client!qs", name = "bw", descriptor = "()F", line = 276)
	public float method30142() {
		return this.aFloat306;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(FI)V", line = 280)
	public void method30143(@OriginalArg(0) float arg0) {
		this.aFloat305 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "(FB)V", line = 284)
	public void method30144(@OriginalArg(0) float arg0) {
		this.aFloat306 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "bs", descriptor = "(F)V", line = 284)
	public void method30145(@OriginalArg(0) float arg0) {
		this.aFloat306 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "bg", descriptor = "(F)V", line = 284)
	public void method30146(@OriginalArg(0) float arg0) {
		this.aFloat306 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "bi", descriptor = "(F)V", line = 284)
	public void method30147(@OriginalArg(0) float arg0) {
		this.aFloat306 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "(IZB)V", line = 288)
	public void method30148(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean769 = arg1;
		this.anInt5057 = arg0 * -1873863177;
	}

	@OriginalMember(owner = "client!qs", name = "bt", descriptor = "(IZ)V", line = 288)
	public void method30149(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean769 = arg1;
		this.anInt5057 = arg0 * -1873863177;
	}

	@OriginalMember(owner = "client!qs", name = "aj", descriptor = "(I)Z", line = 293)
	public boolean method30150() {
		this.aBoolean769 = false;
		return this.anInt5057 * -791366713 != 0;
	}

	@OriginalMember(owner = "client!qs", name = "bz", descriptor = "()Z", line = 293)
	public boolean method30151() {
		this.aBoolean769 = false;
		return this.anInt5057 * -791366713 != 0;
	}

	@OriginalMember(owner = "client!qs", name = "ai", descriptor = "(I)V", line = 298)
	public void method30152() {
		if (this.anInt5057 * -791366713 > -1 && !this.aBoolean769) {
			this.anInt5057 -= -1873863177;
		}
		if (this.anInt5057 * -791366713 == 0) {
			this.method30099();
		}
	}

	@OriginalMember(owner = "client!qs", name = "bu", descriptor = "()V", line = 298)
	public void method30153() {
		if (this.anInt5057 * -791366713 > -1 && !this.aBoolean769) {
			this.anInt5057 -= -1873863177;
		}
		if (this.anInt5057 * -791366713 == 0) {
			this.method30099();
		}
	}

	@OriginalMember(owner = "client!qs", name = "bf", descriptor = "()V", line = 298)
	public void method30154() {
		if (this.anInt5057 * -791366713 > -1 && !this.aBoolean769) {
			this.anInt5057 -= -1873863177;
		}
		if (this.anInt5057 * -791366713 == 0) {
			this.method30099();
		}
	}

	@OriginalMember(owner = "client!qs", name = "ag", descriptor = "(FII)V", line = 303)
	public void method30155(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat307 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class485 local15 = (Class485) local8.next();
			if (local15.method29965() == this) {
				local15.method29874(this.aFloat307, arg1);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5054 = arg1 * 1356422045;
		}
	}

	@OriginalMember(owner = "client!qs", name = "bn", descriptor = "(FI)V", line = 303)
	public void method30156(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat307 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class485 local15 = (Class485) local8.next();
			if (local15.method29965() == this) {
				local15.method29874(this.aFloat307, arg1);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5054 = arg1 * 1356422045;
		}
	}

	@OriginalMember(owner = "client!qs", name = "bp", descriptor = "(FI)V", line = 303)
	public void method30157(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat307 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class485 local15 = (Class485) local8.next();
			if (local15.method29965() == this) {
				local15.method29874(this.aFloat307, arg1);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5054 = arg1 * 1356422045;
		}
	}

	@OriginalMember(owner = "client!qs", name = "al", descriptor = "(ZII)V", line = 322)
	public void method30158(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean767 = arg0;
		this.anInt5056 = arg1 * 688825405;
	}

	@OriginalMember(owner = "client!qs", name = "bm", descriptor = "(ZI)V", line = 322)
	public void method30159(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean767 = arg0;
		this.anInt5056 = arg1 * 688825405;
	}

	@OriginalMember(owner = "client!qs", name = "ao", descriptor = "(FB)V", line = 327)
	public void method30160(@OriginalArg(0) float arg0) {
		if (!(arg0 < 0.0F)) {
			this.aFloat308 = arg0;
		}
	}

	@OriginalMember(owner = "client!qs", name = "bo", descriptor = "(F)V", line = 327)
	public void method30161(@OriginalArg(0) float arg0) {
		if (!(arg0 < 0.0F)) {
			this.aFloat308 = arg0;
		}
	}

	@OriginalMember(owner = "client!qs", name = "xh", descriptor = "(Lclient!yf;I)V", line = 8868)
	static final void method30162(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3453 * -1050164879 == 2 && local12 < client.anInt3529 * -1979292205) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass162Array1[local12].anInt3262 * 557433037;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!qs", name = "ahh", descriptor = "(Lclient!yf;I)V", line = 10741)
	static final void method30163(@OriginalArg(0) Class665 arg0) {
		@Pc(2) Class77_Sub30 local2 = Class109_Sub1.method9096();
		if (local2 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.anInt1635 * 1592054281;
			@Pc(77) int local77 = local2.anInt1633 * 197477433 << 28 | local2.anInt1638 * 1412374331 + Class136.anInt1674 << 14 | Class136.anInt1675 + local2.anInt1636 * -958626707;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local77;
		}
	}

	@OriginalMember(owner = "client!qs", name = "atq", descriptor = "(ILclient!gm;Lclient!yf;B)V", line = 12898)
	static final void method30164(@OriginalArg(0) int arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) Class665 arg2) {
		if (arg0 < 1 || arg0 > 10) {
			throw new RuntimeException();
		}
		Class303.method27192(arg0, arg1.anInt3863 * -1278450723, arg1.anInt3927 * 1365669833, "");
	}
}
