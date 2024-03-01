package com.jagex;

import java.nio.ByteBuffer;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public class Class404 {

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "Lclient!mo;")
	Interface42 anInterface42_1;

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "Lclient!afq;")
	Class112_Sub1 aClass112_Sub1_4;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "Lclient!mo;")
	Interface42 anInterface42_2;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "Lclient!mo;")
	Interface42 anInterface42_3;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "Lclient!dp;")
	Interface18 anInterface18_2;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "Lclient!dp;")
	Interface18 anInterface18_3;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "Lclient!dp;")
	Interface18 anInterface18_4;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Lclient!dw;")
	Interface19 anInterface19_1;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "Lclient!dp;")
	Interface18 anInterface18_5;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
	int anInt4686;

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "Z")
	boolean aBoolean747;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "Lclient!dw;")
	Interface19 anInterface19_2;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "Lclient!lr;")
	Interface37 anInterface37_20;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "Lclient!lo;")
	Class145 aClass145_24;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "Lclient!afq;")
	Class112_Sub1 aClass112_Sub1_5;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	int anInt4687 = 0;

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "Ljava/util/Vector;")
	Vector aVector1 = new Vector();

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	int anInt4684 = 0;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	int anInt4688 = 0;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!afc;")
	Class104_Sub2 aClass104_Sub2_37;

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "Lclient!dg;")
	Class226 aClass226_29;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	int anInt4685;

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
	int anInt4683;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!afc;II)V", line = 33)
	Class404(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass104_Sub2_37 = arg0;
		this.aClass226_29 = Class226.aClass226_22;
		this.anInt4685 = arg1;
		this.anInt4683 = arg2;
	}

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "()V", line = 41)
	void method28519() {
		if (this.anInterface37_20 != null) {
			return;
		}
		this.anInterface37_20 = this.aClass104_Sub2_37.method21013(false);
		this.anInterface37_20.method29315(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass104_Sub2_37.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface37_20.method29333(0, local19.position(), this.aClass104_Sub2_37.aLong132);
		this.aClass145_24 = this.aClass104_Sub2_37.method20993(new Class400[] { new Class400(Class399.aClass399_3) });
	}

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "()V", line = 41)
	void method28532() {
		if (this.anInterface37_20 != null) {
			return;
		}
		this.anInterface37_20 = this.aClass104_Sub2_37.method21013(false);
		this.anInterface37_20.method29315(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass104_Sub2_37.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface37_20.method29333(0, local19.position(), this.aClass104_Sub2_37.aLong132);
		this.aClass145_24 = this.aClass104_Sub2_37.method20993(new Class400[] { new Class400(Class399.aClass399_3) });
	}

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "()V", line = 41)
	void method28540() {
		if (this.anInterface37_20 != null) {
			return;
		}
		this.anInterface37_20 = this.aClass104_Sub2_37.method21013(false);
		this.anInterface37_20.method29315(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass104_Sub2_37.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface37_20.method29333(0, local19.position(), this.aClass104_Sub2_37.aLong132);
		this.aClass145_24 = this.aClass104_Sub2_37.method20993(new Class400[] { new Class400(Class399.aClass399_3) });
	}

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "()V", line = 54)
	void method28518() {
		this.aClass104_Sub2_37.method21048(0, this.anInterface37_20);
		this.aClass104_Sub2_37.method21106(this.aClass145_24);
		this.aClass104_Sub2_37.method21005(Class424.aClass424_3, 0, 1);
	}

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "()V", line = 54)
	void method28520() {
		this.aClass104_Sub2_37.method21048(0, this.anInterface37_20);
		this.aClass104_Sub2_37.method21106(this.aClass145_24);
		this.aClass104_Sub2_37.method21005(Class424.aClass424_3, 0, 1);
	}

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "()V", line = 54)
	void method28535() {
		this.aClass104_Sub2_37.method21048(0, this.anInterface37_20);
		this.aClass104_Sub2_37.method21106(this.aClass145_24);
		this.aClass104_Sub2_37.method21005(Class424.aClass424_3, 0, 1);
	}

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "()V", line = 54)
	void method28542() {
		this.aClass104_Sub2_37.method21048(0, this.anInterface37_20);
		this.aClass104_Sub2_37.method21106(this.aClass145_24);
		this.aClass104_Sub2_37.method21005(Class424.aClass424_3, 0, 1);
	}

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "()V", line = 54)
	void method28546() {
		this.aClass104_Sub2_37.method21048(0, this.anInterface37_20);
		this.aClass104_Sub2_37.method21106(this.aClass145_24);
		this.aClass104_Sub2_37.method21005(Class424.aClass424_3, 0, 1);
	}

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "()V", line = 60)
	void method28531() {
		this.method28519();
		switch(this.anInt4684) {
			case 0:
				this.aClass226_29 = Class226.aClass226_22;
				break;
			case 1:
				this.aClass226_29 = Class226.aClass226_24;
				break;
			case 2:
				this.aClass226_29 = Class226.aClass226_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass112_Sub1_5 = this.aClass104_Sub2_37.method20444();
		if (this.aClass104_Sub2_37.anInt2951 > 1 && this.aClass104_Sub2_37.aBoolean473 && this.aClass104_Sub2_37.aBoolean485) {
			this.aClass112_Sub1_4 = this.aClass104_Sub2_37.method20444();
			this.anInterface18_4 = this.aClass104_Sub2_37.method20445(this.anInt4685, this.anInt4683, Class206.aClass206_22, this.aClass226_29, this.aClass104_Sub2_37.anInt2951);
			this.anInterface19_2 = this.aClass104_Sub2_37.method20655(this.anInt4685, this.anInt4683, this.aClass104_Sub2_37.anInt2951);
		}
		this.anInterface42_1 = this.aClass104_Sub2_37.method21017(Class206.aClass206_22, this.aClass226_29, this.anInt4685, this.anInt4683);
		this.anInterface18_2 = this.anInterface42_1.method11381(0);
		this.anInterface42_2 = this.aClass104_Sub2_37.method21017(Class206.aClass206_22, this.aClass226_29, this.anInt4685, this.anInt4683);
		this.anInterface18_3 = this.anInterface42_2.method11381(0);
		this.anInterface42_3 = this.aClass104_Sub2_37.method21017(Class206.aClass206_22, this.aClass226_29, this.anInt4685, this.anInt4683);
		this.anInterface18_5 = this.anInterface42_3.method11381(0);
		this.anInterface19_1 = this.aClass104_Sub2_37.method20420(this.anInterface42_3.method11362(), this.anInterface42_3.method11340());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class137 local149 = (Class137) this.aVector1.elementAt(local140);
			local149.method11463(this.anInt4685, this.anInt4683);
		}
	}

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "()V", line = 60)
	void method28537() {
		this.method28519();
		switch(this.anInt4684) {
			case 0:
				this.aClass226_29 = Class226.aClass226_22;
				break;
			case 1:
				this.aClass226_29 = Class226.aClass226_24;
				break;
			case 2:
				this.aClass226_29 = Class226.aClass226_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass112_Sub1_5 = this.aClass104_Sub2_37.method20444();
		if (this.aClass104_Sub2_37.anInt2951 > 1 && this.aClass104_Sub2_37.aBoolean473 && this.aClass104_Sub2_37.aBoolean485) {
			this.aClass112_Sub1_4 = this.aClass104_Sub2_37.method20444();
			this.anInterface18_4 = this.aClass104_Sub2_37.method20445(this.anInt4685, this.anInt4683, Class206.aClass206_22, this.aClass226_29, this.aClass104_Sub2_37.anInt2951);
			this.anInterface19_2 = this.aClass104_Sub2_37.method20655(this.anInt4685, this.anInt4683, this.aClass104_Sub2_37.anInt2951);
		}
		this.anInterface42_1 = this.aClass104_Sub2_37.method21017(Class206.aClass206_22, this.aClass226_29, this.anInt4685, this.anInt4683);
		this.anInterface18_2 = this.anInterface42_1.method11381(0);
		this.anInterface42_2 = this.aClass104_Sub2_37.method21017(Class206.aClass206_22, this.aClass226_29, this.anInt4685, this.anInt4683);
		this.anInterface18_3 = this.anInterface42_2.method11381(0);
		this.anInterface42_3 = this.aClass104_Sub2_37.method21017(Class206.aClass206_22, this.aClass226_29, this.anInt4685, this.anInt4683);
		this.anInterface18_5 = this.anInterface42_3.method11381(0);
		this.anInterface19_1 = this.aClass104_Sub2_37.method20420(this.anInterface42_3.method11362(), this.anInterface42_3.method11340());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class137 local149 = (Class137) this.aVector1.elementAt(local140);
			local149.method11463(this.anInt4685, this.anInt4683);
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "()V", line = 60)
	void method28538() {
		this.method28519();
		switch(this.anInt4684) {
			case 0:
				this.aClass226_29 = Class226.aClass226_22;
				break;
			case 1:
				this.aClass226_29 = Class226.aClass226_24;
				break;
			case 2:
				this.aClass226_29 = Class226.aClass226_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass112_Sub1_5 = this.aClass104_Sub2_37.method20444();
		if (this.aClass104_Sub2_37.anInt2951 > 1 && this.aClass104_Sub2_37.aBoolean473 && this.aClass104_Sub2_37.aBoolean485) {
			this.aClass112_Sub1_4 = this.aClass104_Sub2_37.method20444();
			this.anInterface18_4 = this.aClass104_Sub2_37.method20445(this.anInt4685, this.anInt4683, Class206.aClass206_22, this.aClass226_29, this.aClass104_Sub2_37.anInt2951);
			this.anInterface19_2 = this.aClass104_Sub2_37.method20655(this.anInt4685, this.anInt4683, this.aClass104_Sub2_37.anInt2951);
		}
		this.anInterface42_1 = this.aClass104_Sub2_37.method21017(Class206.aClass206_22, this.aClass226_29, this.anInt4685, this.anInt4683);
		this.anInterface18_2 = this.anInterface42_1.method11381(0);
		this.anInterface42_2 = this.aClass104_Sub2_37.method21017(Class206.aClass206_22, this.aClass226_29, this.anInt4685, this.anInt4683);
		this.anInterface18_3 = this.anInterface42_2.method11381(0);
		this.anInterface42_3 = this.aClass104_Sub2_37.method21017(Class206.aClass206_22, this.aClass226_29, this.anInt4685, this.anInt4683);
		this.anInterface18_5 = this.anInterface42_3.method11381(0);
		this.anInterface19_1 = this.aClass104_Sub2_37.method20420(this.anInterface42_3.method11362(), this.anInterface42_3.method11340());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class137 local149 = (Class137) this.aVector1.elementAt(local140);
			local149.method11463(this.anInt4685, this.anInt4683);
		}
	}

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "(Lclient!lh;)Z", line = 95)
	boolean method28522(@OriginalArg(0) Class137 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method11456() < this.method28556(local7).method11456()) {
				local5 = true;
				if (!this.method28527(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28556(local7));
		}
		if (local5 || this.method28527(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!lh;)Z", line = 95)
	boolean method28533(@OriginalArg(0) Class137 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method11456() < this.method28556(local7).method11456()) {
				local5 = true;
				if (!this.method28527(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28556(local7));
		}
		if (local5 || this.method28527(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "(Lclient!lh;)Z", line = 95)
	boolean method28539(@OriginalArg(0) Class137 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method11456() < this.method28556(local7).method11456()) {
				local5 = true;
				if (!this.method28527(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28556(local7));
		}
		if (local5 || this.method28527(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ls", name = "ag", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z", line = 112)
	boolean method28524(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4685, this.anInt4683);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4684) {
			this.anInt4684 = local18;
		}
		arg2.aBoolean256 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z", line = 112)
	boolean method28527(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4685, this.anInt4683);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4684) {
			this.anInt4684 = local18;
		}
		arg2.aBoolean256 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z", line = 112)
	boolean method28534(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4685, this.anInt4683);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4684) {
			this.anInt4684 = local18;
		}
		arg2.aBoolean256 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z", line = 112)
	boolean method28541(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4685, this.anInt4683);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4684) {
			this.anInt4684 = local18;
		}
		arg2.aBoolean256 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z", line = 112)
	boolean method28543(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4685, this.anInt4683);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4684) {
			this.anInt4684 = local18;
		}
		arg2.aBoolean256 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z", line = 112)
	boolean method28544(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4685, this.anInt4683);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4684) {
			this.anInt4684 = local18;
		}
		arg2.aBoolean256 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "ae", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z", line = 112)
	boolean method28545(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4685, this.anInt4683);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4684) {
			this.anInt4684 = local18;
		}
		arg2.aBoolean256 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "(Lclient!lh;)V", line = 126)
	void method28529(@OriginalArg(0) Class137 arg0) {
		arg0.method11451();
		arg0.aBoolean256 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "ah", descriptor = "(Lclient!lh;)V", line = 126)
	void method28547(@OriginalArg(0) Class137 arg0) {
		arg0.method11451();
		arg0.aBoolean256 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "al", descriptor = "(Lclient!lh;)V", line = 126)
	void method28548(@OriginalArg(0) Class137 arg0) {
		arg0.method11451();
		arg0.aBoolean256 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "ac", descriptor = "(Lclient!lh;)V", line = 126)
	void method28549(@OriginalArg(0) Class137 arg0) {
		arg0.method11451();
		arg0.aBoolean256 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "ai", descriptor = "(Lclient!lh;)V", line = 126)
	void method28550(@OriginalArg(0) Class137 arg0) {
		arg0.method11451();
		arg0.aBoolean256 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "aw", descriptor = "(I)Lclient!lh;", line = 132)
	Class137 method28551(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "as", descriptor = "(I)Lclient!lh;", line = 132)
	Class137 method28552(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "at", descriptor = "(I)Lclient!lh;", line = 132)
	Class137 method28553(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "ad", descriptor = "(I)Lclient!lh;", line = 132)
	Class137 method28554(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "am", descriptor = "(I)Lclient!lh;", line = 132)
	Class137 method28555(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "(I)Lclient!lh;", line = 132)
	Class137 method28556(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "()Z", line = 136)
	boolean method28526() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class137) this.aVector1.elementAt(local5)).method11460()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "(IIII)Z", line = 142)
	boolean method28523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aVector1.isEmpty() || this.method28526()) {
			return true;
		}
		if (this.anInt4685 != arg2 || this.anInt4683 != arg3 || this.aClass104_Sub2_37.anInt2951 != this.anInt4688) {
			this.anInt4688 = this.aClass104_Sub2_37.anInt2951;
			this.anInt4685 = arg2;
			this.anInt4683 = arg3;
			this.method28530();
			this.method28531();
		}
		this.aClass112_Sub1_5.method23434(0, this.anInterface18_5);
		if (this.anInterface19_1 != null) {
			this.aClass112_Sub1_5.method23436(this.anInterface19_1);
		}
		if (this.aClass112_Sub1_4 == null) {
			this.aClass104_Sub2_37.method20441(this.aClass112_Sub1_5);
		} else {
			this.aClass112_Sub1_4.method23434(0, this.anInterface18_4);
			this.aClass112_Sub1_4.method23436(this.anInterface19_2);
			this.aClass104_Sub2_37.method20441(this.aClass112_Sub1_4);
		}
		if (!this.aClass112_Sub1_5.method23441()) {
			this.aClass104_Sub2_37.method20442(this.aClass112_Sub1_4 == null ? this.aClass112_Sub1_5 : this.aClass112_Sub1_4);
			return false;
		}
		this.anInt4686 = arg0;
		this.anInt4687 = arg1;
		this.aClass104_Sub2_37.method20774(3, -16777216);
		this.aClass104_Sub2_37.method20985(15);
		this.aClass104_Sub2_37.method20983(0);
		this.aBoolean747 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "au", descriptor = "(IIII)Z", line = 142)
	boolean method28559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aVector1.isEmpty() || this.method28526()) {
			return true;
		}
		if (this.anInt4685 != arg2 || this.anInt4683 != arg3 || this.aClass104_Sub2_37.anInt2951 != this.anInt4688) {
			this.anInt4688 = this.aClass104_Sub2_37.anInt2951;
			this.anInt4685 = arg2;
			this.anInt4683 = arg3;
			this.method28530();
			this.method28531();
		}
		this.aClass112_Sub1_5.method23434(0, this.anInterface18_5);
		if (this.anInterface19_1 != null) {
			this.aClass112_Sub1_5.method23436(this.anInterface19_1);
		}
		if (this.aClass112_Sub1_4 == null) {
			this.aClass104_Sub2_37.method20441(this.aClass112_Sub1_5);
		} else {
			this.aClass112_Sub1_4.method23434(0, this.anInterface18_4);
			this.aClass112_Sub1_4.method23436(this.anInterface19_2);
			this.aClass104_Sub2_37.method20441(this.aClass112_Sub1_4);
		}
		if (!this.aClass112_Sub1_5.method23441()) {
			this.aClass104_Sub2_37.method20442(this.aClass112_Sub1_4 == null ? this.aClass112_Sub1_5 : this.aClass112_Sub1_4);
			return false;
		}
		this.anInt4686 = arg0;
		this.anInt4687 = arg1;
		this.aClass104_Sub2_37.method20774(3, -16777216);
		this.aClass104_Sub2_37.method20985(15);
		this.aClass104_Sub2_37.method20983(0);
		this.aBoolean747 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "(II)V", line = 176)
	void method28528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean747) {
			return;
		}
		if (this.aClass112_Sub1_4 != null) {
			this.aClass104_Sub2_37.method20442(this.aClass112_Sub1_4);
			this.aClass104_Sub2_37.method20441(this.aClass112_Sub1_5);
			this.aClass112_Sub1_4.method23435(0, 0, this.anInt4685, this.anInt4683, 0, 0, true, this.anInterface19_1 != null);
		}
		this.method28558(arg0, arg1);
		this.aBoolean747 = false;
	}

	@OriginalMember(owner = "client!ls", name = "ap", descriptor = "(II)V", line = 176)
	void method28536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean747) {
			return;
		}
		if (this.aClass112_Sub1_4 != null) {
			this.aClass104_Sub2_37.method20442(this.aClass112_Sub1_4);
			this.aClass104_Sub2_37.method20441(this.aClass112_Sub1_5);
			this.aClass112_Sub1_4.method23435(0, 0, this.anInt4685, this.anInt4683, 0, 0, true, this.anInterface19_1 != null);
		}
		this.method28558(arg0, arg1);
		this.aBoolean747 = false;
	}

	@OriginalMember(owner = "client!ls", name = "ar", descriptor = "(II)V", line = 176)
	void method28557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean747) {
			return;
		}
		if (this.aClass112_Sub1_4 != null) {
			this.aClass104_Sub2_37.method20442(this.aClass112_Sub1_4);
			this.aClass104_Sub2_37.method20441(this.aClass112_Sub1_5);
			this.aClass112_Sub1_4.method23435(0, 0, this.anInt4685, this.anInt4683, 0, 0, true, this.anInterface19_1 != null);
		}
		this.method28558(arg0, arg1);
		this.aBoolean747 = false;
	}

	@OriginalMember(owner = "client!ls", name = "aq", descriptor = "(II)V", line = 189)
	void method28521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub2_37.method20469(true);
		this.aClass104_Sub2_37.method21008();
		this.aClass104_Sub2_37.method20982(0);
		this.aClass104_Sub2_37.method20919(1);
		this.aClass104_Sub2_37.method20466();
		this.aClass112_Sub1_5.method23436(null);
		this.aClass104_Sub2_37.method20924(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class137) this.aVector1.elementAt(local35)).method11460()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class137) this.aVector1.elementAt(local51)).method11460()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface42_3.method11422();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class137 local89 = (Class137) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method11455();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass112_Sub1_5.method23434(0, this.anInterface18_3);
				} else if (local101) {
					this.aClass104_Sub2_37.method20442(this.aClass112_Sub1_5);
					this.aClass104_Sub2_37.method20467(this.anInt4686, this.anInt4687, this.anInt4686 + arg0, this.anInt4687 + arg1);
				} else {
					local103 = true;
					this.aClass112_Sub1_5.method23434(0, this.anInterface18_5);
				}
				@Pc(155) Interface42 local155 = this.anInterface42_1;
				if (local105 == 0) {
					local155 = this.anInterface42_3;
				}
				local89.method11453(local105, this.aClass112_Sub1_5, local155, this.anInterface19_1, this.anInterface42_3, local101 && local105 == local92 - 1);
				this.method28520();
				local89.method11454(local105);
				if (local103) {
					this.anInterface42_3.method11422();
				}
				@Pc(194) Interface42 local194 = this.anInterface42_1;
				this.anInterface42_1 = this.anInterface42_2;
				this.anInterface42_2 = local194;
				@Pc(204) Interface18 local204 = this.anInterface18_2;
				this.anInterface18_2 = this.anInterface18_3;
				this.anInterface18_3 = local204;
			}
		}
		this.aClass104_Sub2_37.method20982(1);
		this.aClass104_Sub2_37.method20919(0);
		this.aClass104_Sub2_37.method20469(false);
		this.aClass104_Sub2_37.method20466();
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(II)V", line = 189)
	void method28558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub2_37.method20469(true);
		this.aClass104_Sub2_37.method21008();
		this.aClass104_Sub2_37.method20982(0);
		this.aClass104_Sub2_37.method20919(1);
		this.aClass104_Sub2_37.method20466();
		this.aClass112_Sub1_5.method23436(null);
		this.aClass104_Sub2_37.method20924(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class137) this.aVector1.elementAt(local35)).method11460()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class137) this.aVector1.elementAt(local51)).method11460()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface42_3.method11422();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class137 local89 = (Class137) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method11455();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass112_Sub1_5.method23434(0, this.anInterface18_3);
				} else if (local101) {
					this.aClass104_Sub2_37.method20442(this.aClass112_Sub1_5);
					this.aClass104_Sub2_37.method20467(this.anInt4686, this.anInt4687, this.anInt4686 + arg0, this.anInt4687 + arg1);
				} else {
					local103 = true;
					this.aClass112_Sub1_5.method23434(0, this.anInterface18_5);
				}
				@Pc(155) Interface42 local155 = this.anInterface42_1;
				if (local105 == 0) {
					local155 = this.anInterface42_3;
				}
				local89.method11453(local105, this.aClass112_Sub1_5, local155, this.anInterface19_1, this.anInterface42_3, local101 && local105 == local92 - 1);
				this.method28520();
				local89.method11454(local105);
				if (local103) {
					this.anInterface42_3.method11422();
				}
				@Pc(194) Interface42 local194 = this.anInterface42_1;
				this.anInterface42_1 = this.anInterface42_2;
				this.anInterface42_2 = local194;
				@Pc(204) Interface18 local204 = this.anInterface18_2;
				this.anInterface18_2 = this.anInterface18_3;
				this.anInterface18_3 = local204;
			}
		}
		this.aClass104_Sub2_37.method20982(1);
		this.aClass104_Sub2_37.method20919(0);
		this.aClass104_Sub2_37.method20469(false);
		this.aClass104_Sub2_37.method20466();
	}

	@OriginalMember(owner = "client!ls", name = "ao", descriptor = "()V", line = 250)
	void method28525() {
		if (this.aClass112_Sub1_4 != null) {
			this.aClass112_Sub1_4.method23738();
			this.aClass112_Sub1_4 = null;
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method30884();
			this.anInterface18_4 = null;
		}
		if (this.anInterface19_2 != null) {
			this.anInterface19_2.method30884();
			this.anInterface19_2 = null;
		}
		if (this.aClass112_Sub1_5 != null) {
			this.aClass112_Sub1_5.method23738();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method30884();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method30884();
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method30884();
		}
		if (this.anInterface42_1 != null) {
			this.anInterface42_1.method30884();
		}
		if (this.anInterface42_2 != null) {
			this.anInterface42_2.method30884();
		}
		if (this.anInterface42_3 != null) {
			this.anInterface42_3.method30884();
		}
		if (this.anInterface19_1 != null) {
			this.anInterface19_1.method30884();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class137 local89 = (Class137) this.aVector1.elementAt(local80);
			local89.method11451();
		}
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "()V", line = 250)
	void method28530() {
		if (this.aClass112_Sub1_4 != null) {
			this.aClass112_Sub1_4.method23738();
			this.aClass112_Sub1_4 = null;
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method30884();
			this.anInterface18_4 = null;
		}
		if (this.anInterface19_2 != null) {
			this.anInterface19_2.method30884();
			this.anInterface19_2 = null;
		}
		if (this.aClass112_Sub1_5 != null) {
			this.aClass112_Sub1_5.method23738();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method30884();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method30884();
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method30884();
		}
		if (this.anInterface42_1 != null) {
			this.anInterface42_1.method30884();
		}
		if (this.anInterface42_2 != null) {
			this.anInterface42_2.method30884();
		}
		if (this.anInterface42_3 != null) {
			this.anInterface42_3.method30884();
		}
		if (this.anInterface19_1 != null) {
			this.anInterface19_1.method30884();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class137 local89 = (Class137) this.aVector1.elementAt(local80);
			local89.method11451();
		}
	}

	@OriginalMember(owner = "client!ls", name = "ax", descriptor = "()V", line = 250)
	void method28560() {
		if (this.aClass112_Sub1_4 != null) {
			this.aClass112_Sub1_4.method23738();
			this.aClass112_Sub1_4 = null;
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method30884();
			this.anInterface18_4 = null;
		}
		if (this.anInterface19_2 != null) {
			this.anInterface19_2.method30884();
			this.anInterface19_2 = null;
		}
		if (this.aClass112_Sub1_5 != null) {
			this.aClass112_Sub1_5.method23738();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method30884();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method30884();
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method30884();
		}
		if (this.anInterface42_1 != null) {
			this.anInterface42_1.method30884();
		}
		if (this.anInterface42_2 != null) {
			this.anInterface42_2.method30884();
		}
		if (this.anInterface42_3 != null) {
			this.anInterface42_3.method30884();
		}
		if (this.anInterface19_1 != null) {
			this.anInterface19_1.method30884();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class137 local89 = (Class137) this.aVector1.elementAt(local80);
			local89.method11451();
		}
	}

	@OriginalMember(owner = "client!ls", name = "av", descriptor = "()V", line = 250)
	void method28561() {
		if (this.aClass112_Sub1_4 != null) {
			this.aClass112_Sub1_4.method23738();
			this.aClass112_Sub1_4 = null;
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method30884();
			this.anInterface18_4 = null;
		}
		if (this.anInterface19_2 != null) {
			this.anInterface19_2.method30884();
			this.anInterface19_2 = null;
		}
		if (this.aClass112_Sub1_5 != null) {
			this.aClass112_Sub1_5.method23738();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method30884();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method30884();
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method30884();
		}
		if (this.anInterface42_1 != null) {
			this.anInterface42_1.method30884();
		}
		if (this.anInterface42_2 != null) {
			this.anInterface42_2.method30884();
		}
		if (this.anInterface42_3 != null) {
			this.anInterface42_3.method30884();
		}
		if (this.anInterface19_1 != null) {
			this.anInterface19_1.method30884();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class137 local89 = (Class137) this.aVector1.elementAt(local80);
			local89.method11451();
		}
	}
}
