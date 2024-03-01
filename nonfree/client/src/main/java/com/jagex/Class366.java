package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public class Class366 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Lclient!tn;")
	Interface52 anInterface52_1;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "F")
	float aFloat289;

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "Ljava/lang/Object;")
	Object anObject21;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "F")
	float aFloat290;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!mh;")
	Class320 aClass320_62;

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "Z")
	boolean aBoolean726;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	int anInt4649;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "Lclient!os;")
	Interface41 anInterface41_5;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "F")
	float aFloat291;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "F")
	float aFloat292;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "Z")
	boolean aBoolean727;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Ljava/lang/Object;")
	Object anObject22;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
	int anInt4651;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
	int anInt4652;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Lclient!ov;")
	Class378 aClass378_1 = Class378.aClass378_6;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
	boolean aBoolean725 = false;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	int anInt4650 = 0;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "Lclient!ju;")
	Class48 aClass48_2;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Ljava/util/List;")
	List aList14;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "(II)Lclient!gj;", line = 13)
	public static Class199 method26903(@OriginalArg(0) int arg0) {
		if (arg0 == Class199.aClass199_1.anInt3689 * -1329465575) {
			return Class199.aClass199_1;
		} else if (arg0 == Class199.aClass199_2.anInt3689 * -1329465575) {
			return Class199.aClass199_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ju;)V", line = 33)
	public Class366(@OriginalArg(0) Class48 arg0) {
		this.aClass48_2 = arg0;
		this.aList14 = new ArrayList();
	}

	@OriginalMember(owner = "client!oh", name = "an", descriptor = "()V", line = 39)
	void method26814() {
		this.anInterface52_1 = null;
		this.aClass378_1 = Class378.aClass378_6;
		this.aBoolean725 = false;
		this.aList14.clear();
		this.anObject21 = null;
		this.aClass320_62 = null;
		this.anInt4651 = 809135801;
		this.aBoolean726 = false;
		this.anInt4649 = 0;
		this.aFloat289 = 0.0F;
		this.anInterface41_5 = null;
		this.aFloat291 = 0.0F;
		this.aFloat292 = 0.0F;
		this.anInt4652 = 0;
		this.aBoolean727 = false;
		this.anObject22 = null;
		this.anInt4650 = 0;
		this.aFloat290 = 1.0F;
	}

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "(I)V", line = 39)
	void method26825() {
		this.anInterface52_1 = null;
		this.aClass378_1 = Class378.aClass378_6;
		this.aBoolean725 = false;
		this.aList14.clear();
		this.anObject21 = null;
		this.aClass320_62 = null;
		this.anInt4651 = 809135801;
		this.aBoolean726 = false;
		this.anInt4649 = 0;
		this.aFloat289 = 0.0F;
		this.anInterface41_5 = null;
		this.aFloat291 = 0.0F;
		this.aFloat292 = 0.0F;
		this.anInt4652 = 0;
		this.aBoolean727 = false;
		this.anObject22 = null;
		this.anInt4650 = 0;
		this.aFloat290 = 1.0F;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!tn;I)V", line = 60)
	public void method26815(@OriginalArg(0) Interface52 arg0) {
		this.anInterface52_1 = arg0;
		this.aFloat289 = 0.0F;
		this.aClass378_1 = Class378.aClass378_3;
	}

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)V", line = 66)
	public void method26816() {
		if (this.aClass378_1 != Class378.aClass378_2 && this.aClass378_1 != Class378.aClass378_8) {
			this.method26819(0);
		}
		@Pc(15) Iterator local15 = this.aList14.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class371 local22 = (Class371) local15.next();
			if (local22.method27120() == this) {
				local22.method27089();
			} else {
				local15.remove();
			}
		}
		this.method26825();
		this.aClass378_1 = Class378.aClass378_11;
	}

	@OriginalMember(owner = "client!oh", name = "aj", descriptor = "()V", line = 66)
	public void method26846() {
		if (this.aClass378_1 != Class378.aClass378_2 && this.aClass378_1 != Class378.aClass378_8) {
			this.method26819(0);
		}
		@Pc(15) Iterator local15 = this.aList14.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class371 local22 = (Class371) local15.next();
			if (local22.method27120() == this) {
				local22.method27089();
			} else {
				local15.remove();
			}
		}
		this.method26825();
		this.aClass378_1 = Class378.aClass378_11;
	}

	@OriginalMember(owner = "client!oh", name = "as", descriptor = "()V", line = 66)
	public void method26847() {
		if (this.aClass378_1 != Class378.aClass378_2 && this.aClass378_1 != Class378.aClass378_8) {
			this.method26819(0);
		}
		@Pc(15) Iterator local15 = this.aList14.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class371 local22 = (Class371) local15.next();
			if (local22.method27120() == this) {
				local22.method27089();
			} else {
				local15.remove();
			}
		}
		this.method26825();
		this.aClass378_1 = Class378.aClass378_11;
	}

	@OriginalMember(owner = "client!oh", name = "ai", descriptor = "()V", line = 66)
	public void method26860() {
		if (this.aClass378_1 != Class378.aClass378_2 && this.aClass378_1 != Class378.aClass378_8) {
			this.method26819(0);
		}
		@Pc(15) Iterator local15 = this.aList14.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class371 local22 = (Class371) local15.next();
			if (local22.method27120() == this) {
				local22.method27089();
			} else {
				local15.remove();
			}
		}
		this.method26825();
		this.aClass378_1 = Class378.aClass378_11;
	}

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "(I)V", line = 83)
	public void method26817() {
		if (!this.aBoolean725 && (this.aClass378_1 != Class378.aClass378_9 && Class378.aClass378_11 != this.aClass378_1 && this.aClass378_1 != Class378.aClass378_6 && Class378.aClass378_7 != this.aClass378_1 && (this.aClass378_1.anInt4702 * -1084743407 <= Class378.aClass378_3.anInt4702 * -1084743407 || this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407))) {
			this.aClass378_1 = Class378.aClass378_4;
		}
	}

	@OriginalMember(owner = "client!oh", name = "av", descriptor = "()V", line = 83)
	public void method26850() {
		if (!this.aBoolean725 && (this.aClass378_1 != Class378.aClass378_9 && Class378.aClass378_11 != this.aClass378_1 && this.aClass378_1 != Class378.aClass378_6 && Class378.aClass378_7 != this.aClass378_1 && (this.aClass378_1.anInt4702 * -1084743407 <= Class378.aClass378_3.anInt4702 * -1084743407 || this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407))) {
			this.aClass378_1 = Class378.aClass378_4;
		}
	}

	@OriginalMember(owner = "client!oh", name = "ax", descriptor = "()V", line = 83)
	public void method26851() {
		if (!this.aBoolean725 && (this.aClass378_1 != Class378.aClass378_9 && Class378.aClass378_11 != this.aClass378_1 && this.aClass378_1 != Class378.aClass378_6 && Class378.aClass378_7 != this.aClass378_1 && (this.aClass378_1.anInt4702 * -1084743407 <= Class378.aClass378_3.anInt4702 * -1084743407 || this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407))) {
			this.aClass378_1 = Class378.aClass378_4;
		}
	}

	@OriginalMember(owner = "client!oh", name = "aq", descriptor = "()V", line = 83)
	public void method26885() {
		if (!this.aBoolean725 && (this.aClass378_1 != Class378.aClass378_9 && Class378.aClass378_11 != this.aClass378_1 && this.aClass378_1 != Class378.aClass378_6 && Class378.aClass378_7 != this.aClass378_1 && (this.aClass378_1.anInt4702 * -1084743407 <= Class378.aClass378_3.anInt4702 * -1084743407 || this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407))) {
			this.aClass378_1 = Class378.aClass378_4;
		}
	}

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "(I)V", line = 94)
	public void method26818() {
		if (this.aClass378_1 == Class378.aClass378_9 || this.aClass378_1 == Class378.aClass378_11 || this.aClass378_1 == Class378.aClass378_6 || Class378.aClass378_7 == this.aClass378_1) {
			return;
		}
		if ((this.aClass378_1 == Class378.aClass378_4 || this.aClass378_1 == Class378.aClass378_5) && !this.aBoolean725) {
			this.aBoolean725 = true;
		} else if (this.aClass378_1.anInt4702 * -1084743407 < Class378.aClass378_4.anInt4702 * -1084743407 || this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407) {
			this.aClass378_1 = Class378.aClass378_4;
			this.aBoolean725 = true;
		}
	}

	@OriginalMember(owner = "client!oh", name = "az", descriptor = "()V", line = 94)
	public void method26852() {
		if (this.aClass378_1 == Class378.aClass378_9 || this.aClass378_1 == Class378.aClass378_11 || this.aClass378_1 == Class378.aClass378_6 || Class378.aClass378_7 == this.aClass378_1) {
			return;
		}
		if ((this.aClass378_1 == Class378.aClass378_4 || this.aClass378_1 == Class378.aClass378_5) && !this.aBoolean725) {
			this.aBoolean725 = true;
		} else if (this.aClass378_1.anInt4702 * -1084743407 < Class378.aClass378_4.anInt4702 * -1084743407 || this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407) {
			this.aClass378_1 = Class378.aClass378_4;
			this.aBoolean725 = true;
		}
	}

	@OriginalMember(owner = "client!oh", name = "al", descriptor = "()V", line = 94)
	public void method26853() {
		if (this.aClass378_1 == Class378.aClass378_9 || this.aClass378_1 == Class378.aClass378_11 || this.aClass378_1 == Class378.aClass378_6 || Class378.aClass378_7 == this.aClass378_1) {
			return;
		}
		if ((this.aClass378_1 == Class378.aClass378_4 || this.aClass378_1 == Class378.aClass378_5) && !this.aBoolean725) {
			this.aBoolean725 = true;
		} else if (this.aClass378_1.anInt4702 * -1084743407 < Class378.aClass378_4.anInt4702 * -1084743407 || this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407) {
			this.aClass378_1 = Class378.aClass378_4;
			this.aBoolean725 = true;
		}
	}

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "(II)V", line = 109)
	public void method26819(@OriginalArg(0) int arg0) {
		if (this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407) {
			return;
		}
		if (this.aClass378_1.anInt4702 * -1084743407 < Class378.aClass378_10.anInt4702 * -1084743407) {
			this.aClass378_1 = Class378.aClass378_2;
			this.aBoolean725 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class371 local40;
		if (arg0 > 0) {
			this.aClass378_1 = Class378.aClass378_7;
			local33 = this.aList14.iterator();
			while (local33.hasNext()) {
				local40 = (Class371) local33.next();
				if (local40.method27120() == this) {
					local40.method27083(0.0F, arg0);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList14.iterator();
		while (local33.hasNext()) {
			local40 = (Class371) local33.next();
			if (local40.method27120() == this) {
				local40.method27094();
			} else {
				local33.remove();
			}
		}
		this.aClass378_1 = Class378.aClass378_2;
		this.aBoolean725 = false;
	}

	@OriginalMember(owner = "client!oh", name = "ap", descriptor = "(I)V", line = 109)
	public void method26855(@OriginalArg(0) int arg0) {
		if (this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407) {
			return;
		}
		if (this.aClass378_1.anInt4702 * -1084743407 < Class378.aClass378_10.anInt4702 * -1084743407) {
			this.aClass378_1 = Class378.aClass378_2;
			this.aBoolean725 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class371 local40;
		if (arg0 > 0) {
			this.aClass378_1 = Class378.aClass378_7;
			local33 = this.aList14.iterator();
			while (local33.hasNext()) {
				local40 = (Class371) local33.next();
				if (local40.method27120() == this) {
					local40.method27083(0.0F, arg0);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList14.iterator();
		while (local33.hasNext()) {
			local40 = (Class371) local33.next();
			if (local40.method27120() == this) {
				local40.method27094();
			} else {
				local33.remove();
			}
		}
		this.aClass378_1 = Class378.aClass378_2;
		this.aBoolean725 = false;
	}

	@OriginalMember(owner = "client!oh", name = "ab", descriptor = "(I)V", line = 109)
	public void method26856(@OriginalArg(0) int arg0) {
		if (this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407) {
			return;
		}
		if (this.aClass378_1.anInt4702 * -1084743407 < Class378.aClass378_10.anInt4702 * -1084743407) {
			this.aClass378_1 = Class378.aClass378_2;
			this.aBoolean725 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class371 local40;
		if (arg0 > 0) {
			this.aClass378_1 = Class378.aClass378_7;
			local33 = this.aList14.iterator();
			while (local33.hasNext()) {
				local40 = (Class371) local33.next();
				if (local40.method27120() == this) {
					local40.method27083(0.0F, arg0);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList14.iterator();
		while (local33.hasNext()) {
			local40 = (Class371) local33.next();
			if (local40.method27120() == this) {
				local40.method27094();
			} else {
				local33.remove();
			}
		}
		this.aClass378_1 = Class378.aClass378_2;
		this.aBoolean725 = false;
	}

	@OriginalMember(owner = "client!oh", name = "ao", descriptor = "(I)V", line = 109)
	public void method26867(@OriginalArg(0) int arg0) {
		if (this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_2.anInt4702 * -1084743407) {
			return;
		}
		if (this.aClass378_1.anInt4702 * -1084743407 < Class378.aClass378_10.anInt4702 * -1084743407) {
			this.aClass378_1 = Class378.aClass378_2;
			this.aBoolean725 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class371 local40;
		if (arg0 > 0) {
			this.aClass378_1 = Class378.aClass378_7;
			local33 = this.aList14.iterator();
			while (local33.hasNext()) {
				local40 = (Class371) local33.next();
				if (local40.method27120() == this) {
					local40.method27083(0.0F, arg0);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList14.iterator();
		while (local33.hasNext()) {
			local40 = (Class371) local33.next();
			if (local40.method27120() == this) {
				local40.method27094();
			} else {
				local33.remove();
			}
		}
		this.aClass378_1 = Class378.aClass378_2;
		this.aBoolean725 = false;
	}

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "(I)[Lclient!fa;", line = 134)
	static Class166[] method26906() {
		return new Class166[] { Class166.aClass166_60, Class166.aClass166_67, Class166.aClass166_93, Class166.aClass166_57, Class166.aClass166_11, Class166.aClass166_61, Class166.aClass166_109, Class166.aClass166_14, Class166.aClass166_121, Class166.aClass166_16, Class166.aClass166_17, Class166.aClass166_13, Class166.aClass166_19, Class166.aClass166_12, Class166.aClass166_21, Class166.aClass166_22, Class166.aClass166_23, Class166.aClass166_24, Class166.aClass166_95, Class166.aClass166_26, Class166.aClass166_27, Class166.aClass166_70, Class166.aClass166_29, Class166.aClass166_40, Class166.aClass166_30, Class166.aClass166_32, Class166.aClass166_28, Class166.aClass166_34, Class166.aClass166_20, Class166.aClass166_36, Class166.aClass166_37, Class166.aClass166_38, Class166.aClass166_39, Class166.aClass166_90, Class166.aClass166_41, Class166.aClass166_10, Class166.aClass166_43, Class166.aClass166_49, Class166.aClass166_45, Class166.aClass166_46, Class166.aClass166_47, Class166.aClass166_48, Class166.aClass166_50, Class166.aClass166_96, Class166.aClass166_51, Class166.aClass166_52, Class166.aClass166_53, Class166.aClass166_54, Class166.aClass166_55, Class166.aClass166_56, Class166.aClass166_116, Class166.aClass166_58, Class166.aClass166_59, Class166.aClass166_15, Class166.aClass166_44, Class166.aClass166_62, Class166.aClass166_98, Class166.aClass166_64, Class166.aClass166_65, Class166.aClass166_85, Class166.aClass166_25, Class166.aClass166_68, Class166.aClass166_69, Class166.aClass166_35, Class166.aClass166_71, Class166.aClass166_72, Class166.aClass166_73, Class166.aClass166_74, Class166.aClass166_75, Class166.aClass166_76, Class166.aClass166_18, Class166.aClass166_102, Class166.aClass166_79, Class166.aClass166_80, Class166.aClass166_81, Class166.aClass166_82, Class166.aClass166_8, Class166.aClass166_63, Class166.aClass166_129, Class166.aClass166_86, Class166.aClass166_87, Class166.aClass166_88, Class166.aClass166_89, Class166.aClass166_7, Class166.aClass166_91, Class166.aClass166_33, Class166.aClass166_114, Class166.aClass166_94, Class166.aClass166_31, Class166.aClass166_92, Class166.aClass166_97, Class166.aClass166_130, Class166.aClass166_99, Class166.aClass166_117, Class166.aClass166_42, Class166.aClass166_66, Class166.aClass166_103, Class166.aClass166_104, Class166.aClass166_105, Class166.aClass166_106, Class166.aClass166_107, Class166.aClass166_112, Class166.aClass166_84, Class166.aClass166_110, Class166.aClass166_111, Class166.aClass166_83, Class166.aClass166_113, Class166.aClass166_108, Class166.aClass166_115, Class166.aClass166_78, Class166.aClass166_101, Class166.aClass166_118, Class166.aClass166_119, Class166.aClass166_120, Class166.aClass166_77, Class166.aClass166_122, Class166.aClass166_123, Class166.aClass166_124, Class166.aClass166_125, Class166.aClass166_126, Class166.aClass166_127, Class166.aClass166_128, Class166.aClass166_9, Class166.aClass166_100, Class166.aClass166_131 };
	}

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "(I)V", line = 145)
	public void method26848() {
		@Pc(3) Iterator local3 = this.aList14.iterator();
		this.aClass378_1 = Class378.aClass378_2;
		while (local3.hasNext()) {
			@Pc(13) Class371 local13 = (Class371) local3.next();
			if (local13.method27120() == this) {
				local13.method27106();
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "ay", descriptor = "()V", line = 145)
	public void method26858() {
		@Pc(3) Iterator local3 = this.aList14.iterator();
		this.aClass378_1 = Class378.aClass378_2;
		while (local3.hasNext()) {
			@Pc(13) Class371 local13 = (Class371) local3.next();
			if (local13.method27120() == this) {
				local13.method27106();
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "ag", descriptor = "()V", line = 145)
	public void method26859() {
		@Pc(3) Iterator local3 = this.aList14.iterator();
		this.aClass378_1 = Class378.aClass378_2;
		while (local3.hasNext()) {
			@Pc(13) Class371 local13 = (Class371) local3.next();
			if (local13.method27120() == this) {
				local13.method27106();
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "au", descriptor = "()V", line = 145)
	public void method26874() {
		@Pc(3) Iterator local3 = this.aList14.iterator();
		this.aClass378_1 = Class378.aClass378_2;
		while (local3.hasNext()) {
			@Pc(13) Class371 local13 = (Class371) local3.next();
			if (local13.method27120() == this) {
				local13.method27106();
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "(I)V", line = 154)
	public void method26821() {
		@Pc(3) Iterator local3 = this.aList14.iterator();
		this.aClass378_1 = Class378.aClass378_4;
		while (local3.hasNext()) {
			@Pc(13) Class371 local13 = (Class371) local3.next();
			if (local13.method27120() == this) {
				local13.method27107();
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "am", descriptor = "()V", line = 154)
	public void method26849() {
		@Pc(3) Iterator local3 = this.aList14.iterator();
		this.aClass378_1 = Class378.aClass378_4;
		while (local3.hasNext()) {
			@Pc(13) Class371 local13 = (Class371) local3.next();
			if (local13.method27120() == this) {
				local13.method27107();
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "(Lclient!os;I)V", line = 163)
	public void method26822(@OriginalArg(0) Interface41 arg0) {
		this.anInterface41_5 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "ar", descriptor = "(Lclient!os;)V", line = 163)
	public void method26861(@OriginalArg(0) Interface41 arg0) {
		this.anInterface41_5 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 167)
	public void method26823() {
		if (this.aClass378_1 == Class378.aClass378_4) {
			@Pc(8) Class475 local8 = this.anInterface52_1.method29156();
			if (Class475.aClass475_3 == local8) {
				this.aClass378_1 = Class378.aClass378_5;
			}
		}
		@Pc(38) boolean local38;
		if (Class378.aClass378_5 == this.aClass378_1 && this.aBoolean725) {
			@Pc(31) Class371 local31 = this.aClass48_2.method9510(this.anInterface52_1.method29119());
			if (local31 != null) {
				local38 = this.anInterface52_1.method29115();
				@Pc(43) Class353 local43 = new Class353(this);
				@Pc(84) boolean local84 = local31.method27092(local38 ? null : this.anInterface52_1.method29117(0), local38 ? local43 : null, this.anInt4651 * 101107831, this.anInt4650 * 1144248071 > 0 ? 0.0F : this.aFloat289, this.aBoolean726, this.anInt4649 * -601144693, this.aFloat290, this);
				if (local84) {
					this.aClass378_1 = Class378.aClass378_10;
					local31.method27095(this.anInterface41_5);
					local31.method27083(this.aFloat289, this.anInt4650 * 1144248071);
					local31.method27177();
					this.aList14.add(local31);
					this.aBoolean725 = false;
				} else {
					if (local31.method27136() == Class375.aClass375_3) {
						this.aClass378_1 = Class378.aClass378_8;
					}
					local31.method27089();
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList14.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class371 local140 = (Class371) local131.next();
				if (local140.method27120() == this) {
					if (Class378.aClass378_7 == this.aClass378_1) {
						if (local140.method27091() == 0.0F) {
							local140.method27094();
						} else {
							local38 = false;
						}
					}
					if (local140.method27169() || local140.method27086()) {
						local140.method27089();
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_10.anInt4702 * -1084743407 && this.aClass378_1.anInt4702 * -1084743407 < Class378.aClass378_2.anInt4702 * -1084743407) {
				if (Class378.aClass378_7 == this.aClass378_1) {
					this.aClass378_1 = Class378.aClass378_2;
				} else {
					this.aClass378_1 = Class378.aClass378_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!oh", name = "ae", descriptor = "()V", line = 167)
	public void method26830() {
		if (this.aClass378_1 == Class378.aClass378_4) {
			@Pc(8) Class475 local8 = this.anInterface52_1.method29156();
			if (Class475.aClass475_3 == local8) {
				this.aClass378_1 = Class378.aClass378_5;
			}
		}
		@Pc(38) boolean local38;
		if (Class378.aClass378_5 == this.aClass378_1 && this.aBoolean725) {
			@Pc(31) Class371 local31 = this.aClass48_2.method9510(this.anInterface52_1.method29119());
			if (local31 != null) {
				local38 = this.anInterface52_1.method29115();
				@Pc(43) Class353 local43 = new Class353(this);
				@Pc(84) boolean local84 = local31.method27092(local38 ? null : this.anInterface52_1.method29117(0), local38 ? local43 : null, this.anInt4651 * 101107831, this.anInt4650 * 1144248071 > 0 ? 0.0F : this.aFloat289, this.aBoolean726, this.anInt4649 * -601144693, this.aFloat290, this);
				if (local84) {
					this.aClass378_1 = Class378.aClass378_10;
					local31.method27095(this.anInterface41_5);
					local31.method27083(this.aFloat289, this.anInt4650 * 1144248071);
					local31.method27177();
					this.aList14.add(local31);
					this.aBoolean725 = false;
				} else {
					if (local31.method27136() == Class375.aClass375_3) {
						this.aClass378_1 = Class378.aClass378_8;
					}
					local31.method27089();
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList14.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class371 local140 = (Class371) local131.next();
				if (local140.method27120() == this) {
					if (Class378.aClass378_7 == this.aClass378_1) {
						if (local140.method27091() == 0.0F) {
							local140.method27094();
						} else {
							local38 = false;
						}
					}
					if (local140.method27169() || local140.method27086()) {
						local140.method27089();
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_10.anInt4702 * -1084743407 && this.aClass378_1.anInt4702 * -1084743407 < Class378.aClass378_2.anInt4702 * -1084743407) {
				if (Class378.aClass378_7 == this.aClass378_1) {
					this.aClass378_1 = Class378.aClass378_2;
				} else {
					this.aClass378_1 = Class378.aClass378_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!oh", name = "ad", descriptor = "()V", line = 167)
	public void method26862() {
		if (this.aClass378_1 == Class378.aClass378_4) {
			@Pc(8) Class475 local8 = this.anInterface52_1.method29156();
			if (Class475.aClass475_3 == local8) {
				this.aClass378_1 = Class378.aClass378_5;
			}
		}
		@Pc(38) boolean local38;
		if (Class378.aClass378_5 == this.aClass378_1 && this.aBoolean725) {
			@Pc(31) Class371 local31 = this.aClass48_2.method9510(this.anInterface52_1.method29119());
			if (local31 != null) {
				local38 = this.anInterface52_1.method29115();
				@Pc(43) Class353 local43 = new Class353(this);
				@Pc(84) boolean local84 = local31.method27092(local38 ? null : this.anInterface52_1.method29117(0), local38 ? local43 : null, this.anInt4651 * 101107831, this.anInt4650 * 1144248071 > 0 ? 0.0F : this.aFloat289, this.aBoolean726, this.anInt4649 * -601144693, this.aFloat290, this);
				if (local84) {
					this.aClass378_1 = Class378.aClass378_10;
					local31.method27095(this.anInterface41_5);
					local31.method27083(this.aFloat289, this.anInt4650 * 1144248071);
					local31.method27177();
					this.aList14.add(local31);
					this.aBoolean725 = false;
				} else {
					if (local31.method27136() == Class375.aClass375_3) {
						this.aClass378_1 = Class378.aClass378_8;
					}
					local31.method27089();
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList14.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class371 local140 = (Class371) local131.next();
				if (local140.method27120() == this) {
					if (Class378.aClass378_7 == this.aClass378_1) {
						if (local140.method27091() == 0.0F) {
							local140.method27094();
						} else {
							local38 = false;
						}
					}
					if (local140.method27169() || local140.method27086()) {
						local140.method27089();
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass378_1.anInt4702 * -1084743407 >= Class378.aClass378_10.anInt4702 * -1084743407 && this.aClass378_1.anInt4702 * -1084743407 < Class378.aClass378_2.anInt4702 * -1084743407) {
				if (Class378.aClass378_7 == this.aClass378_1) {
					this.aClass378_1 = Class378.aClass378_2;
				} else {
					this.aClass378_1 = Class378.aClass378_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)Lclient!ov;", line = 230)
	public Class378 method26844() {
		return this.aClass378_1;
	}

	@OriginalMember(owner = "client!oh", name = "bp", descriptor = "(Ljava/lang/Object;)V", line = 234)
	public void method26836(@OriginalArg(0) Object arg0) {
		this.anObject21 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "ac", descriptor = "(Ljava/lang/Object;)V", line = 234)
	public void method26864(@OriginalArg(0) Object arg0) {
		this.anObject21 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "aw", descriptor = "(Ljava/lang/Object;)V", line = 234)
	public void method26866(@OriginalArg(0) Object arg0) {
		this.anObject21 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "bw", descriptor = "(Ljava/lang/Object;)V", line = 234)
	public void method26877(@OriginalArg(0) Object arg0) {
		this.anObject21 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "(Ljava/lang/Object;I)V", line = 234)
	public void method26886(@OriginalArg(0) Object arg0) {
		this.anObject21 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "(B)Ljava/lang/Object;", line = 238)
	public Object method26826() {
		return this.anObject21;
	}

	@OriginalMember(owner = "client!oh", name = "bd", descriptor = "()Ljava/lang/Object;", line = 238)
	public Object method26827() {
		return this.anObject21;
	}

	@OriginalMember(owner = "client!oh", name = "bs", descriptor = "()Ljava/lang/Object;", line = 238)
	public Object method26868() {
		return this.anObject21;
	}

	@OriginalMember(owner = "client!oh", name = "bf", descriptor = "(Ljava/lang/Object;)V", line = 242)
	public void method26813(@OriginalArg(0) Object arg0) {
		this.anObject22 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "(Ljava/lang/Object;I)V", line = 242)
	public void method26820(@OriginalArg(0) Object arg0) {
		this.anObject22 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "bm", descriptor = "(Ljava/lang/Object;)V", line = 242)
	public void method26869(@OriginalArg(0) Object arg0) {
		this.anObject22 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "bt", descriptor = "(Ljava/lang/Object;)V", line = 242)
	public void method26871(@OriginalArg(0) Object arg0) {
		this.anObject22 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "by", descriptor = "()Ljava/lang/Object;", line = 246)
	public Object method26854() {
		return this.anObject22;
	}

	@OriginalMember(owner = "client!oh", name = "bl", descriptor = "()Ljava/lang/Object;", line = 246)
	public Object method26857() {
		return this.anObject22;
	}

	@OriginalMember(owner = "client!oh", name = "br", descriptor = "()Ljava/lang/Object;", line = 246)
	public Object method26863() {
		return this.anObject22;
	}

	@OriginalMember(owner = "client!oh", name = "bk", descriptor = "()Ljava/lang/Object;", line = 246)
	public Object method26872() {
		return this.anObject22;
	}

	@OriginalMember(owner = "client!oh", name = "bg", descriptor = "()Ljava/lang/Object;", line = 246)
	public Object method26873() {
		return this.anObject22;
	}

	@OriginalMember(owner = "client!oh", name = "bb", descriptor = "()Ljava/lang/Object;", line = 246)
	public Object method26875() {
		return this.anObject22;
	}

	@OriginalMember(owner = "client!oh", name = "bi", descriptor = "()Ljava/lang/Object;", line = 246)
	public Object method26878() {
		return this.anObject22;
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 246)
	public Object method26881() {
		return this.anObject22;
	}

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "(B)I", line = 250)
	public int method26829() {
		return this.anInt4651 * 101107831;
	}

	@OriginalMember(owner = "client!oh", name = "ba", descriptor = "()I", line = 250)
	public int method26845() {
		return this.anInt4651 * 101107831;
	}

	@OriginalMember(owner = "client!oh", name = "bu", descriptor = "()I", line = 250)
	public int method26879() {
		return this.anInt4651 * 101107831;
	}

	@OriginalMember(owner = "client!oh", name = "bo", descriptor = "(I)V", line = 254)
	public void method26842(@OriginalArg(0) int arg0) {
		this.anInt4651 = arg0 * -809135801;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(II)V", line = 254)
	public void method26876(@OriginalArg(0) int arg0) {
		this.anInt4651 = arg0 * -809135801;
	}

	@OriginalMember(owner = "client!oh", name = "bn", descriptor = "(I)V", line = 254)
	public void method26880(@OriginalArg(0) int arg0) {
		this.anInt4651 = arg0 * -809135801;
	}

	@OriginalMember(owner = "client!oh", name = "bc", descriptor = "(I)V", line = 254)
	public void method26882(@OriginalArg(0) int arg0) {
		this.anInt4651 = arg0 * -809135801;
	}

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "(ZI)V", line = 257)
	public void method26831() {
	}

	@OriginalMember(owner = "client!oh", name = "be", descriptor = "(Z)V", line = 257)
	public void method26884() {
	}

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "(I)Lclient!tn;", line = 260)
	public Interface52 method26832() {
		return this.anInterface52_1;
	}

	@OriginalMember(owner = "client!oh", name = "bx", descriptor = "()Lclient!tn;", line = 260)
	public Interface52 method26899() {
		return this.anInterface52_1;
	}

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "(Lclient!mh;I)V", line = 264)
	public void method26833(@OriginalArg(0) Class320 arg0) {
		this.aClass320_62 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "bh", descriptor = "(Lclient!mh;)V", line = 264)
	public void method26865(@OriginalArg(0) Class320 arg0) {
		this.aClass320_62 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "(I)Lclient!mh;", line = 268)
	public Class320 method26834() {
		return this.aClass320_62;
	}

	@OriginalMember(owner = "client!oh", name = "bj", descriptor = "()Lclient!mh;", line = 268)
	public Class320 method26887() {
		return this.aClass320_62;
	}

	@OriginalMember(owner = "client!oh", name = "bq", descriptor = "()Lclient!mh;", line = 268)
	public Class320 method26888() {
		return this.aClass320_62;
	}

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "(I)F", line = 272)
	public float method26835() {
		return this.aFloat291;
	}

	@OriginalMember(owner = "client!oh", name = "bv", descriptor = "()F", line = 272)
	public float method26889() {
		return this.aFloat291;
	}

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "(S)F", line = 276)
	public float method26900() {
		return this.aFloat292;
	}

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "(FB)V", line = 280)
	public void method26837(@OriginalArg(0) float arg0) {
		this.aFloat291 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(FB)V", line = 284)
	public void method26838(@OriginalArg(0) float arg0) {
		this.aFloat292 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "bz", descriptor = "(F)V", line = 284)
	public void method26890(@OriginalArg(0) float arg0) {
		this.aFloat292 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "(IZI)V", line = 288)
	public void method26839(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean727 = arg1;
		this.anInt4652 = arg0 * -1937241627;
	}

	@OriginalMember(owner = "client!oh", name = "ck", descriptor = "(IZ)V", line = 288)
	public void method26891(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean727 = arg1;
		this.anInt4652 = arg0 * -1937241627;
	}

	@OriginalMember(owner = "client!oh", name = "cm", descriptor = "(IZ)V", line = 288)
	public void method26892(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean727 = arg1;
		this.anInt4652 = arg0 * -1937241627;
	}

	@OriginalMember(owner = "client!oh", name = "at", descriptor = "(I)Z", line = 293)
	public boolean method26840() {
		this.aBoolean727 = false;
		return this.anInt4652 * -1795552275 != 0;
	}

	@OriginalMember(owner = "client!oh", name = "cj", descriptor = "()Z", line = 293)
	public boolean method26893() {
		this.aBoolean727 = false;
		return this.anInt4652 * -1795552275 != 0;
	}

	@OriginalMember(owner = "client!oh", name = "cu", descriptor = "()Z", line = 293)
	public boolean method26894() {
		this.aBoolean727 = false;
		return this.anInt4652 * -1795552275 != 0;
	}

	@OriginalMember(owner = "client!oh", name = "cv", descriptor = "()Z", line = 293)
	public boolean method26895() {
		this.aBoolean727 = false;
		return this.anInt4652 * -1795552275 != 0;
	}

	@OriginalMember(owner = "client!oh", name = "af", descriptor = "(I)V", line = 298)
	public void method26841() {
		if (this.anInt4652 * -1795552275 > -1 && !this.aBoolean727) {
			this.anInt4652 -= -1937241627;
		}
		if (this.anInt4652 * -1795552275 == 0) {
			this.method26818();
		}
	}

	@OriginalMember(owner = "client!oh", name = "cl", descriptor = "()V", line = 298)
	public void method26896() {
		if (this.anInt4652 * -1795552275 > -1 && !this.aBoolean727) {
			this.anInt4652 -= -1937241627;
		}
		if (this.anInt4652 * -1795552275 == 0) {
			this.method26818();
		}
	}

	@OriginalMember(owner = "client!oh", name = "cq", descriptor = "()V", line = 298)
	public void method26897() {
		if (this.anInt4652 * -1795552275 > -1 && !this.aBoolean727) {
			this.anInt4652 -= -1937241627;
		}
		if (this.anInt4652 * -1795552275 == 0) {
			this.method26818();
		}
	}

	@OriginalMember(owner = "client!oh", name = "cg", descriptor = "(FI)V", line = 303)
	public void method26824(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat289 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList14.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class371 local15 = (Class371) local8.next();
			if (local15.method27120() == this) {
				local15.method27083(this.aFloat289, arg1);
				local4++;
			} else {
				this.aList14.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt4650 = arg1 * 754443959;
		}
	}

	@OriginalMember(owner = "client!oh", name = "ak", descriptor = "(FII)V", line = 303)
	public void method26828(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat289 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList14.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class371 local15 = (Class371) local8.next();
			if (local15.method27120() == this) {
				local15.method27083(this.aFloat289, arg1);
				local4++;
			} else {
				this.aList14.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt4650 = arg1 * 754443959;
		}
	}

	@OriginalMember(owner = "client!oh", name = "cp", descriptor = "(FI)V", line = 303)
	public void method26870(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat289 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList14.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class371 local15 = (Class371) local8.next();
			if (local15.method27120() == this) {
				local15.method27083(this.aFloat289, arg1);
				local4++;
			} else {
				this.aList14.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt4650 = arg1 * 754443959;
		}
	}

	@OriginalMember(owner = "client!oh", name = "aa", descriptor = "(ZII)V", line = 322)
	public void method26843(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean726 = arg0;
		this.anInt4649 = arg1 * 728864035;
	}

	@OriginalMember(owner = "client!oh", name = "cc", descriptor = "(ZI)V", line = 322)
	public void method26883(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean726 = arg0;
		this.anInt4649 = arg1 * 728864035;
	}

	@OriginalMember(owner = "client!oh", name = "cs", descriptor = "(ZI)V", line = 322)
	public void method26901(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean726 = arg0;
		this.anInt4649 = arg1 * 728864035;
	}

	@OriginalMember(owner = "client!oh", name = "ah", descriptor = "(FB)V", line = 327)
	public void method26898(@OriginalArg(0) float arg0) {
		if (!(arg0 < 0.0F)) {
			this.aFloat290 = arg0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "ct", descriptor = "(F)V", line = 327)
	public void method26902(@OriginalArg(0) float arg0) {
		if (!(arg0 < 0.0F)) {
			this.aFloat290 = arg0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "zo", descriptor = "(Lclient!vs;B)V", line = 8596)
	static final void method26904(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = arg0.aClass245_4.aStringArray15[local12];
	}

	@OriginalMember(owner = "client!oh", name = "atw", descriptor = "(Lclient!vs;I)V", line = 12457)
	static final void method26905(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method14599(local12);
	}
}
