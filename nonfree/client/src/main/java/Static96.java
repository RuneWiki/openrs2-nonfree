import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()V")
	public static void method1770() {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glClientActiveTexture(method1772());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "()I")
	public static int method1772() {
		return aBoolean155 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "()V")
	public static void method1773() {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glClientActiveTexture(method1772());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}
}
