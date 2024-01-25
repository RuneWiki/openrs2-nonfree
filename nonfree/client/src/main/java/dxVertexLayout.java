import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class94 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "c", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!hl;[Lclient!tg;)V")
	public dxVertexLayout(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class325[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aRh1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class325 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local27 < local25.method7653(); local27++) {
				@Pc(37) Class349 local37 = local25.method7652(local27);
				if (local37 == Static589.aClass349_1) {
					local7.addElement(local11, 2, 0, 0, 0, local21);
				} else if (Static589.aClass349_2 == local37) {
					local7.addElement(local11, 2, 0, 3, 0, local21);
				} else if (Static589.aClass349_3 == local37) {
					local7.addElement(local11, 4, 0, 10, 0, local21);
				} else if (local37 == Static589.aClass349_4) {
					local7.addElement(local11, 0, 0, 5, local9++, local21);
				} else if (Static589.aClass349_5 == local37) {
					local7.addElement(local11, 1, 0, 5, local9++, local21);
				} else if (local37 == Static589.aClass349_6) {
					local7.addElement(local11, 2, 0, 5, local9++, local21);
				} else if (local37 == Static589.aClass349_7) {
					local7.addElement(local11, 3, 0, 5, local9++, local21);
				}
				local21 += local37.anInt10052;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
