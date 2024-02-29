package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class451 {

	@OriginalMember(owner = "client!os", name = "p", descriptor = "[F")
	public float[] aFloatArray111 = new float[9];

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 6)
	public Class451() {
		this.method29265();
	}

	@OriginalMember(owner = "client!os", name = "y", descriptor = "()Lclient!ot;", line = 11)
	public Class452 method29260() {
		@Pc(3) Class452 local3 = new Class452();
		@Pc(21) double local21 = (double) (this.aFloatArray111[0] + 1.0F + this.aFloatArray111[4] + this.aFloatArray111[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[7] - this.aFloatArray111[5]) / local31;
			local3.aFloat286 = (this.aFloatArray111[2] - this.aFloatArray111[6]) / local31;
			local3.aFloat285 = (this.aFloatArray111[3] - this.aFloatArray111[1]) / local31;
			local3.aFloat283 = local31 * 0.25F;
		} else if (this.aFloatArray111[0] > this.aFloatArray111[4] && this.aFloatArray111[0] > this.aFloatArray111[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[0] + 1.0F - this.aFloatArray111[4] - this.aFloatArray111[8])) * 2.0D);
			local3.aFloat284 = local31 * 0.25F;
			local3.aFloat286 = (this.aFloatArray111[3] + this.aFloatArray111[1]) / local31;
			local3.aFloat285 = (this.aFloatArray111[2] + this.aFloatArray111[6]) / local31;
			local3.aFloat283 = (this.aFloatArray111[7] - this.aFloatArray111[5]) / local31;
		} else if (this.aFloatArray111[4] > this.aFloatArray111[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[4] + 1.0F - this.aFloatArray111[0] - this.aFloatArray111[8])) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[3] + this.aFloatArray111[1]) / local31;
			local3.aFloat286 = local31 * 0.25F;
			local3.aFloat285 = (this.aFloatArray111[7] + this.aFloatArray111[5]) / local31;
			local3.aFloat283 = (this.aFloatArray111[2] - this.aFloatArray111[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[8] + 1.0F - this.aFloatArray111[0] - this.aFloatArray111[4])) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[2] + this.aFloatArray111[6]) / local31;
			local3.aFloat286 = (this.aFloatArray111[7] + this.aFloatArray111[5]) / local31;
			local3.aFloat285 = local31 * 0.25F;
			local3.aFloat283 = (this.aFloatArray111[3] - this.aFloatArray111[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!os", name = "p", descriptor = "()Lclient!ot;", line = 11)
	public Class452 method29261() {
		@Pc(3) Class452 local3 = new Class452();
		@Pc(21) double local21 = (double) (this.aFloatArray111[0] + 1.0F + this.aFloatArray111[4] + this.aFloatArray111[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[7] - this.aFloatArray111[5]) / local31;
			local3.aFloat286 = (this.aFloatArray111[2] - this.aFloatArray111[6]) / local31;
			local3.aFloat285 = (this.aFloatArray111[3] - this.aFloatArray111[1]) / local31;
			local3.aFloat283 = local31 * 0.25F;
		} else if (this.aFloatArray111[0] > this.aFloatArray111[4] && this.aFloatArray111[0] > this.aFloatArray111[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[0] + 1.0F - this.aFloatArray111[4] - this.aFloatArray111[8])) * 2.0D);
			local3.aFloat284 = local31 * 0.25F;
			local3.aFloat286 = (this.aFloatArray111[3] + this.aFloatArray111[1]) / local31;
			local3.aFloat285 = (this.aFloatArray111[2] + this.aFloatArray111[6]) / local31;
			local3.aFloat283 = (this.aFloatArray111[7] - this.aFloatArray111[5]) / local31;
		} else if (this.aFloatArray111[4] > this.aFloatArray111[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[4] + 1.0F - this.aFloatArray111[0] - this.aFloatArray111[8])) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[3] + this.aFloatArray111[1]) / local31;
			local3.aFloat286 = local31 * 0.25F;
			local3.aFloat285 = (this.aFloatArray111[7] + this.aFloatArray111[5]) / local31;
			local3.aFloat283 = (this.aFloatArray111[2] - this.aFloatArray111[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[8] + 1.0F - this.aFloatArray111[0] - this.aFloatArray111[4])) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[2] + this.aFloatArray111[6]) / local31;
			local3.aFloat286 = (this.aFloatArray111[7] + this.aFloatArray111[5]) / local31;
			local3.aFloat285 = local31 * 0.25F;
			local3.aFloat283 = (this.aFloatArray111[3] - this.aFloatArray111[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!os", name = "v", descriptor = "()Lclient!ot;", line = 11)
	public Class452 method29262() {
		@Pc(3) Class452 local3 = new Class452();
		@Pc(21) double local21 = (double) (this.aFloatArray111[0] + 1.0F + this.aFloatArray111[4] + this.aFloatArray111[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[7] - this.aFloatArray111[5]) / local31;
			local3.aFloat286 = (this.aFloatArray111[2] - this.aFloatArray111[6]) / local31;
			local3.aFloat285 = (this.aFloatArray111[3] - this.aFloatArray111[1]) / local31;
			local3.aFloat283 = local31 * 0.25F;
		} else if (this.aFloatArray111[0] > this.aFloatArray111[4] && this.aFloatArray111[0] > this.aFloatArray111[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[0] + 1.0F - this.aFloatArray111[4] - this.aFloatArray111[8])) * 2.0D);
			local3.aFloat284 = local31 * 0.25F;
			local3.aFloat286 = (this.aFloatArray111[3] + this.aFloatArray111[1]) / local31;
			local3.aFloat285 = (this.aFloatArray111[2] + this.aFloatArray111[6]) / local31;
			local3.aFloat283 = (this.aFloatArray111[7] - this.aFloatArray111[5]) / local31;
		} else if (this.aFloatArray111[4] > this.aFloatArray111[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[4] + 1.0F - this.aFloatArray111[0] - this.aFloatArray111[8])) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[3] + this.aFloatArray111[1]) / local31;
			local3.aFloat286 = local31 * 0.25F;
			local3.aFloat285 = (this.aFloatArray111[7] + this.aFloatArray111[5]) / local31;
			local3.aFloat283 = (this.aFloatArray111[2] - this.aFloatArray111[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[8] + 1.0F - this.aFloatArray111[0] - this.aFloatArray111[4])) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[2] + this.aFloatArray111[6]) / local31;
			local3.aFloat286 = (this.aFloatArray111[7] + this.aFloatArray111[5]) / local31;
			local3.aFloat285 = local31 * 0.25F;
			local3.aFloat283 = (this.aFloatArray111[3] - this.aFloatArray111[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!os", name = "l", descriptor = "()Lclient!ot;", line = 11)
	public Class452 method29263() {
		@Pc(3) Class452 local3 = new Class452();
		@Pc(21) double local21 = (double) (this.aFloatArray111[0] + 1.0F + this.aFloatArray111[4] + this.aFloatArray111[8]);
		@Pc(31) float local31;
		if (local21 > 1.0E-8D) {
			local31 = (float) (Math.sqrt(local21) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[7] - this.aFloatArray111[5]) / local31;
			local3.aFloat286 = (this.aFloatArray111[2] - this.aFloatArray111[6]) / local31;
			local3.aFloat285 = (this.aFloatArray111[3] - this.aFloatArray111[1]) / local31;
			local3.aFloat283 = local31 * 0.25F;
		} else if (this.aFloatArray111[0] > this.aFloatArray111[4] && this.aFloatArray111[0] > this.aFloatArray111[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[0] + 1.0F - this.aFloatArray111[4] - this.aFloatArray111[8])) * 2.0D);
			local3.aFloat284 = local31 * 0.25F;
			local3.aFloat286 = (this.aFloatArray111[3] + this.aFloatArray111[1]) / local31;
			local3.aFloat285 = (this.aFloatArray111[2] + this.aFloatArray111[6]) / local31;
			local3.aFloat283 = (this.aFloatArray111[7] - this.aFloatArray111[5]) / local31;
		} else if (this.aFloatArray111[4] > this.aFloatArray111[8]) {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[4] + 1.0F - this.aFloatArray111[0] - this.aFloatArray111[8])) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[3] + this.aFloatArray111[1]) / local31;
			local3.aFloat286 = local31 * 0.25F;
			local3.aFloat285 = (this.aFloatArray111[7] + this.aFloatArray111[5]) / local31;
			local3.aFloat283 = (this.aFloatArray111[2] - this.aFloatArray111[6]) / local31;
		} else {
			local31 = (float) (Math.sqrt((double) (this.aFloatArray111[8] + 1.0F - this.aFloatArray111[0] - this.aFloatArray111[4])) * 2.0D);
			local3.aFloat284 = (this.aFloatArray111[2] + this.aFloatArray111[6]) / local31;
			local3.aFloat286 = (this.aFloatArray111[7] + this.aFloatArray111[5]) / local31;
			local3.aFloat285 = local31 * 0.25F;
			local3.aFloat283 = (this.aFloatArray111[3] - this.aFloatArray111[1]) / local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!os", name = "w", descriptor = "()V", line = 47)
	void method29264() {
		this.aFloatArray111[0] = 1.0F;
		this.aFloatArray111[1] = 0.0F;
		this.aFloatArray111[2] = 0.0F;
		this.aFloatArray111[3] = 0.0F;
		this.aFloatArray111[4] = 1.0F;
		this.aFloatArray111[5] = 0.0F;
		this.aFloatArray111[6] = 0.0F;
		this.aFloatArray111[7] = 0.0F;
		this.aFloatArray111[8] = 1.0F;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "()V", line = 47)
	void method29265() {
		this.aFloatArray111[0] = 1.0F;
		this.aFloatArray111[1] = 0.0F;
		this.aFloatArray111[2] = 0.0F;
		this.aFloatArray111[3] = 0.0F;
		this.aFloatArray111[4] = 1.0F;
		this.aFloatArray111[5] = 0.0F;
		this.aFloatArray111[6] = 0.0F;
		this.aFloatArray111[7] = 0.0F;
		this.aFloatArray111[8] = 1.0F;
	}
}
