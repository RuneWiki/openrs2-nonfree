package com.jagex;

import java.nio.ByteBuffer;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public class Class244 {

	@OriginalMember(owner = "client!it", name = "z", descriptor = "Lclient!dr;")
	Interface13 anInterface13_1;

	@OriginalMember(owner = "client!it", name = "u", descriptor = "Lclient!da;")
	Interface10 anInterface10_2;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "Lclient!jt;")
	Interface29 anInterface29_1;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "Lclient!jt;")
	Interface29 anInterface29_2;

	@OriginalMember(owner = "client!it", name = "x", descriptor = "Lclient!jt;")
	Interface29 anInterface29_3;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "Lclient!iy;")
	Class37 aClass37_23;

	@OriginalMember(owner = "client!it", name = "s", descriptor = "Lclient!da;")
	Interface10 anInterface10_3;

	@OriginalMember(owner = "client!it", name = "y", descriptor = "Lclient!da;")
	Interface10 anInterface10_4;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Lclient!dr;")
	Interface13 anInterface13_2;

	@OriginalMember(owner = "client!it", name = "r", descriptor = "Z")
	boolean aBoolean683;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "Lclient!da;")
	Interface10 anInterface10_5;

	@OriginalMember(owner = "client!it", name = "q", descriptor = "Lclient!if;")
	Interface21 anInterface21_18;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "Lclient!abj;")
	Class19_Sub1 aClass19_Sub1_1;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "Lclient!abj;")
	Class19_Sub1 aClass19_Sub1_2;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Ljava/util/Vector;")
	Vector aVector1 = new Vector();

	@OriginalMember(owner = "client!it", name = "v", descriptor = "I")
	int anInt3781 = 0;

	@OriginalMember(owner = "client!it", name = "t", descriptor = "I")
	int anInt3784 = 0;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "Lclient!abv;")
	Class21_Sub3 aClass21_Sub3_37;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Lclient!dj;")
	Class127 aClass127_28;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "I")
	int anInt3782;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "I")
	int anInt3783;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!abv;II)V", line = 31)
	Class244(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass21_Sub3_37 = arg0;
		this.aClass127_28 = Class127.aClass127_23;
		this.anInt3782 = arg1;
		this.anInt3783 = arg2;
	}

	@OriginalMember(owner = "client!it", name = "p", descriptor = "()V", line = 39)
	void method24765() {
		if (this.anInterface21_18 != null) {
			return;
		}
		this.anInterface21_18 = this.aClass21_Sub3_37.method17542(false);
		this.anInterface21_18.method25687(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass21_Sub3_37.aByteBuffer4;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface21_18.method25705(0, local19.position(), this.aClass21_Sub3_37.aLong101);
		this.aClass37_23 = this.aClass21_Sub3_37.method17590(new Class252[] { new Class252(Class240.aClass240_3) });
	}

	@OriginalMember(owner = "client!it", name = "j", descriptor = "()V", line = 39)
	void method24792() {
		if (this.anInterface21_18 != null) {
			return;
		}
		this.anInterface21_18 = this.aClass21_Sub3_37.method17542(false);
		this.anInterface21_18.method25687(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass21_Sub3_37.aByteBuffer4;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface21_18.method25705(0, local19.position(), this.aClass21_Sub3_37.aLong101);
		this.aClass37_23 = this.aClass21_Sub3_37.method17590(new Class252[] { new Class252(Class240.aClass240_3) });
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "()V", line = 52)
	void method24766() {
		this.aClass21_Sub3_37.method17544(0, this.anInterface21_18);
		this.aClass21_Sub3_37.method17738(this.aClass37_23);
		this.aClass21_Sub3_37.method17554(Class263.aClass263_4, 0, 1);
	}

	@OriginalMember(owner = "client!it", name = "n", descriptor = "()V", line = 52)
	void method24778() {
		this.aClass21_Sub3_37.method17544(0, this.anInterface21_18);
		this.aClass21_Sub3_37.method17738(this.aClass37_23);
		this.aClass21_Sub3_37.method17554(Class263.aClass263_4, 0, 1);
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "()V", line = 52)
	void method24779() {
		this.aClass21_Sub3_37.method17544(0, this.anInterface21_18);
		this.aClass21_Sub3_37.method17738(this.aClass37_23);
		this.aClass21_Sub3_37.method17554(Class263.aClass263_4, 0, 1);
	}

	@OriginalMember(owner = "client!it", name = "r", descriptor = "()V", line = 52)
	void method24780() {
		this.aClass21_Sub3_37.method17544(0, this.anInterface21_18);
		this.aClass21_Sub3_37.method17738(this.aClass37_23);
		this.aClass21_Sub3_37.method17554(Class263.aClass263_4, 0, 1);
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "()V", line = 52)
	void method24781() {
		this.aClass21_Sub3_37.method17544(0, this.anInterface21_18);
		this.aClass21_Sub3_37.method17738(this.aClass37_23);
		this.aClass21_Sub3_37.method17554(Class263.aClass263_4, 0, 1);
	}

	@OriginalMember(owner = "client!it", name = "g", descriptor = "()V", line = 58)
	void method24767() {
		this.method24765();
		switch(this.anInt3781) {
			case 0:
				this.aClass127_28 = Class127.aClass127_23;
				break;
			case 1:
				this.aClass127_28 = Class127.aClass127_24;
				break;
			case 2:
				this.aClass127_28 = Class127.aClass127_20;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass19_Sub1_1 = this.aClass21_Sub3_37.method17047();
		if (this.aClass21_Sub3_37.anInt2522 > 1 && this.aClass21_Sub3_37.aBoolean444 && this.aClass21_Sub3_37.aBoolean445) {
			this.aClass19_Sub1_2 = this.aClass21_Sub3_37.method17047();
			this.anInterface10_5 = this.aClass21_Sub3_37.method17048(this.anInt3782, this.anInt3783, Class121.aClass121_17, this.aClass127_28, this.aClass21_Sub3_37.anInt2522);
			this.anInterface13_1 = this.aClass21_Sub3_37.method17329(this.anInt3782, this.anInt3783, this.aClass21_Sub3_37.anInt2522);
		}
		this.anInterface29_1 = this.aClass21_Sub3_37.method17510(Class121.aClass121_17, this.aClass127_28, this.anInt3782, this.anInt3783);
		this.anInterface10_3 = this.anInterface29_1.method8963(0);
		this.anInterface29_2 = this.aClass21_Sub3_37.method17510(Class121.aClass121_17, this.aClass127_28, this.anInt3782, this.anInt3783);
		this.anInterface10_2 = this.anInterface29_2.method8963(0);
		this.anInterface29_3 = this.aClass21_Sub3_37.method17510(Class121.aClass121_17, this.aClass127_28, this.anInt3782, this.anInt3783);
		this.anInterface10_4 = this.anInterface29_3.method8963(0);
		this.anInterface13_2 = this.aClass21_Sub3_37.method17049(this.anInterface29_3.method8961(), this.anInterface29_3.method8931());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class38 local149 = (Class38) this.aVector1.elementAt(local140);
			local149.method8200(this.anInt3782, this.anInt3783);
		}
	}

	@OriginalMember(owner = "client!it", name = "m", descriptor = "()V", line = 58)
	void method24776() {
		this.method24765();
		switch(this.anInt3781) {
			case 0:
				this.aClass127_28 = Class127.aClass127_23;
				break;
			case 1:
				this.aClass127_28 = Class127.aClass127_24;
				break;
			case 2:
				this.aClass127_28 = Class127.aClass127_20;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass19_Sub1_1 = this.aClass21_Sub3_37.method17047();
		if (this.aClass21_Sub3_37.anInt2522 > 1 && this.aClass21_Sub3_37.aBoolean444 && this.aClass21_Sub3_37.aBoolean445) {
			this.aClass19_Sub1_2 = this.aClass21_Sub3_37.method17047();
			this.anInterface10_5 = this.aClass21_Sub3_37.method17048(this.anInt3782, this.anInt3783, Class121.aClass121_17, this.aClass127_28, this.aClass21_Sub3_37.anInt2522);
			this.anInterface13_1 = this.aClass21_Sub3_37.method17329(this.anInt3782, this.anInt3783, this.aClass21_Sub3_37.anInt2522);
		}
		this.anInterface29_1 = this.aClass21_Sub3_37.method17510(Class121.aClass121_17, this.aClass127_28, this.anInt3782, this.anInt3783);
		this.anInterface10_3 = this.anInterface29_1.method8963(0);
		this.anInterface29_2 = this.aClass21_Sub3_37.method17510(Class121.aClass121_17, this.aClass127_28, this.anInt3782, this.anInt3783);
		this.anInterface10_2 = this.anInterface29_2.method8963(0);
		this.anInterface29_3 = this.aClass21_Sub3_37.method17510(Class121.aClass121_17, this.aClass127_28, this.anInt3782, this.anInt3783);
		this.anInterface10_4 = this.anInterface29_3.method8963(0);
		this.anInterface13_2 = this.aClass21_Sub3_37.method17049(this.anInterface29_3.method8961(), this.anInterface29_3.method8931());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class38 local149 = (Class38) this.aVector1.elementAt(local140);
			local149.method8200(this.anInt3782, this.anInt3783);
		}
	}

	@OriginalMember(owner = "client!it", name = "q", descriptor = "()V", line = 58)
	void method24783() {
		this.method24765();
		switch(this.anInt3781) {
			case 0:
				this.aClass127_28 = Class127.aClass127_23;
				break;
			case 1:
				this.aClass127_28 = Class127.aClass127_24;
				break;
			case 2:
				this.aClass127_28 = Class127.aClass127_20;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass19_Sub1_1 = this.aClass21_Sub3_37.method17047();
		if (this.aClass21_Sub3_37.anInt2522 > 1 && this.aClass21_Sub3_37.aBoolean444 && this.aClass21_Sub3_37.aBoolean445) {
			this.aClass19_Sub1_2 = this.aClass21_Sub3_37.method17047();
			this.anInterface10_5 = this.aClass21_Sub3_37.method17048(this.anInt3782, this.anInt3783, Class121.aClass121_17, this.aClass127_28, this.aClass21_Sub3_37.anInt2522);
			this.anInterface13_1 = this.aClass21_Sub3_37.method17329(this.anInt3782, this.anInt3783, this.aClass21_Sub3_37.anInt2522);
		}
		this.anInterface29_1 = this.aClass21_Sub3_37.method17510(Class121.aClass121_17, this.aClass127_28, this.anInt3782, this.anInt3783);
		this.anInterface10_3 = this.anInterface29_1.method8963(0);
		this.anInterface29_2 = this.aClass21_Sub3_37.method17510(Class121.aClass121_17, this.aClass127_28, this.anInt3782, this.anInt3783);
		this.anInterface10_2 = this.anInterface29_2.method8963(0);
		this.anInterface29_3 = this.aClass21_Sub3_37.method17510(Class121.aClass121_17, this.aClass127_28, this.anInt3782, this.anInt3783);
		this.anInterface10_4 = this.anInterface29_3.method8963(0);
		this.anInterface13_2 = this.aClass21_Sub3_37.method17049(this.anInterface29_3.method8961(), this.anInterface29_3.method8931());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class38 local149 = (Class38) this.aVector1.elementAt(local140);
			local149.method8200(this.anInt3782, this.anInt3783);
		}
	}

	@OriginalMember(owner = "client!it", name = "l", descriptor = "(Lclient!is;)Z", line = 93)
	boolean method24768(@OriginalArg(0) Class38 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method8204() < this.method24770(local7).method8204()) {
				local5 = true;
				if (!this.method24775(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method24770(local7));
		}
		if (local5 || this.method24775(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!it", name = "w", descriptor = "(Lclient!is;)Z", line = 93)
	boolean method24772(@OriginalArg(0) Class38 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method8204() < this.method24770(local7).method8204()) {
				local5 = true;
				if (!this.method24775(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method24770(local7));
		}
		if (local5 || this.method24775(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!it", name = "v", descriptor = "(Lclient!is;)Z", line = 93)
	boolean method24784(@OriginalArg(0) Class38 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method8204() < this.method24770(local7).method8204()) {
				local5 = true;
				if (!this.method24775(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method24770(local7));
		}
		if (local5 || this.method24775(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!it", name = "t", descriptor = "(Lclient!is;)Z", line = 93)
	boolean method24785(@OriginalArg(0) Class38 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method8204() < this.method24770(local7).method8204()) {
				local5 = true;
				if (!this.method24775(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method24770(local7));
		}
		if (local5 || this.method24775(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!it", name = "i", descriptor = "(Ljava/util/Vector;ILclient!is;)Z", line = 110)
	boolean method24773(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		if (!arg2.method8196() && !arg2.method8197()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method8200(this.anInt3782, this.anInt3783);
		@Pc(18) int local18 = arg2.method8205();
		if (local18 > this.anInt3781) {
			this.anInt3781 = local18;
		}
		arg2.aBoolean182 = true;
		return true;
	}

	@OriginalMember(owner = "client!it", name = "h", descriptor = "(Ljava/util/Vector;ILclient!is;)Z", line = 110)
	boolean method24775(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		if (!arg2.method8196() && !arg2.method8197()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method8200(this.anInt3782, this.anInt3783);
		@Pc(18) int local18 = arg2.method8205();
		if (local18 > this.anInt3781) {
			this.anInt3781 = local18;
		}
		arg2.aBoolean182 = true;
		return true;
	}

	@OriginalMember(owner = "client!it", name = "o", descriptor = "(Ljava/util/Vector;ILclient!is;)Z", line = 110)
	boolean method24786(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		if (!arg2.method8196() && !arg2.method8197()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method8200(this.anInt3782, this.anInt3783);
		@Pc(18) int local18 = arg2.method8205();
		if (local18 > this.anInt3781) {
			this.anInt3781 = local18;
		}
		arg2.aBoolean182 = true;
		return true;
	}

	@OriginalMember(owner = "client!it", name = "f", descriptor = "(Ljava/util/Vector;ILclient!is;)Z", line = 110)
	boolean method24788(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		if (!arg2.method8196() && !arg2.method8197()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method8200(this.anInt3782, this.anInt3783);
		@Pc(18) int local18 = arg2.method8205();
		if (local18 > this.anInt3781) {
			this.anInt3781 = local18;
		}
		arg2.aBoolean182 = true;
		return true;
	}

	@OriginalMember(owner = "client!it", name = "x", descriptor = "(Lclient!is;)V", line = 124)
	void method24769(@OriginalArg(0) Class38 arg0) {
		arg0.method8199();
		arg0.aBoolean182 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!it", name = "k", descriptor = "(Lclient!is;)V", line = 124)
	void method24789(@OriginalArg(0) Class38 arg0) {
		arg0.method8199();
		arg0.aBoolean182 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!it", name = "ak", descriptor = "(I)Lclient!is;", line = 130)
	Class38 method24764(@OriginalArg(0) int arg0) {
		return (Class38) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!it", name = "s", descriptor = "(I)Lclient!is;", line = 130)
	Class38 method24770(@OriginalArg(0) int arg0) {
		return (Class38) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!it", name = "at", descriptor = "(I)Lclient!is;", line = 130)
	Class38 method24790(@OriginalArg(0) int arg0) {
		return (Class38) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!it", name = "af", descriptor = "(I)Lclient!is;", line = 130)
	Class38 method24791(@OriginalArg(0) int arg0) {
		return (Class38) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!it", name = "u", descriptor = "()Z", line = 134)
	boolean method24782() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class38) this.aVector1.elementAt(local5)).method8208()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!it", name = "aa", descriptor = "()Z", line = 134)
	boolean method24793() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class38) this.aVector1.elementAt(local5)).method8208()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!it", name = "ah", descriptor = "()Z", line = 134)
	boolean method24794() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class38) this.aVector1.elementAt(local5)).method8208()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!it", name = "y", descriptor = "(IIII)Z", line = 140)
	boolean method24771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aVector1.isEmpty() || this.method24782()) {
			return false;
		}
		if (this.anInt3782 != arg2 || this.anInt3783 != arg3 || this.aClass21_Sub3_37.anInt2522 != this.anInt3784) {
			this.anInt3784 = this.aClass21_Sub3_37.anInt2522;
			this.anInt3782 = arg2;
			this.anInt3783 = arg3;
			this.method24777();
			this.method24767();
		}
		this.aClass19_Sub1_1.method20882(0, this.anInterface10_4);
		if (this.anInterface13_2 != null) {
			this.aClass19_Sub1_1.method20880(this.anInterface13_2);
		}
		if (this.aClass19_Sub1_2 == null) {
			this.aClass21_Sub3_37.method17044(this.aClass19_Sub1_1);
		} else {
			this.aClass19_Sub1_2.method20882(0, this.anInterface10_5);
			this.aClass19_Sub1_2.method20880(this.anInterface13_1);
			this.aClass21_Sub3_37.method17044(this.aClass19_Sub1_2);
		}
		this.aClass21_Sub3_37.method17061(3, -16777216);
		this.aClass21_Sub3_37.method17532(15);
		this.aClass21_Sub3_37.method17530(0);
		if (!this.aClass19_Sub1_1.method20883()) {
			throw new RuntimeException("");
		}
		this.aBoolean683 = true;
		return true;
	}

	@OriginalMember(owner = "client!it", name = "an", descriptor = "(IIII)Z", line = 140)
	boolean method24795(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		if (this.aVector1.isEmpty() || this.method24782()) {
			return false;
		}
		if (this.anInt3782 != arg0 || this.anInt3783 != arg1 || this.aClass21_Sub3_37.anInt2522 != this.anInt3784) {
			this.anInt3784 = this.aClass21_Sub3_37.anInt2522;
			this.anInt3782 = arg0;
			this.anInt3783 = arg1;
			this.method24777();
			this.method24767();
		}
		this.aClass19_Sub1_1.method20882(0, this.anInterface10_4);
		if (this.anInterface13_2 != null) {
			this.aClass19_Sub1_1.method20880(this.anInterface13_2);
		}
		if (this.aClass19_Sub1_2 == null) {
			this.aClass21_Sub3_37.method17044(this.aClass19_Sub1_1);
		} else {
			this.aClass19_Sub1_2.method20882(0, this.anInterface10_5);
			this.aClass19_Sub1_2.method20880(this.anInterface13_1);
			this.aClass21_Sub3_37.method17044(this.aClass19_Sub1_2);
		}
		this.aClass21_Sub3_37.method17061(3, -16777216);
		this.aClass21_Sub3_37.method17532(15);
		this.aClass21_Sub3_37.method17530(0);
		if (!this.aClass19_Sub1_1.method20883()) {
			throw new RuntimeException("");
		}
		this.aBoolean683 = true;
		return true;
	}

	@OriginalMember(owner = "client!it", name = "aj", descriptor = "(IIII)Z", line = 140)
	boolean method24796(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		if (this.aVector1.isEmpty() || this.method24782()) {
			return false;
		}
		if (this.anInt3782 != arg0 || this.anInt3783 != arg1 || this.aClass21_Sub3_37.anInt2522 != this.anInt3784) {
			this.anInt3784 = this.aClass21_Sub3_37.anInt2522;
			this.anInt3782 = arg0;
			this.anInt3783 = arg1;
			this.method24777();
			this.method24767();
		}
		this.aClass19_Sub1_1.method20882(0, this.anInterface10_4);
		if (this.anInterface13_2 != null) {
			this.aClass19_Sub1_1.method20880(this.anInterface13_2);
		}
		if (this.aClass19_Sub1_2 == null) {
			this.aClass21_Sub3_37.method17044(this.aClass19_Sub1_1);
		} else {
			this.aClass19_Sub1_2.method20882(0, this.anInterface10_5);
			this.aClass19_Sub1_2.method20880(this.anInterface13_1);
			this.aClass21_Sub3_37.method17044(this.aClass19_Sub1_2);
		}
		this.aClass21_Sub3_37.method17061(3, -16777216);
		this.aClass21_Sub3_37.method17532(15);
		this.aClass21_Sub3_37.method17530(0);
		if (!this.aClass19_Sub1_1.method20883()) {
			throw new RuntimeException("");
		}
		this.aBoolean683 = true;
		return true;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "()V", line = 169)
	void method24774() {
		if (!this.aBoolean683) {
			return;
		}
		if (this.aClass19_Sub1_2 != null) {
			this.aClass21_Sub3_37.method17263(this.aClass19_Sub1_2);
			this.aClass21_Sub3_37.method17044(this.aClass19_Sub1_1);
			this.aClass19_Sub1_2.method20884(0, 0, this.anInt3782, this.anInt3783, 0, 0, true, this.anInterface13_2 != null);
		}
		this.method24787();
		this.aBoolean683 = false;
	}

	@OriginalMember(owner = "client!it", name = "as", descriptor = "()V", line = 169)
	void method24797() {
		if (!this.aBoolean683) {
			return;
		}
		if (this.aClass19_Sub1_2 != null) {
			this.aClass21_Sub3_37.method17263(this.aClass19_Sub1_2);
			this.aClass21_Sub3_37.method17044(this.aClass19_Sub1_1);
			this.aClass19_Sub1_2.method20884(0, 0, this.anInt3782, this.anInt3783, 0, 0, true, this.anInterface13_2 != null);
		}
		this.method24787();
		this.aBoolean683 = false;
	}

	@OriginalMember(owner = "client!it", name = "ai", descriptor = "()V", line = 169)
	void method24798() {
		if (!this.aBoolean683) {
			return;
		}
		if (this.aClass19_Sub1_2 != null) {
			this.aClass21_Sub3_37.method17263(this.aClass19_Sub1_2);
			this.aClass21_Sub3_37.method17044(this.aClass19_Sub1_1);
			this.aClass19_Sub1_2.method20884(0, 0, this.anInt3782, this.anInt3783, 0, 0, true, this.anInterface13_2 != null);
		}
		this.method24787();
		this.aBoolean683 = false;
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "()V", line = 182)
	void method24787() {
		this.aClass21_Sub3_37.method17059(true);
		this.aClass21_Sub3_37.method17556();
		this.aClass21_Sub3_37.method17469(0);
		this.aClass21_Sub3_37.method17710(1);
		this.aClass21_Sub3_37.method17056();
		this.aClass19_Sub1_1.method20880(null);
		this.aClass21_Sub3_37.method17471(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class38) this.aVector1.elementAt(local35)).method8208()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class38) this.aVector1.elementAt(local51)).method8208()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface29_3.method9883();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class38 local89 = (Class38) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method8203();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass19_Sub1_1.method20882(0, this.anInterface10_2);
				} else if (local101) {
					this.aClass21_Sub3_37.method17263(this.aClass19_Sub1_1);
				} else {
					local103 = true;
					this.aClass19_Sub1_1.method20882(0, this.anInterface10_4);
				}
				@Pc(140) Interface29 local140 = this.anInterface29_1;
				if (local105 == 0) {
					local140 = this.anInterface29_3;
				}
				local89.method8198(local105, this.aClass19_Sub1_1, local140, this.anInterface13_2, this.anInterface29_3, local101 && local105 == local92 - 1);
				this.method24766();
				local89.method8209(local105);
				if (local103) {
					this.anInterface29_3.method9883();
				}
				@Pc(179) Interface29 local179 = this.anInterface29_1;
				this.anInterface29_1 = this.anInterface29_2;
				this.anInterface29_2 = local179;
				@Pc(189) Interface10 local189 = this.anInterface10_3;
				this.anInterface10_3 = this.anInterface10_2;
				this.anInterface10_2 = local189;
			}
		}
		this.aClass21_Sub3_37.method17469(1);
		this.aClass21_Sub3_37.method17710(0);
		this.aClass21_Sub3_37.method17059(false);
	}

	@OriginalMember(owner = "client!it", name = "z", descriptor = "()V", line = 239)
	void method24777() {
		if (this.aClass19_Sub1_2 != null) {
			this.aClass19_Sub1_2.method21392();
			this.aClass19_Sub1_2 = null;
		}
		if (this.anInterface10_5 != null) {
			this.anInterface10_5.method27209();
			this.anInterface10_5 = null;
		}
		if (this.anInterface13_1 != null) {
			this.anInterface13_1.method27209();
			this.anInterface13_1 = null;
		}
		if (this.aClass19_Sub1_1 != null) {
			this.aClass19_Sub1_1.method21392();
		}
		if (this.anInterface10_3 != null) {
			this.anInterface10_3.method27209();
		}
		if (this.anInterface10_2 != null) {
			this.anInterface10_2.method27209();
		}
		if (this.anInterface10_4 != null) {
			this.anInterface10_4.method27209();
		}
		if (this.anInterface29_1 != null) {
			this.anInterface29_1.method27209();
		}
		if (this.anInterface29_2 != null) {
			this.anInterface29_2.method27209();
		}
		if (this.anInterface29_3 != null) {
			this.anInterface29_3.method27209();
		}
		if (this.anInterface13_2 != null) {
			this.anInterface13_2.method27209();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class38 local89 = (Class38) this.aVector1.elementAt(local80);
			local89.method8199();
		}
	}

	@OriginalMember(owner = "client!it", name = "aq", descriptor = "()V", line = 239)
	void method24799() {
		if (this.aClass19_Sub1_2 != null) {
			this.aClass19_Sub1_2.method21392();
			this.aClass19_Sub1_2 = null;
		}
		if (this.anInterface10_5 != null) {
			this.anInterface10_5.method27209();
			this.anInterface10_5 = null;
		}
		if (this.anInterface13_1 != null) {
			this.anInterface13_1.method27209();
			this.anInterface13_1 = null;
		}
		if (this.aClass19_Sub1_1 != null) {
			this.aClass19_Sub1_1.method21392();
		}
		if (this.anInterface10_3 != null) {
			this.anInterface10_3.method27209();
		}
		if (this.anInterface10_2 != null) {
			this.anInterface10_2.method27209();
		}
		if (this.anInterface10_4 != null) {
			this.anInterface10_4.method27209();
		}
		if (this.anInterface29_1 != null) {
			this.anInterface29_1.method27209();
		}
		if (this.anInterface29_2 != null) {
			this.anInterface29_2.method27209();
		}
		if (this.anInterface29_3 != null) {
			this.anInterface29_3.method27209();
		}
		if (this.anInterface13_2 != null) {
			this.anInterface13_2.method27209();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class38 local89 = (Class38) this.aVector1.elementAt(local80);
			local89.method8199();
		}
	}

	@OriginalMember(owner = "client!it", name = "av", descriptor = "()V", line = 239)
	void method24800() {
		if (this.aClass19_Sub1_2 != null) {
			this.aClass19_Sub1_2.method21392();
			this.aClass19_Sub1_2 = null;
		}
		if (this.anInterface10_5 != null) {
			this.anInterface10_5.method27209();
			this.anInterface10_5 = null;
		}
		if (this.anInterface13_1 != null) {
			this.anInterface13_1.method27209();
			this.anInterface13_1 = null;
		}
		if (this.aClass19_Sub1_1 != null) {
			this.aClass19_Sub1_1.method21392();
		}
		if (this.anInterface10_3 != null) {
			this.anInterface10_3.method27209();
		}
		if (this.anInterface10_2 != null) {
			this.anInterface10_2.method27209();
		}
		if (this.anInterface10_4 != null) {
			this.anInterface10_4.method27209();
		}
		if (this.anInterface29_1 != null) {
			this.anInterface29_1.method27209();
		}
		if (this.anInterface29_2 != null) {
			this.anInterface29_2.method27209();
		}
		if (this.anInterface29_3 != null) {
			this.anInterface29_3.method27209();
		}
		if (this.anInterface13_2 != null) {
			this.anInterface13_2.method27209();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class38 local89 = (Class38) this.aVector1.elementAt(local80);
			local89.method8199();
		}
	}
}
