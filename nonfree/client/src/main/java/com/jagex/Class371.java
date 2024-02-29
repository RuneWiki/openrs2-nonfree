package com.jagex;

import java.nio.ByteBuffer;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kz")
public class Class371 {

	@OriginalMember(owner = "client!kz", name = "r", descriptor = "Lclient!de;")
	Interface20 anInterface20_1;

	@OriginalMember(owner = "client!kz", name = "u", descriptor = "Z")
	boolean aBoolean727;

	@OriginalMember(owner = "client!kz", name = "v", descriptor = "Lclient!aeo;")
	Class92_Sub1 aClass92_Sub1_4;

	@OriginalMember(owner = "client!kz", name = "c", descriptor = "Lclient!aeo;")
	Class92_Sub1 aClass92_Sub1_5;

	@OriginalMember(owner = "client!kz", name = "y", descriptor = "Lclient!lx;")
	Interface43 anInterface43_1;

	@OriginalMember(owner = "client!kz", name = "w", descriptor = "Lclient!lx;")
	Interface43 anInterface43_2;

	@OriginalMember(owner = "client!kz", name = "t", descriptor = "Lclient!df;")
	Interface21 anInterface21_2;

	@OriginalMember(owner = "client!kz", name = "s", descriptor = "Lclient!de;")
	Interface20 anInterface20_2;

	@OriginalMember(owner = "client!kz", name = "x", descriptor = "Lclient!df;")
	Interface21 anInterface21_3;

	@OriginalMember(owner = "client!kz", name = "q", descriptor = "Lclient!df;")
	Interface21 anInterface21_4;

	@OriginalMember(owner = "client!kz", name = "d", descriptor = "Lclient!df;")
	Interface21 anInterface21_5;

	@OriginalMember(owner = "client!kz", name = "j", descriptor = "I")
	int anInt4560;

	@OriginalMember(owner = "client!kz", name = "l", descriptor = "Lclient!lx;")
	Interface43 anInterface43_3;

	@OriginalMember(owner = "client!kz", name = "f", descriptor = "Lclient!kp;")
	Interface36 anInterface36_18;

	@OriginalMember(owner = "client!kz", name = "o", descriptor = "Lclient!kt;")
	Class113 aClass113_23;

	@OriginalMember(owner = "client!kz", name = "i", descriptor = "I")
	int anInt4557 = 0;

	@OriginalMember(owner = "client!kz", name = "e", descriptor = "Ljava/util/Vector;")
	Vector aVector1 = new Vector();

	@OriginalMember(owner = "client!kz", name = "b", descriptor = "I")
	int anInt4561 = 0;

	@OriginalMember(owner = "client!kz", name = "n", descriptor = "I")
	int anInt4562 = 0;

	@OriginalMember(owner = "client!kz", name = "p", descriptor = "Lclient!aed;")
	Class86_Sub1 aClass86_Sub1_39;

	@OriginalMember(owner = "client!kz", name = "k", descriptor = "Lclient!dl;")
	Class206 aClass206_29;

	@OriginalMember(owner = "client!kz", name = "g", descriptor = "I")
	int anInt4558;

	@OriginalMember(owner = "client!kz", name = "z", descriptor = "I")
	int anInt4559;

	@OriginalMember(owner = "client!kz", name = "<init>", descriptor = "(Lclient!aed;II)V", line = 33)
	Class371(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass86_Sub1_39 = arg0;
		this.aClass206_29 = Class206.aClass206_23;
		this.anInt4558 = arg1;
		this.anInt4559 = arg2;
	}

	@OriginalMember(owner = "client!kz", name = "j", descriptor = "()V", line = 41)
	void method28240() {
		if (this.anInterface36_18 != null) {
			return;
		}
		this.anInterface36_18 = this.aClass86_Sub1_39.method20656(false);
		this.anInterface36_18.method28760(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass86_Sub1_39.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface36_18.method28755(0, local19.position(), this.aClass86_Sub1_39.aLong121);
		this.aClass113_23 = this.aClass86_Sub1_39.method20657(new Class391[] { new Class391(Class366.aClass366_3) });
	}

	@OriginalMember(owner = "client!kz", name = "g", descriptor = "()V", line = 41)
	void method28241() {
		if (this.anInterface36_18 != null) {
			return;
		}
		this.anInterface36_18 = this.aClass86_Sub1_39.method20656(false);
		this.anInterface36_18.method28760(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass86_Sub1_39.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface36_18.method28755(0, local19.position(), this.aClass86_Sub1_39.aLong121);
		this.aClass113_23 = this.aClass86_Sub1_39.method20657(new Class391[] { new Class391(Class366.aClass366_3) });
	}

	@OriginalMember(owner = "client!kz", name = "z", descriptor = "()V", line = 41)
	void method28242() {
		if (this.anInterface36_18 != null) {
			return;
		}
		this.anInterface36_18 = this.aClass86_Sub1_39.method20656(false);
		this.anInterface36_18.method28760(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass86_Sub1_39.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface36_18.method28755(0, local19.position(), this.aClass86_Sub1_39.aLong121);
		this.aClass113_23 = this.aClass86_Sub1_39.method20657(new Class391[] { new Class391(Class366.aClass366_3) });
	}

	@OriginalMember(owner = "client!kz", name = "i", descriptor = "()V", line = 41)
	void method28243() {
		if (this.anInterface36_18 != null) {
			return;
		}
		this.anInterface36_18 = this.aClass86_Sub1_39.method20656(false);
		this.anInterface36_18.method28760(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass86_Sub1_39.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface36_18.method28755(0, local19.position(), this.aClass86_Sub1_39.aLong121);
		this.aClass113_23 = this.aClass86_Sub1_39.method20657(new Class391[] { new Class391(Class366.aClass366_3) });
	}

	@OriginalMember(owner = "client!kz", name = "p", descriptor = "()V", line = 41)
	void method28244() {
		if (this.anInterface36_18 != null) {
			return;
		}
		this.anInterface36_18 = this.aClass86_Sub1_39.method20656(false);
		this.anInterface36_18.method28760(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass86_Sub1_39.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface36_18.method28755(0, local19.position(), this.aClass86_Sub1_39.aLong121);
		this.aClass113_23 = this.aClass86_Sub1_39.method20657(new Class391[] { new Class391(Class366.aClass366_3) });
	}

	@OriginalMember(owner = "client!kz", name = "c", descriptor = "()V", line = 54)
	void method28245() {
		this.aClass86_Sub1_39.method20670(0, this.anInterface36_18);
		this.aClass86_Sub1_39.method20658(this.aClass113_23);
		this.aClass86_Sub1_39.method20661(Class384.aClass384_4, 0, 1);
	}

	@OriginalMember(owner = "client!kz", name = "k", descriptor = "()V", line = 54)
	void method28246() {
		this.aClass86_Sub1_39.method20670(0, this.anInterface36_18);
		this.aClass86_Sub1_39.method20658(this.aClass113_23);
		this.aClass86_Sub1_39.method20661(Class384.aClass384_4, 0, 1);
	}

	@OriginalMember(owner = "client!kz", name = "v", descriptor = "()V", line = 60)
	void method28247() {
		this.method28244();
		switch(this.anInt4561) {
			case 0:
				this.aClass206_29 = Class206.aClass206_23;
				break;
			case 1:
				this.aClass206_29 = Class206.aClass206_25;
				break;
			case 2:
				this.aClass206_29 = Class206.aClass206_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass92_Sub1_4 = this.aClass86_Sub1_39.method20063();
		if (this.aClass86_Sub1_39.anInt2844 > 1 && this.aClass86_Sub1_39.aBoolean455 && this.aClass86_Sub1_39.aBoolean456) {
			this.aClass92_Sub1_5 = this.aClass86_Sub1_39.method20063();
			this.anInterface21_5 = this.aClass86_Sub1_39.method20376(this.anInt4558, this.anInt4559, Class212.aClass212_18, this.aClass206_29, this.aClass86_Sub1_39.anInt2844);
			this.anInterface20_1 = this.aClass86_Sub1_39.method20065(this.anInt4558, this.anInt4559, this.aClass86_Sub1_39.anInt2844);
		}
		this.anInterface43_3 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_2 = this.anInterface43_3.method10636(0);
		this.anInterface43_1 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_4 = this.anInterface43_1.method10636(0);
		this.anInterface43_2 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_3 = this.anInterface43_2.method10636(0);
		this.anInterface20_2 = this.aClass86_Sub1_39.method20064(this.anInterface43_2.method10631(), this.anInterface43_2.method10603());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class120 local149 = (Class120) this.aVector1.elementAt(local140);
			local149.method10792(this.anInt4558, this.anInt4559);
		}
	}

	@OriginalMember(owner = "client!kz", name = "u", descriptor = "()V", line = 60)
	void method28248() {
		this.method28244();
		switch(this.anInt4561) {
			case 0:
				this.aClass206_29 = Class206.aClass206_23;
				break;
			case 1:
				this.aClass206_29 = Class206.aClass206_25;
				break;
			case 2:
				this.aClass206_29 = Class206.aClass206_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass92_Sub1_4 = this.aClass86_Sub1_39.method20063();
		if (this.aClass86_Sub1_39.anInt2844 > 1 && this.aClass86_Sub1_39.aBoolean455 && this.aClass86_Sub1_39.aBoolean456) {
			this.aClass92_Sub1_5 = this.aClass86_Sub1_39.method20063();
			this.anInterface21_5 = this.aClass86_Sub1_39.method20376(this.anInt4558, this.anInt4559, Class212.aClass212_18, this.aClass206_29, this.aClass86_Sub1_39.anInt2844);
			this.anInterface20_1 = this.aClass86_Sub1_39.method20065(this.anInt4558, this.anInt4559, this.aClass86_Sub1_39.anInt2844);
		}
		this.anInterface43_3 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_2 = this.anInterface43_3.method10636(0);
		this.anInterface43_1 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_4 = this.anInterface43_1.method10636(0);
		this.anInterface43_2 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_3 = this.anInterface43_2.method10636(0);
		this.anInterface20_2 = this.aClass86_Sub1_39.method20064(this.anInterface43_2.method10631(), this.anInterface43_2.method10603());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class120 local149 = (Class120) this.aVector1.elementAt(local140);
			local149.method10792(this.anInt4558, this.anInt4559);
		}
	}

	@OriginalMember(owner = "client!kz", name = "e", descriptor = "()V", line = 60)
	void method28249() {
		this.method28244();
		switch(this.anInt4561) {
			case 0:
				this.aClass206_29 = Class206.aClass206_23;
				break;
			case 1:
				this.aClass206_29 = Class206.aClass206_25;
				break;
			case 2:
				this.aClass206_29 = Class206.aClass206_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass92_Sub1_4 = this.aClass86_Sub1_39.method20063();
		if (this.aClass86_Sub1_39.anInt2844 > 1 && this.aClass86_Sub1_39.aBoolean455 && this.aClass86_Sub1_39.aBoolean456) {
			this.aClass92_Sub1_5 = this.aClass86_Sub1_39.method20063();
			this.anInterface21_5 = this.aClass86_Sub1_39.method20376(this.anInt4558, this.anInt4559, Class212.aClass212_18, this.aClass206_29, this.aClass86_Sub1_39.anInt2844);
			this.anInterface20_1 = this.aClass86_Sub1_39.method20065(this.anInt4558, this.anInt4559, this.aClass86_Sub1_39.anInt2844);
		}
		this.anInterface43_3 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_2 = this.anInterface43_3.method10636(0);
		this.anInterface43_1 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_4 = this.anInterface43_1.method10636(0);
		this.anInterface43_2 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_3 = this.anInterface43_2.method10636(0);
		this.anInterface20_2 = this.aClass86_Sub1_39.method20064(this.anInterface43_2.method10631(), this.anInterface43_2.method10603());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class120 local149 = (Class120) this.aVector1.elementAt(local140);
			local149.method10792(this.anInt4558, this.anInt4559);
		}
	}

	@OriginalMember(owner = "client!kz", name = "f", descriptor = "()V", line = 60)
	void method28250() {
		this.method28244();
		switch(this.anInt4561) {
			case 0:
				this.aClass206_29 = Class206.aClass206_23;
				break;
			case 1:
				this.aClass206_29 = Class206.aClass206_25;
				break;
			case 2:
				this.aClass206_29 = Class206.aClass206_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass92_Sub1_4 = this.aClass86_Sub1_39.method20063();
		if (this.aClass86_Sub1_39.anInt2844 > 1 && this.aClass86_Sub1_39.aBoolean455 && this.aClass86_Sub1_39.aBoolean456) {
			this.aClass92_Sub1_5 = this.aClass86_Sub1_39.method20063();
			this.anInterface21_5 = this.aClass86_Sub1_39.method20376(this.anInt4558, this.anInt4559, Class212.aClass212_18, this.aClass206_29, this.aClass86_Sub1_39.anInt2844);
			this.anInterface20_1 = this.aClass86_Sub1_39.method20065(this.anInt4558, this.anInt4559, this.aClass86_Sub1_39.anInt2844);
		}
		this.anInterface43_3 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_2 = this.anInterface43_3.method10636(0);
		this.anInterface43_1 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_4 = this.anInterface43_1.method10636(0);
		this.anInterface43_2 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_3 = this.anInterface43_2.method10636(0);
		this.anInterface20_2 = this.aClass86_Sub1_39.method20064(this.anInterface43_2.method10631(), this.anInterface43_2.method10603());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class120 local149 = (Class120) this.aVector1.elementAt(local140);
			local149.method10792(this.anInt4558, this.anInt4559);
		}
	}

	@OriginalMember(owner = "client!kz", name = "o", descriptor = "()V", line = 60)
	void method28251() {
		this.method28244();
		switch(this.anInt4561) {
			case 0:
				this.aClass206_29 = Class206.aClass206_23;
				break;
			case 1:
				this.aClass206_29 = Class206.aClass206_25;
				break;
			case 2:
				this.aClass206_29 = Class206.aClass206_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass92_Sub1_4 = this.aClass86_Sub1_39.method20063();
		if (this.aClass86_Sub1_39.anInt2844 > 1 && this.aClass86_Sub1_39.aBoolean455 && this.aClass86_Sub1_39.aBoolean456) {
			this.aClass92_Sub1_5 = this.aClass86_Sub1_39.method20063();
			this.anInterface21_5 = this.aClass86_Sub1_39.method20376(this.anInt4558, this.anInt4559, Class212.aClass212_18, this.aClass206_29, this.aClass86_Sub1_39.anInt2844);
			this.anInterface20_1 = this.aClass86_Sub1_39.method20065(this.anInt4558, this.anInt4559, this.aClass86_Sub1_39.anInt2844);
		}
		this.anInterface43_3 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_2 = this.anInterface43_3.method10636(0);
		this.anInterface43_1 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_4 = this.anInterface43_1.method10636(0);
		this.anInterface43_2 = this.aClass86_Sub1_39.method20639(Class212.aClass212_18, this.aClass206_29, this.anInt4558, this.anInt4559);
		this.anInterface21_3 = this.anInterface43_2.method10636(0);
		this.anInterface20_2 = this.aClass86_Sub1_39.method20064(this.anInterface43_2.method10631(), this.anInterface43_2.method10603());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class120 local149 = (Class120) this.aVector1.elementAt(local140);
			local149.method10792(this.anInt4558, this.anInt4559);
		}
	}

	@OriginalMember(owner = "client!kz", name = "l", descriptor = "(Lclient!kj;)Z", line = 95)
	boolean method28252(@OriginalArg(0) Class120 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method10796() < this.method28260(local7).method10796()) {
				local5 = true;
				if (!this.method28257(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28260(local7));
		}
		if (local5 || this.method28257(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kz", name = "n", descriptor = "(Lclient!kj;)Z", line = 95)
	boolean method28253(@OriginalArg(0) Class120 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method10796() < this.method28260(local7).method10796()) {
				local5 = true;
				if (!this.method28257(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28260(local7));
		}
		if (local5 || this.method28257(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kz", name = "b", descriptor = "(Lclient!kj;)Z", line = 95)
	boolean method28254(@OriginalArg(0) Class120 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method10796() < this.method28260(local7).method10796()) {
				local5 = true;
				if (!this.method28257(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28260(local7));
		}
		if (local5 || this.method28257(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kz", name = "a", descriptor = "(Lclient!kj;)Z", line = 95)
	boolean method28255(@OriginalArg(0) Class120 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method10796() < this.method28260(local7).method10796()) {
				local5 = true;
				if (!this.method28257(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28260(local7));
		}
		if (local5 || this.method28257(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kz", name = "m", descriptor = "(Lclient!kj;)Z", line = 95)
	boolean method28256(@OriginalArg(0) Class120 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method10796() < this.method28260(local7).method10796()) {
				local5 = true;
				if (!this.method28257(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28260(local7));
		}
		if (local5 || this.method28257(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kz", name = "y", descriptor = "(Ljava/util/Vector;ILclient!kj;)Z", line = 112)
	boolean method28257(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class120 arg2) {
		if (!arg2.method10805() && !arg2.method10790()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method10792(this.anInt4558, this.anInt4559);
		@Pc(18) int local18 = arg2.method10781();
		if (local18 > this.anInt4561) {
			this.anInt4561 = local18;
		}
		arg2.aBoolean218 = true;
		return true;
	}

	@OriginalMember(owner = "client!kz", name = "w", descriptor = "(Lclient!kj;)V", line = 126)
	void method28258(@OriginalArg(0) Class120 arg0) {
		arg0.method10821();
		arg0.aBoolean218 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!kz", name = "h", descriptor = "(I)Lclient!kj;", line = 132)
	Class120 method28259(@OriginalArg(0) int arg0) {
		return (Class120) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!kz", name = "t", descriptor = "(I)Lclient!kj;", line = 132)
	Class120 method28260(@OriginalArg(0) int arg0) {
		return (Class120) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!kz", name = "q", descriptor = "()Z", line = 136)
	boolean method28261() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class120) this.aVector1.elementAt(local5)).method10797()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kz", name = "aj", descriptor = "()Z", line = 136)
	boolean method28262() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class120) this.aVector1.elementAt(local5)).method10797()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kz", name = "x", descriptor = "(IIII)Z", line = 142)
	boolean method28263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aVector1.isEmpty() || this.method28261()) {
			return true;
		}
		if (this.anInt4558 != arg2 || this.anInt4559 != arg3 || this.aClass86_Sub1_39.anInt2844 != this.anInt4562) {
			this.anInt4562 = this.aClass86_Sub1_39.anInt2844;
			this.anInt4558 = arg2;
			this.anInt4559 = arg3;
			this.method28269();
			this.method28247();
		}
		this.aClass92_Sub1_4.method23513(0, this.anInterface21_3);
		if (this.anInterface20_2 != null) {
			this.aClass92_Sub1_4.method23512(this.anInterface20_2);
		}
		if (this.aClass92_Sub1_5 == null) {
			this.aClass86_Sub1_39.method19968(this.aClass92_Sub1_4);
		} else {
			this.aClass92_Sub1_5.method23513(0, this.anInterface21_5);
			this.aClass92_Sub1_5.method23512(this.anInterface20_1);
			this.aClass86_Sub1_39.method19968(this.aClass92_Sub1_5);
		}
		if (!this.aClass92_Sub1_4.method23514()) {
			this.aClass86_Sub1_39.method19972(this.aClass92_Sub1_5 == null ? this.aClass92_Sub1_4 : this.aClass92_Sub1_5);
			return false;
		}
		this.anInt4560 = arg0;
		this.anInt4557 = arg1;
		this.aClass86_Sub1_39.method20125(3, -16777216);
		this.aClass86_Sub1_39.method20628(15);
		this.aClass86_Sub1_39.method20580(0);
		this.aBoolean727 = true;
		return true;
	}

	@OriginalMember(owner = "client!kz", name = "ai", descriptor = "(II)V", line = 176)
	void method28264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean727) {
			return;
		}
		if (this.aClass92_Sub1_5 != null) {
			this.aClass86_Sub1_39.method19972(this.aClass92_Sub1_5);
			this.aClass86_Sub1_39.method19968(this.aClass92_Sub1_4);
			this.aClass92_Sub1_5.method23515(0, 0, this.anInt4558, this.anInt4559, 0, 0, true, this.anInterface20_2 != null);
		}
		this.method28267(arg0, arg1);
		this.aBoolean727 = false;
	}

	@OriginalMember(owner = "client!kz", name = "d", descriptor = "(II)V", line = 176)
	void method28265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean727) {
			return;
		}
		if (this.aClass92_Sub1_5 != null) {
			this.aClass86_Sub1_39.method19972(this.aClass92_Sub1_5);
			this.aClass86_Sub1_39.method19968(this.aClass92_Sub1_4);
			this.aClass92_Sub1_5.method23515(0, 0, this.anInt4558, this.anInt4559, 0, 0, true, this.anInterface20_2 != null);
		}
		this.method28267(arg0, arg1);
		this.aBoolean727 = false;
	}

	@OriginalMember(owner = "client!kz", name = "ag", descriptor = "(II)V", line = 189)
	void method28266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub1_39.method19979(true);
		this.aClass86_Sub1_39.method20597();
		this.aClass86_Sub1_39.method20579(0);
		this.aClass86_Sub1_39.method20545(1);
		this.aClass86_Sub1_39.method20299();
		this.aClass92_Sub1_4.method23512(null);
		this.aClass86_Sub1_39.method20465(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class120) this.aVector1.elementAt(local35)).method10797()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class120) this.aVector1.elementAt(local51)).method10797()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface43_2.method10572();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class120 local89 = (Class120) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method10777();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass92_Sub1_4.method23513(0, this.anInterface21_4);
				} else if (local101) {
					this.aClass86_Sub1_39.method19972(this.aClass92_Sub1_4);
					this.aClass86_Sub1_39.method20151(this.anInt4560, this.anInt4557, this.anInt4560 + arg0, this.anInt4557 + arg1);
				} else {
					local103 = true;
					this.aClass92_Sub1_4.method23513(0, this.anInterface21_3);
				}
				@Pc(155) Interface43 local155 = this.anInterface43_3;
				if (local105 == 0) {
					local155 = this.anInterface43_2;
				}
				local89.method10793(local105, this.aClass92_Sub1_4, local155, this.anInterface20_2, this.anInterface43_2, local101 && local105 == local92 - 1);
				this.method28245();
				local89.method10794(local105);
				if (local103) {
					this.anInterface43_2.method10572();
				}
				@Pc(194) Interface43 local194 = this.anInterface43_3;
				this.anInterface43_3 = this.anInterface43_1;
				this.anInterface43_1 = local194;
				@Pc(204) Interface21 local204 = this.anInterface21_2;
				this.anInterface21_2 = this.anInterface21_4;
				this.anInterface21_4 = local204;
			}
		}
		this.aClass86_Sub1_39.method20579(1);
		this.aClass86_Sub1_39.method20545(0);
		this.aClass86_Sub1_39.method19979(false);
		this.aClass86_Sub1_39.method20299();
		local33 = null;
	}

	@OriginalMember(owner = "client!kz", name = "s", descriptor = "(II)V", line = 189)
	void method28267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub1_39.method19979(true);
		this.aClass86_Sub1_39.method20597();
		this.aClass86_Sub1_39.method20579(0);
		this.aClass86_Sub1_39.method20545(1);
		this.aClass86_Sub1_39.method20299();
		this.aClass92_Sub1_4.method23512(null);
		this.aClass86_Sub1_39.method20465(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class120) this.aVector1.elementAt(local35)).method10797()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class120) this.aVector1.elementAt(local51)).method10797()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface43_2.method10572();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class120 local89 = (Class120) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method10777();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass92_Sub1_4.method23513(0, this.anInterface21_4);
				} else if (local101) {
					this.aClass86_Sub1_39.method19972(this.aClass92_Sub1_4);
					this.aClass86_Sub1_39.method20151(this.anInt4560, this.anInt4557, this.anInt4560 + arg0, this.anInt4557 + arg1);
				} else {
					local103 = true;
					this.aClass92_Sub1_4.method23513(0, this.anInterface21_3);
				}
				@Pc(155) Interface43 local155 = this.anInterface43_3;
				if (local105 == 0) {
					local155 = this.anInterface43_2;
				}
				local89.method10793(local105, this.aClass92_Sub1_4, local155, this.anInterface20_2, this.anInterface43_2, local101 && local105 == local92 - 1);
				this.method28245();
				local89.method10794(local105);
				if (local103) {
					this.anInterface43_2.method10572();
				}
				@Pc(194) Interface43 local194 = this.anInterface43_3;
				this.anInterface43_3 = this.anInterface43_1;
				this.anInterface43_1 = local194;
				@Pc(204) Interface21 local204 = this.anInterface21_2;
				this.anInterface21_2 = this.anInterface21_4;
				this.anInterface21_4 = local204;
			}
		}
		this.aClass86_Sub1_39.method20579(1);
		this.aClass86_Sub1_39.method20545(0);
		this.aClass86_Sub1_39.method19979(false);
		this.aClass86_Sub1_39.method20299();
		local33 = null;
	}

	@OriginalMember(owner = "client!kz", name = "al", descriptor = "(II)V", line = 189)
	void method28268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub1_39.method19979(true);
		this.aClass86_Sub1_39.method20597();
		this.aClass86_Sub1_39.method20579(0);
		this.aClass86_Sub1_39.method20545(1);
		this.aClass86_Sub1_39.method20299();
		this.aClass92_Sub1_4.method23512(null);
		this.aClass86_Sub1_39.method20465(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class120) this.aVector1.elementAt(local35)).method10797()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class120) this.aVector1.elementAt(local51)).method10797()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface43_2.method10572();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class120 local89 = (Class120) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method10777();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass92_Sub1_4.method23513(0, this.anInterface21_4);
				} else if (local101) {
					this.aClass86_Sub1_39.method19972(this.aClass92_Sub1_4);
					this.aClass86_Sub1_39.method20151(this.anInt4560, this.anInt4557, this.anInt4560 + arg0, this.anInt4557 + arg1);
				} else {
					local103 = true;
					this.aClass92_Sub1_4.method23513(0, this.anInterface21_3);
				}
				@Pc(155) Interface43 local155 = this.anInterface43_3;
				if (local105 == 0) {
					local155 = this.anInterface43_2;
				}
				local89.method10793(local105, this.aClass92_Sub1_4, local155, this.anInterface20_2, this.anInterface43_2, local101 && local105 == local92 - 1);
				this.method28245();
				local89.method10794(local105);
				if (local103) {
					this.anInterface43_2.method10572();
				}
				@Pc(194) Interface43 local194 = this.anInterface43_3;
				this.anInterface43_3 = this.anInterface43_1;
				this.anInterface43_1 = local194;
				@Pc(204) Interface21 local204 = this.anInterface21_2;
				this.anInterface21_2 = this.anInterface21_4;
				this.anInterface21_4 = local204;
			}
		}
		this.aClass86_Sub1_39.method20579(1);
		this.aClass86_Sub1_39.method20545(0);
		this.aClass86_Sub1_39.method19979(false);
		this.aClass86_Sub1_39.method20299();
		local33 = null;
	}

	@OriginalMember(owner = "client!kz", name = "r", descriptor = "()V", line = 250)
	void method28269() {
		if (this.aClass92_Sub1_5 != null) {
			this.aClass92_Sub1_5.method23506();
			this.aClass92_Sub1_5 = null;
		}
		if (this.anInterface21_5 != null) {
			this.anInterface21_5.method30322();
			this.anInterface21_5 = null;
		}
		if (this.anInterface20_1 != null) {
			this.anInterface20_1.method30322();
			this.anInterface20_1 = null;
		}
		if (this.aClass92_Sub1_4 != null) {
			this.aClass92_Sub1_4.method23506();
		}
		if (this.anInterface21_2 != null) {
			this.anInterface21_2.method30322();
		}
		if (this.anInterface21_4 != null) {
			this.anInterface21_4.method30322();
		}
		if (this.anInterface21_3 != null) {
			this.anInterface21_3.method30322();
		}
		if (this.anInterface43_3 != null) {
			this.anInterface43_3.method30322();
		}
		if (this.anInterface43_1 != null) {
			this.anInterface43_1.method30322();
		}
		if (this.anInterface43_2 != null) {
			this.anInterface43_2.method30322();
		}
		if (this.anInterface20_2 != null) {
			this.anInterface20_2.method30322();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class120 local89 = (Class120) this.aVector1.elementAt(local80);
			local89.method10821();
		}
	}

	@OriginalMember(owner = "client!kz", name = "ao", descriptor = "()V", line = 250)
	void method28270() {
		if (this.aClass92_Sub1_5 != null) {
			this.aClass92_Sub1_5.method23506();
			this.aClass92_Sub1_5 = null;
		}
		if (this.anInterface21_5 != null) {
			this.anInterface21_5.method30322();
			this.anInterface21_5 = null;
		}
		if (this.anInterface20_1 != null) {
			this.anInterface20_1.method30322();
			this.anInterface20_1 = null;
		}
		if (this.aClass92_Sub1_4 != null) {
			this.aClass92_Sub1_4.method23506();
		}
		if (this.anInterface21_2 != null) {
			this.anInterface21_2.method30322();
		}
		if (this.anInterface21_4 != null) {
			this.anInterface21_4.method30322();
		}
		if (this.anInterface21_3 != null) {
			this.anInterface21_3.method30322();
		}
		if (this.anInterface43_3 != null) {
			this.anInterface43_3.method30322();
		}
		if (this.anInterface43_1 != null) {
			this.anInterface43_1.method30322();
		}
		if (this.anInterface43_2 != null) {
			this.anInterface43_2.method30322();
		}
		if (this.anInterface20_2 != null) {
			this.anInterface20_2.method30322();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class120 local89 = (Class120) this.aVector1.elementAt(local80);
			local89.method10821();
		}
	}

	@OriginalMember(owner = "client!kz", name = "ak", descriptor = "()V", line = 250)
	void method28271() {
		if (this.aClass92_Sub1_5 != null) {
			this.aClass92_Sub1_5.method23506();
			this.aClass92_Sub1_5 = null;
		}
		if (this.anInterface21_5 != null) {
			this.anInterface21_5.method30322();
			this.anInterface21_5 = null;
		}
		if (this.anInterface20_1 != null) {
			this.anInterface20_1.method30322();
			this.anInterface20_1 = null;
		}
		if (this.aClass92_Sub1_4 != null) {
			this.aClass92_Sub1_4.method23506();
		}
		if (this.anInterface21_2 != null) {
			this.anInterface21_2.method30322();
		}
		if (this.anInterface21_4 != null) {
			this.anInterface21_4.method30322();
		}
		if (this.anInterface21_3 != null) {
			this.anInterface21_3.method30322();
		}
		if (this.anInterface43_3 != null) {
			this.anInterface43_3.method30322();
		}
		if (this.anInterface43_1 != null) {
			this.anInterface43_1.method30322();
		}
		if (this.anInterface43_2 != null) {
			this.anInterface43_2.method30322();
		}
		if (this.anInterface20_2 != null) {
			this.anInterface20_2.method30322();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class120 local89 = (Class120) this.aVector1.elementAt(local80);
			local89.method10821();
		}
	}
}
