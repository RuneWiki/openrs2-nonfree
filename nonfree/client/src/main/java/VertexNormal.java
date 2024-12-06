import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class37 {

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	public int anInt1755;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	public int anInt1756;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public int anInt1759;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public int anInt1761;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class37() {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!kb;)V")
	public Class37(@OriginalArg(0) Class37 arg0) {
		this.anInt1755 = arg0.anInt1755;
		this.anInt1759 = arg0.anInt1759;
		this.anInt1761 = arg0.anInt1761;
		this.anInt1756 = arg0.anInt1756;
	}
}
