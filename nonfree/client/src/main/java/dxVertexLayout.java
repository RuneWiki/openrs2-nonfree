import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class46 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "e", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!ad;[Lclient!en;)V")
	public dxVertexLayout(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) Class93[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.anEp1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class93 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method2528(); local23++) {
				@Pc(37) Class131 local37 = local21.method2529(local23);
				if (local37 == Static196.aClass131_1) {
					local7.addElement(local11, 2, 0, 0, 0, local17);
				} else if (Static196.aClass131_2 == local37) {
					local7.addElement(local11, 2, 0, 3, 0, local17);
				} else if (local37 == Static196.aClass131_3) {
					local7.addElement(local11, 4, 0, 10, 0, local17);
				} else if (local37 == Static196.aClass131_4) {
					local7.addElement(local11, 0, 0, 5, local9++, local17);
				} else if (Static196.aClass131_5 == local37) {
					local7.addElement(local11, 1, 0, 5, local9++, local17);
				} else if (Static196.aClass131_6 == local37) {
					local7.addElement(local11, 2, 0, 5, local9++, local17);
				} else if (local37 == Static196.aClass131_7) {
					local7.addElement(local11, 3, 0, 5, local9++, local17);
				}
				local17 += local37.anInt3838;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
